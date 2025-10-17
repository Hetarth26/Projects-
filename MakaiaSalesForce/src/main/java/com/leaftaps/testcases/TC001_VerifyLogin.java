package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;


public class TC001_VerifyLogin extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setValues()
	{
		testcaseName = "VerifyLogin";
		testDescription ="Verify Login functionality with positive data";
		authors="Hari";
		category ="Smoke";
		excelFileName="Login";
	}

	



}
