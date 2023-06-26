package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_Info_Update extends Base{
	@Given("I am in Landing Home Page")
	public void i_am_in_landing_home_page() {
		navigateURL("http://it.microtechlimited.com/index.html");
		String s = getElementText(By.xpath("//div//h1['Welcome to MicroTech NA.']"));
		assertEquals("Welcome to MicroTech NA.", s);
	}

	@When("I Click on Loginn")
	public void i_click_on_loginn() {
		click(By.xpath("//a[@href=\"elogin.php\"]"));
	}

	@Then("I will be in Login Pagee")
	public void i_will_be_in_login_pagee() {
		String s = getElementText(By.xpath("//div//h1"));
		assertEquals("Employee Login", s);
	}

	@Then("Click Employee Login")
	public void click_employee_login() {
		click(By.xpath("//a[@class='homered']"));
	}

	@Then("I enter User Id {string}")
	public void i_enter_user_id(String string) {
		  sendkeys(By.name("mailuid"),string);
	}

	@Then("I enter Password {string}")
	public void i_enter_password(String string) {
		sendkeys(By.name("pwd"),string);
	}

	@When("I click Login button")
	public void i_click_login_button() {
		   click(By.xpath("//input[@value=\"Login\"]"));;
	}

	@Then("I will see Employee Home Page")
	public void i_will_see_employee_home_page() {
		String s= getElementText(By.xpath("//h2[text()='Welcome Test ']"));
	    assertEquals("Welcome Test",s);
	}

	@Then("I click My Profile")
	public void i_click_my_profile() {
		click(By.xpath("//ul[@id=\"navli\"]/li[2]"));
	}

	@Then("I click Update Info")
	public void i_click_update_info() {
		click(By.xpath("//button[text()='Update Info']"));
		
	}

	@Then("I update Contact")
	public void i_update_contact() {
		clear(By.name("contact"));
		
		sendkeys(By.name("contact"),"333333");
		
	}

	@Then("I click submit button")
	public void i_click_submit_button() {
	    click(By.xpath("//button[@type=\"submit\"]"));
	}

	@Then("I click refresh url")
	public void i_click_refresh_url() {
		driver.navigate().refresh();
	
	}

	@Then("I will see sucessfully update")
	public void i_will_see_sucessfully_update() {
		
		String s= getAttributeValue(By.xpath("//input[@name='contact']"), "value" );
	    assertEquals("333333",s); 
	    System.out.println("Attribute value is "+s);
	}

}
