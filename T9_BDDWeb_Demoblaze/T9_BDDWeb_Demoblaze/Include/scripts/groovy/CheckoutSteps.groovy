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



class CheckoutSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I click Place order to checkout")
	def I_click_Place_order_to_checkout() {
		//				WebUI.openBrowser('')
		//				WebUI.navigateToUrl('https://www.demoblaze.com/')
		//				WebUI.delay(2)
		//				WebUI.click(findTestObject('Cart/Cart_SamsungGalaxy6'))
		//				WebUI.delay(2)
		//				WebUI.click(findTestObject('Cart/Cart_Button_AddToCart'))
		//				WebUI.delay(2)
		//				WebUI.acceptAlert()
		//				WebUI.delay(2)
		WebUI.delay(2)
		WebUI.click(findTestObject('Checkout/Checkout_Button_PlaceOrder'))
		WebUI.delay(2)

	}

	@When("Show checkout window to fill following data")
	def Show_checkout_window_to_fill_following_data() {
		WebUI.delay(2)
		WebUI.verifyTextPresent('Place order', false)
	}

	@And("I input my name (.*)")
	def I_input_my_name (String name) {
		WebUI.delay(2)
		WebUI.setText(findTestObject('Checkout/Checkout_Input_Name'), name)
	}

	@And("I input my country (.*)")
	def I_input_my_country (String country) {
		WebUI.delay(2)
		WebUI.setText(findTestObject('Checkout/Checkout_Input_Country'), country)
	}

	@And("I input my city (.*)")
	def I_input_my_city (String city) {
		WebUI.delay(2)
		WebUI.setText(findTestObject('Checkout/Checkout_Input_City'), city)
	}

	@And("I input my cc (.*) number")
	def I_input_my_creditcardnumber (String creditcard) {
		WebUI.delay(2)
		WebUI.setText(findTestObject('Checkout/Checkout_Input_CreditCardNumber'), creditcard)
	}

	@And("I input date month (.*)")
	def I_input_my_date_month (String month) {
		WebUI.delay(2)
		WebUI.setText(findTestObject('Checkout/Checkout_Input_Month'), month)
	}

	@And("I input date year (.*)")
	def I_input_my_date_year (String year) {
		WebUI.delay(2)
		WebUI.setText(findTestObject('Checkout/Checkout_Input_Year'), year)
	}

	@And("I click purchase to finish")
	def I_click_purchase_to_finish() {
		WebUI.delay(2)
		WebUI.click(findTestObject('Checkout/Checkout_Button_Purchase'))
	}
	@Then("Show window order confirmation and klik oke")
	def Show_window_order_confirmation_and_klik_oke () {
		WebUI.delay(2)
		WebUI.click(findTestObject('Checkout/Checkout_Button_FinishOke'))
	}
}