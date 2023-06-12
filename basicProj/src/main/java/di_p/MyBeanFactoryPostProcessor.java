package di_p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	
	
	public MyBeanFactoryPostProcessor() {
		System.out.println("생성자");
	}



	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

		System.out.println("1. MyBeanFactoryPostProcessor.postProcessBeanFactory() 실행:"+beanFactory);
		
	}

}
