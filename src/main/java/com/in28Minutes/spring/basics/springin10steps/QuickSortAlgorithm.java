package com.in28Minutes.spring.basics.springin10steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		//logic of quick sort
		return numbers;
	}
}
