package com.example.impls.robot;

import java.util.Map;

import com.example.interfaces.Robot;
import com.example.interfaces.RobotPool;

public class T1000Pool implements RobotPool{
	private Map<String, Robot> robotCollection;

		
	public T1000Pool(Map<String, Robot> robotCollection) {
		super();
		this.robotCollection = robotCollection;
	}


	@Override
	public Map<String, Robot> getRobotCollection() {
		return robotCollection;
	}
	
	public void action() {
		for (Map.Entry<String, Robot> entry: robotCollection.entrySet()) {
			System.out.println(entry.getKey());
			entry.getValue().action();
		}
	}

}
