package sample.web.hello.controller;

import static org.junit.jupiter.api.Assertions.*;

// import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest(classes = { ExampleController.class })
// @WebMvcTest(ExampleController.class)
// @AutoConfigureRestDocs
class ExampleControllerTest {

	// @Autowired
	MockMvc mockMvc;

	@Autowired
	ExampleController exampleController;

	@BeforeEach
	void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(exampleController).build();
	}

	@Test
	void test() throws Exception {

		// fail();
		mockMvc.perform(get("/hello").accept(MediaType.TEXT_PLAIN)).andExpect(status().isOk()).andReturn();
	}

	@Test
	void xxx() throws Exception {
		try {
			// fail();
			mockMvc.perform(get("/xxx").accept(MediaType.TEXT_PLAIN)).andExpect(status().is5xxServerError());
		} catch (Exception e) {
		}
	}

}
