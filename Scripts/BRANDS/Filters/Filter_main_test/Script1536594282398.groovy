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

WebUI.callTestCase(findTestCase('Login to Main Site'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.main_site_url + '/login/?next=/brandtools/10848/reviews/')

WebUI.click(findTestObject('BrandsInbox/Filter reviews'))

WebUI.click(findTestObject('BrandsInbox/filter_Status'))

WebUI.click(findTestObject('BrandsInbox/label_Unread (1)'))

WebUI.click(findTestObject('BrandsInbox/label_Read (1)'))

WebUI.click(findTestObject('BrandsInbox/label_All'))

WebUI.click(findTestObject('BrandsInbox/filter_Marked as important'))

WebUI.click(findTestObject('BrandsInbox/label_Yes (1)'))

WebUI.click(findTestObject('BrandsInbox/label_No (1)'))

WebUI.click(findTestObject('BrandsInbox/label_All (1)'))

WebUI.click(findTestObject('BrandsInbox/filter_Star rating increased'))

WebUI.click(findTestObject('BrandsInbox/label_Yes (1)'))

WebUI.click(findTestObject('BrandsInbox/label_No (1)'))

WebUI.click(findTestObject('BrandsInbox/label_All (1)'))

WebUI.click(findTestObject('BrandsInbox/filter_Grace period'))

WebUI.click(findTestObject('BrandsInbox/label_Yes (1)'))

WebUI.click(findTestObject('BrandsInbox/label_No (1)'))

WebUI.click(findTestObject('BrandsInbox/label_All (1)'))

WebUI.click(findTestObject('BrandsInbox/filter_Source'))

WebUI.click(findTestObject('BrandsInbox/label_ConsumerAffairs Review F'))

WebUI.click(findTestObject('BrandsInbox/label_Custom Review Form'))

WebUI.click(findTestObject('BrandsInbox/label_Email Campaign Tool'))

WebUI.click(findTestObject('BrandsInbox/label_Phone Review Collection'))

WebUI.click(findTestObject('BrandsInbox/label_Review Collection Card'))

WebUI.click(findTestObject('BrandsInbox/label_Facebook App Review Form'))

WebUI.click(findTestObject('BrandsInbox/label_Iframe Review Form'))

WebUI.click(findTestObject('BrandsInbox/filter_Star rating'))

WebUI.click(findTestObject('BrandsInbox/img_Star rating_stars-rtg star'))

WebUI.click(findTestObject('BrandsInbox/img_Star rating_stars-rtg star_1'))

WebUI.click(findTestObject('BrandsInbox/img_Star rating_stars-rtg star_2'))

WebUI.click(findTestObject('BrandsInbox/img_Star rating_stars-rtg star_3'))

WebUI.click(findTestObject('BrandsInbox/img_Star rating_stars-rtg star_4'))

WebUI.click(findTestObject('BrandsInbox/div_Date (1)'))

WebUI.click(findTestObject('BrandsInbox/filter_Review action'))

WebUI.click(findTestObject('BrandsInbox/Private Reply Received'))

WebUI.click(findTestObject('BrandsInbox/label_Yes (1)'))

WebUI.click(findTestObject('BrandsInbox/label_No (1)'))

WebUI.click(findTestObject('BrandsInbox/label_All (1)'))

WebUI.click(findTestObject('BrandsInbox/filter_Private Reply Sent'))

WebUI.click(findTestObject('BrandsInbox/label_Yes (1)'))

WebUI.click(findTestObject('BrandsInbox/label_No (1)'))

WebUI.click(findTestObject('BrandsInbox/label_All (1)'))

WebUI.click(findTestObject('BrandsInbox/filter_Public Reply Sent'))

WebUI.click(findTestObject('BrandsInbox/label_Yes (1)'))

WebUI.click(findTestObject('BrandsInbox/label_No (1)'))

WebUI.click(findTestObject('BrandsInbox/label_All (1)'))

WebUI.click(findTestObject('BrandsInbox/div_Note Added'))

WebUI.click(findTestObject('BrandsInbox/label_Yes (1)'))

WebUI.click(findTestObject('BrandsInbox/label_No (1)'))

WebUI.click(findTestObject('BrandsInbox/label_All (1)'))

WebUI.click(findTestObject('BrandsInbox/filter_Requested New Rating'))

WebUI.click(findTestObject('BrandsInbox/label_Yes (1)'))

WebUI.click(findTestObject('BrandsInbox/label_No (1)'))

WebUI.click(findTestObject('BrandsInbox/label_All (1)'))

WebUI.click(findTestObject('BrandsInbox/a_Apply filter'))

