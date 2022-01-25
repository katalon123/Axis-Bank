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

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/button_'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/div_Electronics'))

WebUI.click(findTestObject('Object Repository/Page_Electronics Big Savings Days Store Onl_e1cc7b/img_Big Saving Days_kJjFO0 _3DIhEh'))

WebUI.click(findTestObject('Object Repository/Page_boAt Storm Smartwatch Price in India -_039c4f/span_boAt Storm Smartwatch(Black Strap, Regular)'))

WebUI.click(findTestObject('Object Repository/Page_boAt Storm Smartwatch Price in India -_039c4f/div_Black__2C41yO'))

WebUI.closeBrowser()
