package Stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooktest {
	@Before
	public void before1() {
		System.out.println("Before Test");
	}
	@After
	public void after1() {
		System.out.println("After Test");
	}
	@Before("@tag3")
	public void before2() {
		System.out.println("Before Test with tag");
	}
	@After("@tag3")
	public void after2() {
		System.out.println("After Test with tag");
	}
	@BeforeStep("@tag2 and not @tag3")
	public void beforestep1() {
		System.out.println("Before Step Test");
	}
	@AfterStep("@tag3 and not @tag2")
	public void afterstep1() {
		System.out.println("After Step Test");
	}
}
