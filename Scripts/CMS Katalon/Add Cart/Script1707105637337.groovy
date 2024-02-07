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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://cms.demo.katalon.com/')

WebUI.click(findTestObject('Page_Katalon Shop  Katalon Ecommerce/img_Sale_attachment-woocommerce_thumbnail s_432ea2'))

WebUI.click(findTestObject('Page_Flying Ninja  Katalon Shop/button_Add to cart'))

WebUI.click(findTestObject('Page_Flying Ninja  Katalon Shop/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Katalon Shop/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__billing_first_name'), 'ruslan')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__billing_last_name'), 'permana')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_(optional)_billing_company'), 'company')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Katalon Shop/span_United States (US)'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_Themes Zone_select2-search__field'), 'indonesia')

WebUI.sendKeys(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_Themes Zone_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__billing_address_1'), '12')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_(optional)_billing_address_2'), '12')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__billing_city'), 'depok')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Katalon Shop/span_Select an option'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_Themes Zone_select2-search__field'), 'jawa')

WebUI.sendKeys(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_Themes Zone_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__billing_postcode'), '16452')

WebUI.sendKeys(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__billing_postcode'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__billing_phone'), '085774907472')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__billing_email'), 'ruslan.label2@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__ship_to_different_address'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__shipping_first_name'), 'ruslan')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__shipping_last_name'), 'permana')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_(optional)_shipping_company'), 'company 2')

WebUI.click(findTestObject('Object Repository/Page_Checkout  Katalon Shop/span_United States (US)_1'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_Themes Zone_select2-search__field'), 'indonesia')

WebUI.sendKeys(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_Themes Zone_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__shipping_address_1'), 'mulqi')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__shipping_city'), 'depok')

WebUI.sendKeys(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__shipping_city'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Checkout  Katalon Shop/span_Select an option_1'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_Themes Zone_select2-search__field'), 'jawa')

WebUI.sendKeys(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input_Themes Zone_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__shipping_postcode'), '16452')

WebUI.sendKeys(findTestObject('Object Repository/Page_Checkout  Katalon Shop/input__shipping_postcode'), Keys.chord(Keys.ENTER))



