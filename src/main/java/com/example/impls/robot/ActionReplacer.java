package com.example.impls.robot;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class ActionReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("new action!");
		return null;
	}

}
