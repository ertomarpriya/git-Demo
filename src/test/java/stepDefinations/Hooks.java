package stepDefinations;

import Automation.UdemyCucumberCourse.Testbase;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Testbase {
	
		
		@Before("@MobileTest")
		public void beforeValidation() {
			
			System.out.println("Mobile before hook");
		}

		@After("@MobileTest")
		public void AfterValidation() {
			
			System.out.println("Mobile after hook");
		}
		
		@After("@SeleniumTest")
		public void AfterValidationtest() {
			
		driver.close();
		}
		
		
	/*
	 * @Before("@RegTest") public void BeforeRegValidation() {
	 * 
	 * System.out.println("reg before hook"); }
	 * 
	 * @After("@RegTest") public void AftereRegValidation() {
	 * 
	 * System.out.println("reg after hook"); }
	 */
	}

