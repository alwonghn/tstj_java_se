package com.demo;

public class TestIfOperator {
	int p=1;
	public void testExpressionInIfBlockAutoEvaluated() {
		if(p==p+1) {
			System.out.println("true");
		}
		System.out.println(p);
	}
}
