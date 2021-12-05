package yaml_to_json;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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

		final Path outputdir = Paths.get("json/");

		outputdir.toFile().mkdir();

		System.out.println(p.toUri());

		final ObjectMapper objectMapper = new ObjectMapper();
		final Yaml yaml = new Yaml();
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(p)) {

			stream.forEach(a -> {
				// System.out.println(a);

				final String filenameBase = a.toFile().getName().split("\\.", 2)[0];
				System.out.println(filenameBase);

				try {
		
					final Stream<String> lines = Files.lines(a);
					final String s = lines.collect(Collectors.joining("\n"));
					lines.close();

					final Map<String, Object> obj = yaml.load(s);

					final String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
					// System.out.println(json);
					
					Files.writeString(Paths.get("json/", filenameBase + ".json"), json, Charset.forName("UTF-8"),
							StandardOpenOption.CREATE);

				} catch (IOException e) {
					e.printStackTrace();
				}

			});

		}

	}
}
