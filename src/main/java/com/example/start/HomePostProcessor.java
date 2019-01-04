package com.example.start;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HomePostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("Bean " + beanName + " postProcessAfterInitialization " );
		System.out.println("Bean  postProcessAfterInitialization " );
        return bean;
 
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		  System.out.println("Bean " + beanName + " postProcessBeforeInitialization ");
	        return bean;
	 
	}

}
