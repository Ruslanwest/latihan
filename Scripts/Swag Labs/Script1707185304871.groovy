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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.click(findTestObject('Object Repository/Swag Labs/Page_Swag Labs/input_Swag Labs_user-name'))

WebUI.setText(findTestObject('Object Repository/Swag Labs/Page_Swag Labs/input_Swag Labs_user-name'), username)

WebUI.setText(findTestObject('Object Repository/Swag Labs/Page_Swag Labs/input_Swag Labs_password'), password)

WebUI.click(findTestObject('Object Repository/Swag Labs/Page_Swag Labs/input_Swag Labs_login-button'))

// Tunggu elemen header muncul
WebUI.waitForElementVisible(findTestObject('Object Repository/Swag Labs/Page_Swag Labs/span_Products'), 60);

// Verifikasi teks "Products" muncul di header
String actualText = WebUI.getText(findTestObject('Object Repository/Swag Labs/Page_Swag Labs/span_Products'));

if (actualText.equals('Products')) {
  // Assertion passed - Login berhasil
  Log.info('Login berhasil');
} else {
  // Assertion failed - Login gagal
  Log.error('Login gagal. Teks pada header tidak sesuai.');
  // Tangkap screenshot untuk bukti
  WebUI.takeScreenshot('Login_Gagal');
}

WebUI.closeBrowser()

