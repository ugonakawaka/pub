package yaml_to_json;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		a();
	}

	static void a() throws IOException {

		final Path p = Paths.get("spec/");

		System.out.println(p.toUri());

		final ObjectMapper objectMapper = new ObjectMapper();
		final Yaml yaml = new Yaml();
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(p)) {

			stream.forEach(a -> {
				System.out.println(a);

				try {
					// String read = Files.readAllLines(a).toString();
					final Stream<String> lines = Files.lines(a);
					final String s = lines.collect(Collectors.joining("\n"));
					lines.close();

					final Map<String, Object> obj = yaml.load(s);

					final String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
					System.out.println(json);
				} catch (IOException e) {
					e.printStackTrace();
				}

			});

		}

	}
}
