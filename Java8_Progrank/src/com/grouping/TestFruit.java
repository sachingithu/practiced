package com.grouping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestFruit {

	public static void main(String[] args) {
		
		List<Fruit> l=Arrays.asList(new Fruit("Apple", 5),
									new Fruit("Banana", 20),
									new Fruit("Orange", 10),
									new Fruit("Banana", 5));
		Map<String, Integer> sum=
		l.stream().collect(Collectors.groupingBy(x->x.getName(),Collectors.summingInt(f->f.getQuantity())));
		System.out.println(sum);
		

	}

}
