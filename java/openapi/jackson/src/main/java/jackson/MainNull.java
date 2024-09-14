package jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

public class MainNull {

	@Data
	public static class Hoge {
		private int id;// idはintなのでデフォルト0がでる
		private String type;
	}

	@Data
	public static class Hoge2 {
		@JsonInclude(JsonInclude.Include.NON_NULL)
		private Integer id;
		@JsonInclude(JsonInclude.Include.NON_NULL)
		private String type;
	}

	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	@Data
	public static class Hoge3 {
		private Integer id;
		private String type;
	}

	@JsonIgnoreProperties(ignoreUnknown = true)
	@Data
	public static class Hoge4 {
		private Integer id;
		private String type;
	}

	public static void main(String[] args) throws JsonProcessingException {
		a();
	}

	static void a() throws JsonProcessingException {

		{ // objectからjson
			{
				var objectMapper = new ObjectMapper();
				var hoge = new Hoge();
				var jsonAsString = objectMapper.writeValueAsString(hoge);
				System.out.println(jsonAsString);

			}
			{// 値がない場合、出力しない
				var objectMapper = new ObjectMapper();
				objectMapper.setSerializationInclusion(Include.NON_NULL);
				var hoge = new Hoge();
				var jsonAsString = objectMapper.writeValueAsString(hoge);
				System.out.println(jsonAsString);

			}
			{ // 値がない場合、出力しない
				// データクラスにアノテーション
				var objectMapper = new ObjectMapper();
				// objectMapper.
				var hoge = new Hoge2();
				var jsonAsString = objectMapper.writeValueAsString(hoge);
				System.out.println(jsonAsString);
			}
			{ // 値がない場合、出力しない
				// データクラスにアノテーション
				var objectMapper = new ObjectMapper();
				// objectMapper.
				var hoge = new Hoge3();
				var jsonAsString = objectMapper.writeValueAsString(hoge);
				System.out.println(jsonAsString);
			}
		}

		{ // jsonからobject
			{
				var json = """
						{"id":0,"type":null}
						""";
				var objectMapper = new ObjectMapper();
				var hoge = objectMapper.readValue(json, Hoge.class);
				System.out.println(hoge);
			}
			{ // 空のjsonからのマッピング
				var json = """
						{}
						""";
				var objectMapper = new ObjectMapper();
				var hoge = objectMapper.readValue(json, Hoge.class);
				System.out.println(hoge);
			}
			{ // 存在しないプロパティからのマッピング
				// UnrecognizedPropertyExceptionが発生するがObjectMapperで回避
				var json = """
						{"aaa":"aaa"}
						""";
				var objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				var hoge = objectMapper.readValue(json, Hoge.class);
				System.out.println(hoge);
			}
			{// 存在しないプロパティからのマッピング
				// UnrecognizedPropertyExceptionが発生するがデータクラスにアノテーションをつけて回避
				var json = """
						{"aaa":"aaa"}
						""";
				var objectMapper = new ObjectMapper();
				var hoge = objectMapper.readValue(json, Hoge4.class);
				System.out.println(hoge);

			}
		}
	}
}
