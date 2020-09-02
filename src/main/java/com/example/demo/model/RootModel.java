package com.example.demo.model;

public class RootModel {
	public int point;

	public String showGreeting() {
		if (point > 10) {
			return "happy";
		} else if (point > 0) {
			return "umm....";
		} else {
			return "bad";
		}
	}

	public static RootModel create(int point) {
		var result = new RootModel();
		result.point = point;
		return result;
	}
}
