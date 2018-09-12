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

WebUI.click(findTestObject('Object Repository/Page_Reviews/a_Filter reviews (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Status (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Unread (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Read (1)'))

WebUI.click(findTestObject('Page_Reviews/label_All'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Marked as important (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Yes (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_No (1)'))

WebUI.click(findTestObject('Page_Reviews/label_All (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Star rating increased (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Yes (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_No (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Grace period (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Yes (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_No (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Source (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_ConsumerAffairs Review F'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Custom Review Form'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Email Campaign Tool'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Phone Review Collection'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Review Collection Card'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Facebook App Review Form'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Iframe Review Form'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Star rating (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/img_Star rating_stars-rtg star'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/img_Star rating_stars-rtg star_1'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/img_Star rating_stars-rtg star_2'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/img_Star rating_stars-rtg star_3'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/img_Star rating_stars-rtg star_4'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Date (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Review action (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Private Reply Received'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Has'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Does not have'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Private Reply Sent'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Has'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Does not have'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Public Reply Sent'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Has'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Does not have'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Note Added'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Has'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Does not have'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/div_Requested New Rating'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Has'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_Does not have'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/label_All (1)'))

WebUI.click(findTestObject('Object Repository/Page_Reviews/a_Apply filter'))

