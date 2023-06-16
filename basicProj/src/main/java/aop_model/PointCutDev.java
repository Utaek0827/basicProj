package aop_model;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component("pcd")
public class PointCutDev {

	void retStr(JoinPoint jp) {
		
		System.out.println("jp.getSignature().toShortString() : "+jp.getSignature().toShortString());
		System.out.println("jp.getSignature().toLongString() : "+jp.getSignature().toLongString());
		System.out.println("jp.getSignature().toString() : "+jp.getSignature().toString());
		System.out.println(jp.getArgs());
		
		
		String name = jp.getSignature().toShortString();
		System.out.println("retStr:"+name);
		
	}
	
	
}
