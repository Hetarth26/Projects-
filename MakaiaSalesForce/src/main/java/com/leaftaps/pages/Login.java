package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class Login extends ProjectSpecificMethods
{

	public Login enterUsername(String data)
	{
		clearAndType(locateElement(Locators.ID, "username"), data);
		return this;
	}

	public Login enterPassword(String data)
	{
		clearAndType(locateElement(Locators.ID, "password"), data);
		return this;
	}
	public Login clickLogin()
	{
		click(locateElement(Locators.ID, "Login"));
		return this;
	}




}


