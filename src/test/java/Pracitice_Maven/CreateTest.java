package Pracitice_Maven;

import org.testng.annotations.Test;

public class CreateTest {
	
	@Test(groups = "smoke")
	public void create() {
		System.out.println("project created successfully");
	}
	@Test(groups = "regression")
	public void edit() {
		System.out.println("project edited successfully");
	}@Test(groups = "smoke")
	
	public void deleted() {
		System.out.println("project deleted successfully");
	}
	

}
