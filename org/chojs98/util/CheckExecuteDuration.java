package org.chojs98.util;

public class CheckExecuteDuration {
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
