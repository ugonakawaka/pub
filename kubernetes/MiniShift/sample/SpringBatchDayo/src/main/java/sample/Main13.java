package sample;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import sample.config.DataSourceConfiguration;
import sample.config.EnvironmentConfiguration;
import sample.config.JdbcTemplateConfiguration;
import sample.config.SpringBatchConfig;
import sample.func.JdbcTemplateFunc;
import sample.func.MysqlSqlFunc;
import sample.func.MysqlSqlFunc.GenerateSql;

public class Main13 {


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

		final GenerateSql generateSelectSql = MysqlSqlFunc.getGenerateSelectSql();
		final GenerateSql generateInsertSql = MysqlSqlFunc.getGenerateInsertSql();
	

		final int FETCH_SIZE = 1000;
		IntStream.range(0, 11).forEach(i->{
			
			int pos = (i * FETCH_SIZE);
			final Function<String, List<Map<String, Object>>> selectFrom = (sql) -> {
				return jdbcTemplate01.queryForList(sql, pos, FETCH_SIZE);
			};


			final String tableName = "employees";
			final String sqlSelect = generateSelectSql.get(jdbcTemplate01, "employees", tableName);
			final String sqlInsert = generateInsertSql.get(jdbcTemplate02, "employees2", tableName);

			System.out.println("==========>" + sqlSelect);
			System.out.println("==========>" + sqlInsert);

			List<Map<String, Object>> list = selectFrom.apply(sqlSelect);
			int[] is = JdbcTemplateFunc.namedParameterJdbcTemplate().apply(jdbcTemplate02, sqlInsert, list);
			System.out.println(is.length);
		});
		
		
	
		// IntStream.of(is).forEach(System.out::println);

	}

}
