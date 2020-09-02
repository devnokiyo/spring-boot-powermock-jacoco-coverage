package com.example.demo.logic;

import com.example.demo.model.RootModel;

public class RootLogic {
	public boolean hasPoint(int point) {
		var result = RootModel.create(point);
		if (result.point > 0) {
			return true;
		} else {
			return false;
		}
	}
}
