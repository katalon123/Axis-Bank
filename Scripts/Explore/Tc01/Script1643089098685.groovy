import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.irctc.co.in/nget/train-search')

WebUI.click(findTestObject('Object Repository/Page_IRCTC Next Generation eTicketing System/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_IRCTC Next Generation eTicketing System/span_Have you not found the right oneFind a_82abbf'))

WebUI.switchToWindowTitle('Air Ticket Booking | Book Flight Tickets | Cheap Air Fare - IRCTC Air')

WebUI.click(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Ticket_5aba59/input_Web Check In_From'))

WebUI.click(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Ticket_5aba59/div_Mumbai (BOM)IN'))

WebUI.click(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Ticket_5aba59/input_Web Check In_To'))

WebUI.click(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Ticket_5aba59/div_Pune (PNQ)IN'))

WebUI.click(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Ticket_5aba59/span_283587'))

WebUI.click(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Ticket_5aba59/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Ticket_5aba59/a_Flight Details'))

WebUI.click(findTestObject('Object Repository/Page_Air Ticket Booking  Book Flight Ticket_5aba59/span_'))

