package org.chojs98.util;

public class CheckExecuteDuration {
	/*
	 * 림다 인터페이스의 지정된 실행문을 반복한 횟수의 실행 시간을 측정하기 위한 스태틱 함수.
	 * 시간 측정을 위해 currentTimeMillis와 nanoTime를 고민.
	 * nanoTime은 currentTimeMillis보다 더 미세한 시간을 측정할 수 있으나 더 많은 자원을 소모.
	 * currentTimeMillis는 nanoTime보다 가볍고 date와도 연동이 가능하나 미세한 시간 측정이 불가.
	 * 실행 시간을 재보기 위한 목적이므로 테스트 외에는 쓰이지 않는 걸 고려 nanoTime을 쓴다.
	 * 참고로 millisecond(ms)는 10^-3 second, nanosecond(ns)는 10^-9 second이다.
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
