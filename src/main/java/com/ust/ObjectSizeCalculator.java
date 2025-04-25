package com.ust;

import java.lang.instrument.Instrumentation;

public class ObjectSizeCalculator {

	private static Instrumentation instrumentation;
	
	public static void premain(String agentArgs,Instrumentation inst) {
		instrumentation = inst;
	}
	
	public static long getObjectSize(Object obj) {
		
		if(instrumentation==null) {
			throw new IllegalStateException("not initialised");
		}
		
		return instrumentation.getObjectSize(obj);
	}
}
