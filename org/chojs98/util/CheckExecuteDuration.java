package org.chojs98.util;

public class CheckExecuteDuration {
	/*
	 * ���� �������̽��� ������ ���๮�� �ݺ��� Ƚ���� ���� �ð��� �����ϱ� ���� ����ƽ �Լ�.
	 * �ð� ������ ���� currentTimeMillis�� nanoTime�� ���.
	 * nanoTime�� currentTimeMillis���� �� �̼��� �ð��� ������ �� ������ �� ���� �ڿ��� �Ҹ�.
	 * currentTimeMillis�� nanoTime���� ������ date�͵� ������ �����ϳ� �̼��� �ð� ������ �Ұ�.
	 * ���� �ð��� �纸�� ���� �����̹Ƿ� �׽�Ʈ �ܿ��� ������ �ʴ� �� ��� nanoTime�� ����.
	 * ����� millisecond(ms)�� 10^-3 second, nanosecond(ns)�� 10^-9 second�̴�.
	 */
	static public long getDuration(ExecuteInterface ei, long count) {
		
		long startTime = System.nanoTime();
		for (int i = 0; i < count; i++) {
			ei.execute();
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		return duration;
	}
}
