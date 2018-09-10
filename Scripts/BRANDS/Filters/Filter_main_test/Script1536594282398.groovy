import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.consumeraffairs.com/login/?next=/brandtools/10848/reviews/')

WebUI.setText(findTestObject('Page_Login/input_Email_username'), 'qa-tester')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_password'), 'slaWsyVk8YVT5/nNqfyoHA0TaSguCV7DqfNTW05xhTM=')

WebUI.click(findTestObject('Page_Login/button_Log In'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/a_Filter reviews'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Status'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Unread'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Read'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Marked as important'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_No'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Star rating increased'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_No'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Grace period'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Yes'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_No'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Source'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Date'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Review action'))

WebUI.closeBrowser()

