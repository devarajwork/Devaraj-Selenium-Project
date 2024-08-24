package Hooks;

import Base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {

	@Before(value = "@Start", order = 0)
	public void steup() {
		browserlaunch("firefox");
		urllaunch("https://www.saucedemo.com/");
	}
	
	
	@After(value = "@End", order = 0)
	public void teardown() throws InterruptedException {
		waittime(5000);
		quit();
	}

}
