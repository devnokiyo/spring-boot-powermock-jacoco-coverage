package com.example.demo.model;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class RootModelTest {
	
	private RootModel model;
	
	@Before
	public void setup() {
		model = new RootModel();
	}
	
	@Test
	public void create() {
		assertThat(RootModel.create(0).point).isEqualTo(0);
	}
	
	@Test
	public void showGreetingHappy() {
		model.point = 11;
		assertThat(model.showGreeting()).isEqualTo("happy");
	}

	@Test
	public void showGreetingUmmm() {
		model.point = 1;
		assertThat(model.showGreeting()).isEqualTo("umm....");
	}

	@Test
	public void showGreetingBad() {
		assertThat(model.showGreeting()).isEqualTo("bad");
	}
}
