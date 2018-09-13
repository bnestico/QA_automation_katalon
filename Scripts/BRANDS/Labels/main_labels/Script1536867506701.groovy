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

WebUI.click(findTestObject('BrandsInbox/Label menu/open-close_Label menu'))

WebUI.click(findTestObject('BrandsInbox/Label menu/open-close_Label menu'))

WebUI.click(findTestObject('BrandsInbox/Label menu/label_Important'))

WebUI.click(findTestObject('BrandsInbox/Label menu/label_Needs response'))

WebUI.click(findTestObject('BrandsInbox/Label menu/label_Unread'))

WebUI.click(findTestObject('BrandsInbox/Label menu/submenu_Labels'))

WebUI.click(findTestObject('BrandsInbox/Label menu/subLabel_test'))

WebUI.click(findTestObject('BrandsInbox/Label menu/subLabel_Important'))

WebUI.click(findTestObject('BrandsInbox/Label menu/subLabel_Left Voicemail'))

WebUI.click(findTestObject('BrandsInbox/Label menu/subLabel_Email sent'))

WebUI.click(findTestObject('BrandsInbox/Label menu/subLabel_Refund pending'))

WebUI.click(findTestObject('BrandsInbox/Label menu/subLabel_Manage labels'))

