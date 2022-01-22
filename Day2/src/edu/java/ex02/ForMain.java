package edu.java.ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForMain {

	public static void main(String[] args) {
		// String 타입의 키와 Object 타입의 값을 저장하는 HashMap 객체를 생성
		// Object 타입을 저장한다는 것은 모든 타입의 값들을 저장할 수 있다는 의미
		Map<String, Object> model = new HashMap<>();
		
		model.put("name", "오쌤");
		model.put("age", 16);
		
		List<String> phones = new ArrayList<>();
		phones.add("010-0000-0000");
		phones.add("02-0000-0000");
		
		model.put("phones", phones);
		
		System.out.println(model);
		System.out.println(model.keySet());
		
		for (String k : model.keySet()) {
			Object value = model.get(k);
			System.out.println(k + "=" + value);
		}
	}
}
