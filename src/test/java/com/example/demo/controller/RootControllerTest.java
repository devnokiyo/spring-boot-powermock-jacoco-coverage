package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controllers.RootController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RootControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
	RootController target;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(target).build();
	}
	
	@Test
	public void index() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk())
        .andExpect(view().name("root/index"));
	}
}
