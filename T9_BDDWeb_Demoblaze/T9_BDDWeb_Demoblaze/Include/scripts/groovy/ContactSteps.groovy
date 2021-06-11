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



class ContactSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I click contact menu")
	def I_click_contact_menu() {
		//		WebUI.openBrowser('')
		//		WebUI.navigateToUrl('https://www.demoblaze.com/')
		WebUI.click(findTestObject('Contact/Contact_Link'))
	}

	@When("I input my (.*) , (.*) and (.*)")
	def I_input_my_email_contact_and_message (String email, String contact, String message)  {
		WebUI.setText(findTestObject('Contact/Contact_Input_email'), email)
		WebUI.setText(findTestObject('Contact/Contact_Input_name'), contact)
		WebUI.setText(findTestObject('Contact/Contact_Input_message'), message)
	}

	@And ("I click button send message to send")
	def I_click_button_send_message_to_send() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Contact/Contact_Button'))
		WebUI.delay(2)
		WebUI.acceptAlert()
		WebUI.delay(2)
	}

	@And ("Show message and back to homepage")
	def Show_message_and_back_to_homepage() {
		WebUI.verifyTextPresent('PRODUCT STORE', false)
	}
}