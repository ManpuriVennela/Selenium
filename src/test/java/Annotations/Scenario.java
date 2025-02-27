package Annotations;

import org.testng.annotations.Test;

import baseClassUtility.BaseClass;

public class Scenario extends BaseClass {

	@Test
	public void TS() {
		System.out.println("Test Script");
	}
	
	@Test
	public void TS2() {
		System.out.println("Test script 2");
	}
}
