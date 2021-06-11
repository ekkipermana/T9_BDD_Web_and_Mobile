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

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords


import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class All_Operationals {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	//////////////STARTING//////////////
	@Given("I open the Calculator App")
	def I_open_the_Calculator_App() {
		Mobile.startApplication(GlobalVariable.app_dir, true)
	}

	/////////////GANJIL2///////////////
	@When("I Tap first even Number Three")
	def I_Tap_first_even_Number_Three() {
		Mobile.tap(findTestObject("Angka/android.widget.Button - 3"), 0)
	}

	@And("I Tap second even Number Five")
	def I_Tap_second_even_Number_Five() {
		Mobile.tap(findTestObject("Angka/android.widget.Button - 5"), 0)
	}


	/////////////GANJIL1//////////////
	@And("I Tap first even Number Three double")
	def I_Tap_second_even_Number_Three_double() {
		Mobile.tap(findTestObject("Angka/android.widget.Button - 3"), 0)
		Mobile.tap(findTestObject("Angka/android.widget.Button - 3"), 0)
	}

	@And("I Tap second even Number Five double")
	def I_Tap_second_even_Number_Five_double() {
		Mobile.tap(findTestObject("Angka/android.widget.Button - 5"), 0)
		Mobile.tap(findTestObject("Angka/android.widget.Button - 5"), 0)
	}

	//////////////GENAP1///////////////
	@When("I Tap first even Number Two")
	def I_Tap_first_even_Number_Two() {
		Mobile.tap(findTestObject("Angka/android.widget.Button - 2"), 0)
	}

	@And("I Tap second even Number Six")
	def I_Tap_second_even_Number_Six() {
		Mobile.tap(findTestObject("Angka/android.widget.Button - 6"), 0)
	}

	//////////GENAP2///////////////
	@When("I Tap first even Number Two double")
	def I_Tap_first_even_Number_Two_double() {
		Mobile.tap(findTestObject("Angka/android.widget.Button - 2"), 0)
		Mobile.tap(findTestObject("Angka/android.widget.Button - 2"), 0)
	}

	@And("I Tap second even Number Six double")
	def I_Tap_second_even_Number_Six_double() {
		Mobile.tap(findTestObject("Angka/android.widget.Button - 6"), 0)
		Mobile.tap(findTestObject("Angka/android.widget.Button - 6"), 0)
	}

	/////////OPERATIONAL//////////////
	@And("I tap Multiple button")
	def I_tap_Multiple_button() {
		Mobile.tap(findTestObject("Operational/android.widget.Button - Kali"), 0)
	}

	@And("I tap Devided button")
	def I_tap_Devided_button() {
		Mobile.tap(findTestObject("Operational/android.widget.Button - Bagi"), 0)
	}

	@And("I tap Plus button")
	def I_tap_Plus_button() {
		Mobile.tap(findTestObject("Operational/android.widget.Button - Tambah"), 0)
	}

	@And("I tap Minus button")
	def I_tap_Minus_button() {
		Mobile.tap(findTestObject("Operational/android.widget.Button - Kurang"), 0)
	}

	//////////////////DEFAULT//////////////////////
	@Then("I Tap equals for Result")
	def I_Tap_equals_for_Result() {
		Mobile.tap(findTestObject("Operational/android.widget.Button - Hasil"), 0)
		Mobile.delay(2)
	}
	//
	//	@Then("I tap clear")
	//	def I_tap_clear() {
	//		Mobile.delay(1)
	//		Mobile.tap(findTestObject("Operational/android.widget.Button - Clear2"), 0)
	//		Mobile.verifyElementText("15", true)

}