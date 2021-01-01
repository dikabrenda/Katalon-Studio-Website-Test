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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'User navigate to ibid.astra.com'
WebUI.openBrowser(GlobalVariable.url)

'user click masuk'
WebUI.click(findTestObject('spyLogin/masuk_button'))

'user enter username'
WebUI.setText(findTestObject('spyLogin/username'), GlobalVariable.username)

'user enter password'
WebUI.setText(findTestObject('spyLogin/password'), GlobalVariable.password)

'user click sign in button'
WebUI.click(findTestObject('spyLogin/button_Sign in'))

'user should be able to login successfully'
WebUI.verifyElementPresent(findTestObject('spyLogin/profile_account'), 2, FailureHandling.CONTINUE_ON_FAILURE)

'take screenshot'
WebUI.takeScreenshotAsCheckpoint('C:\\Users\\User_1\\git\\Katalon-Studio-Website-Test\\Screenshot', FailureHandling.CONTINUE_ON_FAILURE)

'close browser'
WebUI.closeBrowser()

