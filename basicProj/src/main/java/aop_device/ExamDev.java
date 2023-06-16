package aop_device;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import aop_model.exam.Stud;

public class ExamDev {
	
	Object method_1(ProceedingJoinPoint joinPoint) {
		
		Object oo = null;
		Stud st = null;
		
		try {
			oo = joinPoint.proceed();
			System.out.println(oo.getClass());
			st = (Stud)oo;
			
			for (int j : st.getJum()) {
				if(j < 0 || j > 100) {
					throw new Exception();
				}
			}
			
		} catch (Throwable e) {
			st = null;

		} finally {
			oo = st;
		}
		
		return oo;
	}

}


