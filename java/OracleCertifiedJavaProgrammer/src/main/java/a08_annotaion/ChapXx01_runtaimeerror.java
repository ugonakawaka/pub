package a08_annotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ChapXx01_runtaimeerror {

	static class Item {
		@NotNull(message = Consts.AAA, message2 = Message.MSG1, message3 = { Message.MSG1, Message.MSG2 })
		String a;

		// 実行時エラー
		// コンパイルはできるみたいだけど、実行時にエラーになる
		@NotNull(message = "b", message2 = Message.MSG3, message3 = Message.msgs)
		Integer b;

	}

	static class Consts {
		public static final String AAA = "AAA";
	}

	public static enum Message {
		MSG1("nullだよ"), MSG2("nullだっちゅうねん"), MSG3("nullがはいってます...");

		public final static Message[] msgs = { MSG1, MSG2, MSG3 };

		private final String msg;

		private Message(String msg) {
			this.msg = msg;
		}

		public String msg() {
			return msg;
		}

	}

	public static void main(String[] args) {
		// Message.MSG1.
		// Message.MSG1.msg();
		System.out.println(Message.MSG1.msg());
		Item item = new Item();
		{
			var messages = NotNullValidator.validate(item);
			System.out.println(messages);
		}
	}

	// =======================
	// =======================
	// =======================

	@Target(ElementType.FIELD) // フィールドに付与されるアノテーションということ
	@Retention(RetentionPolicy.RUNTIME) // 注釈保持ポリシー
	public @interface NotNull {
		String message();

		Message message2();

		Message[] message3();
	}

	static class NotNullValidator {

		public static <T> List<String> validate(T target) {
			try {
				List<String> messageList = new ArrayList<>();
				Class clazz = target.getClass();
				Field[] fields = clazz.getDeclaredFields();
				for (Field field : fields) {
					field.setAccessible(true);
					// 実行時エラー
					// Exception in thread "main" java.lang.annotation.AnnotationFormatError:
					// Unexpected end of annotations.
					var anntaion = field.getAnnotation(NotNull.class);

					if (anntaion == null) {
						continue;
					}

					if (field.get(target) != null) {
						continue;
					}
					messageList.add(anntaion.message());
				}
				return messageList;
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
}
