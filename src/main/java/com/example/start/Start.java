package com.example.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.impls.robot.ModelT1000;
import com.example.interfaces.Robot;
import com.example.interfaces.RobotConveyor;
/**
 * https://www.youtube.com/watch?v=-hOj-xnPBCY&index=11&list=PLhRVxdTBcpdu1mjcJgVfARKjpLzE9dLnL
 * @author Rudoman
 *
 */
public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
 
		RobotConveyor t1000Conveyor = (RobotConveyor)context.getBean("t1000Conveyor");
		
		Robot terminator1 = t1000Conveyor.createRobot();
		Robot terminator2 = t1000Conveyor.createRobot();
		Robot terminator3 = t1000Conveyor.createRobot();
	
		System.out.println("terminator1 " + terminator1);
		terminator1.action();
		System.out.println("terminator2 " + terminator2);
		terminator2.action();
		System.out.println("terminator3 " + terminator3);
		terminator3.action();
	}

}
