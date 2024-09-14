package jackson;

import java.io.IOException;
import java.util.EnumSet;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

import jackson.MainNull.Hoge4;
import lombok.Data;

public class MainEnum {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		a();
	}

	enum EnumSex {
		// https://ja.wikipedia.org/wiki/ISO_5218
		NOT_KNOWN("0", "不明"), MALE("1", "男性"), FEMALE("2", "女性"), NOT_APPLICABLE("9", "適用不能");

		final String code;
		final String text;

		EnumSex(String code, String text) {
			this.code = code;
			this.text = text;
		}
	}

	@Data
	static public class Hoge {
		EnumSex sex;
		String name;
	}

	/*
	 * enumのほうにjsonにしたときの出力ルールをたす この方法は、enumに全部つけないとだめか...
	 * 
	 */
	enum EnumSex2 implements JsonSerializable {
		// https://ja.wikipedia.org/wiki/ISO_5218
		NOT_KNOWN("0", "不明"), MALE("1", "男性"), FEMALE("2", "女性"), NOT_APPLICABLE("9", "適用不能");

		final String code;
		final String text;

		EnumSex2(String code, String text) {
			this.code = code;
			this.text = text;
		}

		public static EnumSex2 fromCode(String code) {
			// 都度検索するやりかた
			return EnumSet.allOf(EnumSex2.class).stream().filter(n -> n.code.equals(code)).findFirst().orElseThrow();
		}

		@Override
		public void serialize(JsonGenerator gen, SerializerProvider serializers) throws IOException {
			gen.writeNumber(code);
		}

		@Override
		public void serializeWithType(JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer)
				throws IOException {
			gen.writeNumber(code);
		}
	}

	static class EnumSex2Deserializer extends JsonDeserializer<EnumSex2> {

		// Jackson による JSON 解析時に、整数値から Type オブジェクトを生成する

		@Override
		public EnumSex2 deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
			System.out.println(p.getText());
			return EnumSex2.fromCode(p.getText());
		}
	}

	@Data
	static public class Hoge2 {
		@JsonDeserialize(using = EnumSex2Deserializer.class)
		EnumSex2 sex;
		String name;

	}

	static void a() throws JsonMappingException, JsonProcessingException {

		{
			{// コード値とのマッピング、enumの序数であることに注意

				var json = """
						{"sex":"0"}
						""";
				var objectMapper = new ObjectMapper();
				var hoge = objectMapper.readValue(json, Hoge.class);
				System.out.println(hoge);
			}
			{// コード値とのマッピング、enumの序数であることに注意

				var json = """
						{"sex":"1"}
						""";
				var objectMapper = new ObjectMapper();
				var hoge = objectMapper.readValue(json, Hoge.class);
				System.out.println(hoge);
			}

			{// コード値とのマッピング、Deserializerを用意する

				var json = """
						{"sex":"9"}
						""";
				var objectMapper = new ObjectMapper();
				var hoge = objectMapper.readValue(json, Hoge2.class);
				System.out.println(hoge);
			}
			{
				var hoge2 = new Hoge2();
				hoge2.sex = EnumSex2.FEMALE;
				hoge2.name = "test";
				var objectMapper = new ObjectMapper();
				var jsonAsString = objectMapper.writeValueAsString(hoge2);
				
				// コード値で出力される
				System.out.println(jsonAsString);
			}
		}
	}
}
