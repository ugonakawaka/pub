package oreore.bsf.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.charset.Charset;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class) 
@WebMvcTest
@AutoConfigureMockMvc
class PcfBindingsApiImplTest {


    @Autowired
    private MockMvc mockMvc;
    

	@Test
	public void whenPostRequestTo_pcfBindings_thenCorrectResponse() throws Exception {
	    // final MediaType textPlainUtf8 = new MediaType(MediaType.TEXT_PLAIN, Charset.forName("UTF-8"));
	    final String json = "{}";
	    mockMvc.perform(MockMvcRequestBuilders.post("/nbsf-management/v1/pcfBindings")
	      .content(json)
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(MockMvcResultMatchers.status().is(201));
	}
	
	@Test
	public void whenPostRequestTo_pcfBindings_thenCorrectResponse2() throws Exception {
	    // final MediaType textPlainUtf8 = new MediaType(MediaType.TEXT_PLAIN, Charset.forName("UTF-8"));
	    final String json = "{\"bindLevel\":\"NF_SET1\"}";
	    mockMvc.perform(MockMvcRequestBuilders.post("/nbsf-management/v1/pcfBindings")
	      .content(json)
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(MockMvcResultMatchers.status().is(201));
	}
	
}
