
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Main2 {

	public static void main(String[] args) {
		a();
	}

	static void a() {

		var out = System.out;
		var in = new Scanner(System.in);
		var n = Integer.valueOf(in.nextLine());
		var action = (IntConsumer) (i) -> {

			var name = in.nextLine().toUpperCase();

			if ("YES".equals(name)) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		};
		IntStream.range(0, n).forEach(action);
		out.flush();
	}
}
