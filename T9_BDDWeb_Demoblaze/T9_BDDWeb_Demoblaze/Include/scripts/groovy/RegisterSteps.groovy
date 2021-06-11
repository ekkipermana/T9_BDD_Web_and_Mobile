import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By


import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class RegisterSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given ("User navigates to Register pages")
	def User_navigates_to_Register_pages() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.demoblaze.com/')
		WebUI.click(findTestObject('Register/Register_Link'))
	}

	@When ("User enters (.*) and (.*) Valid data register")
	def enterCredentialsValudRegister(String username, String password) {
		println ("\n I am inside enterCredentialsValidRegister")
		println ("Username: "+username)
		println ("Password: "+password)
		WebUI.setText(findTestObject('Register/Register_input_Name'), username)
		WebUI.setText(findTestObject('Register/Register_input_Password'), password)
	}

	@And ("User click button Register")
	def User_click_button_Register() {
		println("\n I am inside clickregister")
		WebUI.click(findTestObject('Register/Register_Button'))
	}

	@Then ("Go to Dashboard ValidRegister")
	def clickLoginButton() {
		println("\n I am on Dashboard after Register")
		WebUI.delay(2)
		WebUI.verifyTextPresent('Sign up', true)
		WebUI.delay(2)
		WebUI.navigateToUrl('https://www.demoblaze.com/')
	}

	@Then ("Go to Dashboard InvalidRegister")
	def clickLoginButtonInvalidRegister() {
		WebUI.delay(2)
		WebUI.acceptAlert()
		WebUI.delay(2)
		WebUI.verifyTextPresent('Sign up', false)
		WebUI.delay(2)
		WebUI.navigateToUrl('https://www.demoblaze.com/')
	}

	@When ("User enters (.*) and (.*) Invalid data Register")
	def enterCredentialsInvalidRegister(String username, String password) {
		println ("\n I am inside enterCredentialsInvalidRegister")
		println ("Username: "+username)
		println ("Password: "+password)
		WebUI.setText(findTestObject('Register/Register_input_Name'), username)
		WebUI.setText(findTestObject('Register/Register_input_Password'), password)
	}
}