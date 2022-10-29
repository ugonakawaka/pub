package a08_annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 参考)
// https://github.com/katohideyuki/JavaGold/tree/main/Study/08/chapter_04
public class Chap04_NotNulllValidator {

	@Target(ElementType.FIELD) // フィールドに付与されるアノテーションということ
	@Retention(RetentionPolicy.RUNTIME)
	public @interface NotNull {
		String message();
	}

	static class NotNullValidator {

		public static <T> List<String> validate(T target) {
			try {
				List<String> messageList = new ArrayList<>();
				Class clazz = target.getClass();
				Field[] fields = clazz.getDeclaredFields();
				for (Field field : fields) {
					field.setAccessible(true);
					var annotation = field.getAnnotation(NotNull.class);

					if (annotation == null) {
						continue;
					}

					if (field.get(target) != null) {
						continue;
					}
					messageList.add(annotation.message());
				}
				return messageList;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

	// =======
	static class Item {
		@NotNull(message = "a")
		String a;
		@NotNull(message = "b ")
		Integer b;

	}

	public static void main(String[] args) {
		Item item = new Item();
		{
			var messages = NotNullValidator.validate(item);
			System.out.println(messages);
		}

	}
}
