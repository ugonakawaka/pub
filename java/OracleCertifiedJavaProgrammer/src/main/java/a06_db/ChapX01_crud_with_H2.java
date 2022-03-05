package a06_db;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.IntStream;

import org.h2.jdbcx.JdbcConnectionPool;
import org.h2.tools.RunScript;

// 簡単なサンプル
// staticにこだわる必要はないのだけど...
public class ChapX01_crud_with_H2 {

	public static final String URL = "jdbc:h2:mem:testdb";
	public static final String USER = "sa";
	public static final String PASSWORD = "sa";

	static JdbcConnectionPool jdbcConnectionPool;

	static Connection pool() throws SQLException, IOException {
		if (jdbcConnectionPool == null) {
			jdbcConnectionPool = JdbcConnectionPool.create(URL, USER, PASSWORD);
			// Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			var fpath = Paths.get("scripts", "test.sql");

			RunScript.execute(jdbcConnectionPool.getConnection(), Files.newBufferedReader(fpath));
		}
		return jdbcConnectionPool.getConnection();
	}

	static Connection connect() throws SQLException, IOException {
		return pool();
	}

	public static void main(String[] args) throws SQLException, IOException {
		connect();

		$resultset print = r -> {
			while (r.next()) {
				System.out.printf("%s %s %s%n", r.getObject(1), r.getObject(2), r.getObject(3));
			}
		};

		select("select id, comment, time from aaa", print);
		insert("insert into aaa(comment, time) values(?, CURRENT_TIMESTAMP())", pstatement -> {
			pstatement.setString(1, "こめんどだよ");
		});
		select("select id, comment, time from aaa", print);
		delete("delete from aaa where id=?", pstatement -> {
			pstatement.setInt(1, 1);
		});
		update("update aaa set comment=?, time=CURRENT_TIMESTAMP() where id=?", pstatement -> {
			pstatement.setString(1, "updateだよ");
			pstatement.setInt(2, 2);
		});
		select("select id, comment, time from aaa", print);
		update("update aaa set comment=?, time=CURRENT_TIMESTAMP() where id=?", $pstatement("update3", 3));
		select("select id, comment, time from aaa", print);
		delete("delete from aaa", $pstatement());
		select("select id, comment, time from aaa", print);

		// executeBatch
		// 10件 insert
		insertBatch("insert into aaa(comment, time) values(?, CURRENT_TIMESTAMP())", pstatement -> {
			for (int i = 0; i < 10; i++) {
				pstatement.setString(1, "こめんどだよ" + 1);
				pstatement.addBatch();
			}
		});

		select("select id, comment, time from aaa", print);

	}

	@FunctionalInterface
	interface $resultset {
		void exec(ResultSet r) throws SQLException;
	}

	@FunctionalInterface
	interface $pstatement {
		void exec(PreparedStatement pstatement) throws SQLException;
	}

	static $pstatement $pstatement(Object... arr) {
		return $ -> {
			int c = 1;
			for (Object o : arr) {
				$.setObject(c++, o);
			}
		};
	}

	static void select(String sql, $resultset $) throws SQLException, IOException {

		try (Connection conn = connect()) {
			try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
				preparedStatement.execute();
				var resultSet = preparedStatement.getResultSet();
				$.exec(resultSet);

			}

		}
	}

	static int executeUpdate(String sql, $pstatement $) throws SQLException, IOException {
		try (Connection conn = connect()) {
			try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
				$.exec(preparedStatement);
				return preparedStatement.executeUpdate();
			}

		}
	}

	static int[] executeBatch(String sql, $pstatement $) throws SQLException, IOException {
		try (Connection conn = connect()) {
			try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
				$.exec(preparedStatement);
				return preparedStatement.executeBatch();
			}

		}
	}
	// ================

	static int update(String sql, $pstatement $) throws SQLException, IOException {
		return executeUpdate(sql, $);
	}

	static int delete(String sql, $pstatement $) throws SQLException, IOException {
		return executeUpdate(sql, $);
	}

	static int insert(String sql, $pstatement $) throws SQLException, IOException {
		return executeUpdate(sql, $);
	}

	// ================
	static int[] insertBatch(String sql, $pstatement $) throws SQLException, IOException {
		return executeBatch(sql, $);
	}
}
