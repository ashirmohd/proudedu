package Pracitice_Maven;

import org.testng.annotations.Test;

public class CreateContactTest {
	
	@Test(groups = "regression")
	public void create() {
		System.out.println("contact created successfully");
	}
	@Test(groups = "smoke")
	public void edit() {
		System.out.println("contact edited successfully");
	}@Test(groups = "regression")
	public void deleted() {
		System.out.println("contact deleted successfully");
	}

}
