package sample.utils;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class JdbcTemplateHelperUtils {

	public interface Func {
		public int[] apply(JdbcTemplate jdbcTemplate, String sql, List<Map<String, Object>> list);
	}

	public static Func namedParameterJdbcTemplate() {
		return (jdbcTemplate, sql, list) -> {

			final NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(
					jdbcTemplate.getDataSource());

			@SuppressWarnings("unchecked")
			Map<String, Object>[] maps = list.toArray(new Map[list.size()]);

			int[] is = namedParameterJdbcTemplate.batchUpdate(sql, maps);
			return is;
		};
	}
}
