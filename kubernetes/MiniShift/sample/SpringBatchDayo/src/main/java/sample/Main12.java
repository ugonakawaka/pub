package sample;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.style.ToStringCreator;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;

import lombok.Data;
import sample.Main10.COLUMNS;
import sample.config.DataSourceConfiguration;
import sample.config.EnvironmentConfiguration;
import sample.config.JdbcTemplateConfiguration;
import sample.config.SpringBatchConfig;

public class Main12 {

	
	
	interface GenerateSql {
		public String get(JdbcTemplate jdbcTemplate, String schemaeName, String tableName);
	}
	
	
	@Data
	public static class COLUMNS {

		public String TABLE_SCHEMA;
		public String COLUMN_NAME;
		public String COLUMN_TYPE;
		public String ORDINAL_POSITION;
		public String COLUMN_KEY;

	}

	static String generateSelectSql(String tableName, List<COLUMNS> list) {

		final String joinedColumnNames = list.stream().map(COLUMNS::getCOLUMN_NAME).collect(Collectors.joining(","));

		final String[] orderBy = list.stream().filter(col -> "PRI".equals(col.COLUMN_KEY)).map(COLUMNS::getCOLUMN_NAME)
				.toArray(String[]::new);

		final String sOrderBy = String.join(",", orderBy);

		final StringBuilder builder = new StringBuilder();
		builder.append("SELECT ");
		builder.append(joinedColumnNames).append(" ");
		builder.append("FROM ").append(tableName).append(" ");
		if (orderBy.length != 0) {
			builder.append("ORDER BY ").append(sOrderBy).append(" ");
		}
		builder.append("LIMIT ?, ? ");
		return builder.toString();
	}

	static String generateInsertSql(String tableName, List<COLUMNS> list) {

		final String joinedColumnNames = list.stream().map(COLUMNS::getCOLUMN_NAME).collect(Collectors.joining(","));
		
		final String joinedParaColumnsNames = list.stream().map(cs -> {
			return ":" + cs.getCOLUMN_NAME();
		}).collect(Collectors.joining(","));
		// final String sColumnsName = String.join(",", columnNames);

		final StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO ").append(tableName).append(" ");
		builder.append("(");
		builder.append(joinedColumnNames);
		builder.append(") ");
		builder.append("VALUES(");
		builder.append(joinedParaColumnsNames).append(") ");

		return builder.toString();
	}

	static String makeSqlSelectTableColumn() {

		String sql = "SELECT" + //
				" TABLE_SCHEMA" + //
				", TABLE_NAME" + //
				", COLUMN_NAME" + //
				", COLUMN_TYPE" + //
				", ORDINAL_POSITION" + //
				", IS_NULLABLE" + //
				", COLUMN_KEY" + //
				", COLUMN_DEFAULT" + //
				", EXTRA" + //
				", GENERATION_EXPRESSION " + //
				"FROM" + //
				"  INFORMATION_SCHEMA.COLUMNS " + //
				"WHERE" + //
				"  TABLE_SCHEMA = ?" + //
				"  AND TABLE_NAME = ?" + //
				"";

		return sql;

	}

	public static void main(String[] args) throws ClassNotFoundException {

		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(SpringBatchConfig.class);
		context.register(DataSourceConfiguration.class);
		context.register(EnvironmentConfiguration.class);
		context.register(JdbcTemplateConfiguration.class);
		context.scan("sample.custom");
		context.refresh();

		final JdbcTemplate jdbcTemplate01 = (JdbcTemplate) context.getBean("jdbcTemplate01");
		final JdbcTemplate jdbcTemplate02 = (JdbcTemplate) context.getBean("jdbcTemplate02");

		final GenerateSql generateSelectSql = (jdbcTemplate, schemaName, tableName) -> {

			final PreparedStatementSetter preparedStatementSetter = new PreparedStatementSetter() {
				public void setValues(PreparedStatement preparedStatement) throws SQLException {
					preparedStatement.setString(1, schemaName);
					preparedStatement.setString(2, tableName);
				}
			};

			final RowMapper<COLUMNS> rowMapper = new DataClassRowMapper<>(COLUMNS.class);
			final List<COLUMNS> a = jdbcTemplate.query(makeSqlSelectTableColumn(), preparedStatementSetter, rowMapper);
		
			return generateSelectSql(tableName, a);
		};
		
		final GenerateSql generateInsertSql = (jdbcTemplate, schemaName, tableName) -> {

			final PreparedStatementSetter preparedStatementSetter = new PreparedStatementSetter() {
				public void setValues(PreparedStatement preparedStatement) throws SQLException {
					preparedStatement.setString(1, schemaName);
					preparedStatement.setString(2, tableName);
				}
			};

			final RowMapper<COLUMNS> rowMapper = new DataClassRowMapper<>(COLUMNS.class);
			List<COLUMNS> a = jdbcTemplate.query(makeSqlSelectTableColumn(), preparedStatementSetter, rowMapper);
			// System.out.println(a);
			String sql = generateInsertSql(tableName, a);
			return sql;
		};

		Function<String, List<Map<String, Object>>> selectFrom = (sql) -> {
			return jdbcTemplate01.queryForList(sql, 1, 100);
		};

		BiFunction<String, List<Map<String, Object>>, int[]> insertInto = (sql, list) -> {
			
			final NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(jdbcTemplate02.getDataSource());

			@SuppressWarnings("unchecked")
			Map<String, Object>[] maps = list.toArray(new Map[list.size()]);
			
			int[] is = namedParameterJdbcTemplate.batchUpdate(sql, maps);
			return is; 
		};
		
		
		final List<Map<String, Object>> listTable = jdbcTemplate01.queryForList(
				"select TABLE_SCHEMA ,TABLE_NAME, TABLE_TYPE from INFORMATION_SCHEMA.TABLES where TABLE_SCHEMA = 'employees' AND TABLE_TYPE <> 'VIEW'");
		// select TABLE_SCHEMA ,TABLE_NAME, TABLE_TYPE from INFORMATION_SCHEMA.TABLES where TABLE_TYPE <> 'VIEW'; 

		final String tableName = "employees";
		final String sqlSelect = generateSelectSql.get(jdbcTemplate01, "employees", tableName);
		final String sqlInsert = generateInsertSql.get(jdbcTemplate02, "employees2", tableName);

		
		System.out.println("==========>" + sqlSelect);
		System.out.println("==========>" + sqlInsert);
		
		List<Map<String, Object>> list = selectFrom.apply(sqlSelect);
		int[] is = insertInto.apply(sqlInsert, list);
		System.out.println(is.length);
		// IntStream.of(is).forEach(System.out::println);
		
	}

}
