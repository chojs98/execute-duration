package org.chojs98.util;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecuteInterface ei = () -> {
			String s1 = "JAVA";
			String s2 = " World";
			String s3 = s1 + s2;
		};
		long testCount = 100000;
		long duration = CheckExecuteDuration.getDuration(ei, testCount);
		System.out.println("test : " + duration);
	}

}
