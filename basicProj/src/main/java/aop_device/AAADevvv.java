package aop_device;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AAADevvv {
	
	Object method_1(ProceedingJoinPoint joinPoint) {
		
		Object oo = null;
		String meName = joinPoint.getSignature().toString();
		
		Object [] args = joinPoint.getArgs();
		System.out.println("method_1() 진입 : before =>"+meName+","+Arrays.toString(args));

		try {
			oo = joinPoint.proceed();
			System.out.println("proceed 정상종료 : after Returning");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println("proceed 에러발생 : after throw");

		} finally {
			System.out.println("proceed 마침내 : after");
		}
		
		return oo;
		
	}
	
	void method_2(JoinPoint joinPoint) {
		System.out.println("method_2 실행");
		
	}	

}
