package com.example.demo.logic;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.RootModel;


@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringRunner.class)
@PrepareForTest(RootModel.class)
public class RootLogicTest {

	@Test
	public void hasPoint() {
		var stub = new RootModel();
		stub.point = 0;

		PowerMockito.mockStatic(RootModel.class);
		PowerMockito.when(RootModel.create(Mockito.anyInt())).thenReturn(stub);
		var logic = new RootLogic();
		assertThat(logic.hasPoint(0)).isFalse();

		stub.point = 1;
		PowerMockito.when(RootModel.create(Mockito.anyInt())).thenReturn(stub);
		assertThat(logic.hasPoint(0)).isTrue();
	}
}
