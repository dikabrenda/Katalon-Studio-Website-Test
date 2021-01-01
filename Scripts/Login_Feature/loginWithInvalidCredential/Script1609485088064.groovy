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


    WebUI.openBrowser(GlobalVariable.url)

    WebUI.click(findTestObject('spyLogin/masuk_button'))

    WebUI.setText(findTestObject('spyLogin/username'), userName)

    WebUI.setText(findTestObject('spyLogin/password'), password)

    WebUI.click(findTestObject('spyLogin/button_Sign in'))

    if (condition == "emailNotValid") {
        WebUI.verifyEqual('Mohon masukkan email yang valid', 'Mohon masukkan email yang valid', FailureHandling.CONTINUE_ON_FAILURE)
    } else if (condition == "emailNotExist") {
        WebUI.verifyEqual('Email atau password Anda salah', 'Email atau password Anda salah', FailureHandling.CONTINUE_ON_FAILURE)
    } else if (condition == "emailNotBlank") {
        WebUI.verifyEqual('Kolom ini wajib di isi', 'Kolom ini wajib di isi', FailureHandling.CONTINUE_ON_FAILURE)
    } else if (condition == "passwordNotBlank") {
        WebUI.verifyEqual('Kolom ini wajib di isi', 'Kolom ini wajib di isi', FailureHandling.STOP_ON_FAILURE)
    } else {
        println('System Error')
    }
	
	WebUI.takeScreenshotAsCheckpoint('C:\\Users\\User_1\\git\\Katalon-Studio-Website-Test\\Screenshot', FailureHandling.CONTINUE_ON_FAILURE)
    
    WebUI.closeBrowser()

