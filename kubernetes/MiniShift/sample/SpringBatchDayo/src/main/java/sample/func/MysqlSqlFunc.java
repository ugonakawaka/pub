package sample.func;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.jdbc.core.DataClassRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import lombok.Data;
import sample.Main10.COLUMNS;

public class MysqlSqlFunc {

	public interface GenerateSql {
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

	public static String makeSelectTableColumnSql() {

		final StringBuilder builder = new StringBuilder();
		builder.append("SELECT");
		builder.append(" TABLE_SCHEMA");
		builder.append(", TABLE_NAME");
		builder.append(", COLUMN_NAME");
		builder.append(", COLUMN_TYPE");
		builder.append(", ORDINAL_POSITION");
		builder.append(", IS_NULLABLE");
		builder.append(", COLUMN_KEY");
		builder.append(", COLUMN_DEFAULT");
		builder.append(", EXTRA");
		builder.append(", GENERATION_EXPRESSION");
		builder.append(" ");
		builder.append("FROM");
		builder.append("  INFORMATION_SCHEMA.COLUMNS");
		builder.append(" ");
		builder.append("WHERE");
		builder.append("  TABLE_SCHEMA = ?");
		builder.append("  AND TABLE_NAME = ?");

		return builder.toString();

	}

	public static String generateSelectOrderByLimitSql(String tableName, List<COLUMNS> list) {

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

	public static String generateNamedParameterInsertSql(String tableName, List<COLUMNS> list) {

		final String joinedColumnNames = list.stream().map(COLUMNS::getCOLUMN_NAME).collect(Collectors.joining(","));

		final String joinedParaColumnsNames = list.stream().map(cs -> {
			return ":" + cs.getCOLUMN_NAME();
		}).collect(Collectors.joining(","));

		final StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO ").append(tableName).append(" ");
		builder.append("(");
		builder.append(joinedColumnNames);
		builder.append(") ");
		builder.append("VALUES(");
		builder.append(joinedParaColumnsNames).append(") ");

		return builder.toString();
	}

	public static GenerateSql getGenerateSelectSql() {
		return (jdbcTemplate, schemaName, tableName) -> {

			final PreparedStatementSetter preparedStatementSetter = new PreparedStatementSetter() {
				public void setValues(PreparedStatement preparedStatement) throws SQLException {
					preparedStatement.setString(1, schemaName);
					preparedStatement.setString(2, tableName);
				}
			};

			final RowMapper<COLUMNS> rowMapper = new DataClassRowMapper<>(COLUMNS.class);
			final List<COLUMNS> a = jdbcTemplate.query(makeSelectTableColumnSql(), preparedStatementSetter, rowMapper);

			return generateSelectOrderByLimitSql(tableName, a);
		};
	}

	public static GenerateSql getGenerateInsertSql() {
		return (jdbcTemplate, schemaName, tableName) -> {

			final PreparedStatementSetter preparedStatementSetter = new PreparedStatementSetter() {
				public void setValues(PreparedStatement preparedStatement) throws SQLException {
					preparedStatement.setString(1, schemaName);
					preparedStatement.setString(2, tableName);
				}
			};

			final RowMapper<COLUMNS> rowMapper = new DataClassRowMapper<>(COLUMNS.class);
			List<COLUMNS> a = jdbcTemplate.query(makeSelectTableColumnSql(), preparedStatementSetter, rowMapper);

			return generateNamedParameterInsertSql(tableName, a);
		};
	}

}
