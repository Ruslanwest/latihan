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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/button_Customer Login'))

WebUI.click(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/your_Name'), GlobalVariable.name)

String selectedOptionLabel = WebUI.getText(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/your_Name'))



def name = G


if (selectedOptionLabel.equals(name)) {
	
		WebUI.verifyElementPresent(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/your_Name'), FailureHandling.STOP_ON_FAILURE)
	} else if (selectedOptionLabel.equals(name))
	{
		WebUI.verifyElementPresent(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/your_Name'), FailureHandling.STOP_ON_FAILURE)
	} else  (selectedOptionLabel.equals(name)) 
	{
		WebUI.verifyElementPresent(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/your_Name'), FailureHandling.STOP_ON_FAILURE)
	}
	
	



/*if ( userSelect === GlobalVariable.name) {  
		 WebUI.verifyElementText(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/Verify Login'), 'Hermoine Granger')
	 } 
if else { WebUI.verifyElementText(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/Verify Login'), 'Hermoine Granger')
	}
	 {  WebUI.verifyElementText(findTestObject('Object/Path/Kamu'), 'No')
}*/
/*int userSelect = 0
switch (userSelect) {
case userSelect = GlobalVariable.name:
	println(userSelect)
	WebUI.verifyElementText(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/Verify Login'), 'Hermoine Granger')
	break
case userSelect = GlobalVariable.name:
	println(userSelect)
	WebUI.verifyElementText(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/Verify Login'), 'Hermoine Granger')
	break
case userSelect = GlobalVariable.name:
	println(userSelect)
	WebUI.verifyElementText(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/Verify Login'), 'Ron Weasly')
	break
case userSelect = GlobalVariable.name:
	println(userSelect)
	WebUI.verifyElementText(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/Verify Login'), 'Albus Dumbledore')
	break
case userSelect = GlobalVariable.name:
	println(userSelect)
	WebUI.verifyElementText(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/Verify Login'), 'Neville Longbottom')
	break
	
}*/

WebUI.click(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/button_Login'))

WebUI.verifyElementVisible(findTestObject('XYZ Bank/Page_XYZ Bank/Verify Login'))

WebUI.click(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/button_Withdrawl'))

WebUI.setText(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/input_Amount to be Withdrawn_form-control n_7d14c7'), 
    '5096')

WebUI.click(findTestObject('Object Repository/XYZ Bank/Page_XYZ Bank/button_Withdraw'))

