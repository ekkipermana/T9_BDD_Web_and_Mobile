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

import org.openqa.selenium.By
import org.openqa.selenium.Keys
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



class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given ("User navigates to login page")
	def User_navigates_to_login_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.demoblaze.com/')
		WebUI.click(findTestObject('Login/Login_Link'))
	}

	@When ("User enters (.*) and (.*) Valid")
	def enterCredentials(String username, String password) {
		println ("\n I am inside enterCredentialsValid")
		println ("Username: "+username)
		println ("Password: "+password)
		WebUI.setText(findTestObject('Login/Login_input_Name'), username)
		WebUI.setText(findTestObject('Login/Login_input_Password'), password)
	}

	@And ("User click button login")
	def User_click_button_login() {
		println("\n I am inside clicklogin")
		WebUI.click(findTestObject('Login/Login_Button'))
	}

	@Then ("Go to Dashboard Valid")
	def clickLoginButton() {
		println("\n I am on Dashboard")
		WebUI.verifyTextPresent('Welcome', false)
	}

	@Then ("Go to Dashboard Invalid")
	def clickLoginButtonInvalid() {
		println("\n I am on Dashboard")
		WebUI.acceptAlert()
		WebUI.verifyTextPresent('Log in', false)
	}

	@When ("User enters (.*) and (.*) Invalid")
	def enterCredentialsInvalid(String username, String password) {
		println ("\n I am inside enterCredentialsInvalid")
		println ("Username: "+username)
		println ("Password: "+password)
		WebUI.setText(findTestObject('Login/Login_input_Name'), username)
		WebUI.setText(findTestObject('Login/Login_input_Password'), password)
	}
}