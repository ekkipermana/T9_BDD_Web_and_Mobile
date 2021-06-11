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



class CartSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given ("I open the Samsung Galaxy item")
	def I_open_the_Samsung_Galaxy_item() {
		//		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.demoblaze.com/')
		WebUI.click(findTestObject('Cart/Cart_SamsungGalaxy6'))
	}

	@When ("Click add to cart")
	def Click_add_to_cart() {
		WebUI.click(findTestObject('Cart/Cart_Button_AddToCart'))
	}

	@And ("I verify Product added")
	def  I_verify_Product_added () {
		WebUI.delay(2)
		WebUI.acceptAlert()
		WebUI.verifyTextPresent('PRODUCT STORE', false)
	}

	@Then ("I open the list cart")
	def  I_open_the_list_cart () {
		WebUI.click(findTestObject('Cart/Cart_Link'))
		WebUI.verifyTextPresent('PRODUCT STORE', false)
		WebUI.delay(2)
	}
}