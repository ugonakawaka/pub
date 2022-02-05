package a05_io;

import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

// 参考)
// https://github.com/katohideyuki/JavaGold/tree/main/Study/05/chapter_15
public class Chap15_copy_and_move {

	static final Predicate<Path> CHECK = Files::exists;

	public static void main(String[] args) throws Throwable {
		// コンシューマーのandThenを意識してみた
		//
		Consumer<PrintStream> consumer1 = ps -> ps.println("ABC");
		Consumer<PrintStream> consumer2 = ps -> ps.println("DEF");
		consumer1.andThen(consumer2).accept(System.out);

		Path src = Paths.get("tmp", "src.txt");
		Path dst = Paths.get("tmp", "dst.txt");
		test(src, dst);

	}

	@FunctionalInterface
	public static interface SideEffectDoit0 {
		void exec() throws Throwable;

		default SideEffectDoit0 andThen(SideEffectDoit0 after) {
			System.out.println("** ok2");
			Objects.requireNonNull(after);
			return () -> {
				exec();
				after.exec();
			};
		}

	}

	static SideEffectDoit0 ifThen(boolean b, SideEffectDoit0 a1) throws Throwable {

		return () -> {

			if (b)
				a1.exec();
		};
	}

	// コピー元がなければ、空のコピー元ファイルを作成してからコピーする
	// コピーができたら元のファイルを削除するよ
	public static void test(Path src, Path dst) throws Throwable {
		var b0 = CHECK.test(dst); // dstファイルがないか
		var b1 = !CHECK.test(src); // srcファイルがないか

		// copy file
		final SideEffectDoit0 copy = () -> {
			Files.copy(src, dst);
		};
		// create file
		final SideEffectDoit0 createSrc = () -> {
			Files.createFile(src);
		};
		// delete file
		final SideEffectDoit0 deleteSrc = () -> {
			Files.delete(src);
		};
		// delete file
		final SideEffectDoit0 deleteDst = () -> {
			Files.delete(dst);
		};
		ifThen(b0, deleteDst).andThen(ifThen(b1, createSrc).andThen(copy).andThen(deleteSrc)).exec();

	}

}
