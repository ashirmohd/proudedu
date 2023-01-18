package Pracitice_Maven;

import org.testng.annotations.Test;

public class CreateOrgTest {
	
	@Test(groups = "regression")
	public void create() {
		System.out.println("Organization created successfully");
	}
	@Test(groups = "smoke")
	public void edit() {
		System.out.println("Organization edited successfully");
	}@Test(groups = "smoke")
	public void deleted() {
		
		System.out.println("Organization deleted successfully");
	}

}
