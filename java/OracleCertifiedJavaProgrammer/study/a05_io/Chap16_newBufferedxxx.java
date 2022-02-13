package a05_io;

import java.io.Console;
import java.io.IOException;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Chap16_newBufferedxxx {

	public static void main(String[] args) throws IOException {
		var fpath = Paths.get("tmp", "aaa.txt");

		aシナリオ(fpath);
		// aシナリオ2(fpath);
	}

	static void aシナリオ(Path fpath) throws IOException {
		// 引数で指定されたファイルひらく
		// ファイルがなければ作成する
		// ファイルをリーダーでひらく
		// スキャナで入力まち
		// 入力したらファイルに出力
		{
			boolean b = Files.exists(fpath);
			if (!b) {
				Files.createFile(fpath);
			}
		}

		try (var bufw = Files.newBufferedWriter(fpath, StandardOpenOption.APPEND)) {

			try (Scanner scanner = new Scanner(System.in)) {
				do {
					System.out.print(">");
					String line = scanner.next();
					bufw.write(line);
					bufw.newLine();
					bufw.flush();
				} while (true);
			}
		}

	}

	static void watch(Path dpath) throws IOException {

		Runnable runnable = () -> {
			try (WatchService watcher = FileSystems.getDefault().newWatchService()) {
				dpath.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
						StandardWatchEventKinds.ENTRY_MODIFY);
				while (true) {
					try {
						// WatchKey watchKey = watcher.poll(100, TimeUnit.MILLISECONDS);
						WatchKey watchKey = watcher.take();

						for (WatchEvent<?> event : watchKey.pollEvents()) {
							Kind<?> kind = event.kind();
							Object context = event.context();
							System.out.println("kind=" + kind + ", context=" + context);
						}
						watchKey.reset();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		};
		new Thread(runnable).start();
	}

}
