package di_p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("4. postProcessBeforeInitialization() 시작 : "+ beanName+" , "+bean);
		
		// 타입으로 확인
		if(bean.getClass() == Camera.class) {
			Camera cam1 = (Camera)bean;
			cam1.setName("삼반카메라");
		}
		
		if(bean.getClass() == PostStu.class) {
			PostStu st1 = (PostStu)bean;
			st1.calc();
		}
		
		
		System.out.println("postProcessBeforeInitialization() 끝 : "+ beanName+" , "+bean);

		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		System.out.println("6. postProcessAfterInitialization() 시작 : "+ beanName+" , "+bean);
		
		//beanName으로 확인
		if(beanName.equals("cam1")) {
			Camera cam1 = (Camera)bean;
			cam1.setPixel(768);
			bean = new Camera();
		}
		
		if(bean.getClass() == PostStu.class) {
			PostStu st1 = (PostStu)bean;
			
			if(st1.kind.equals("직장인")) {
				st1.avg += 10;
			}
		}
		
		
		System.out.println("postProcessAfterInitialization() 끝 : "+ beanName+" , "+bean);
		
		
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	
}
