package com.example.impls.robot;

import com.example.interfaces.Hand;
import com.example.interfaces.Head;
import com.example.interfaces.Leg;

public class ModelT1000 extends BaseModel {
	
	private String color;
	private int year;
	private boolean soundEnabled;
	
	public ModelT1000() {
		super();
	}
	
	public ModelT1000(Hand hand, Leg leg, Head head) {
		super(hand, leg, head);
		}
	
	public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
		super(hand, leg, head);
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}
	
	
	public ModelT1000(String color, int year, boolean soundEnabled) {
		super();
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	@Override
	public void action() {
		getHead().calc();
		getHand().catchSomething();
		getLeg().go();
		System.out.println("color: " + color);
		System.out.println("year: " + year);
		System.out.println("can play sound: " + soundEnabled);
		
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
		
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}
	
	public void initObject() {
		System.out.println("init");
	}
	
	public void destroyObject() {
		System.out.println("destroy");
	}

	
	

}
