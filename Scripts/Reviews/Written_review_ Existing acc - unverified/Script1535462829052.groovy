import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Random rnd = new Random()
randomNumber = (10000 + rnd.nextInt(250000))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.consumeraffairs.com/')

WebUI.click(findTestObject('Page_ConsumerAffairs.com Research./btn_write_review'))

WebUI.click(findTestObject('Page_Write a Review/a_Write areview'))

WebUI.click(findTestObject('Page_Submit a Review/what_company_are_you'))

WebUI.setText(findTestObject('Page_Submit a Review/what_company_are_you'), 'Frontpoint')

WebUI.setText(findTestObject('Page_Submit a Review/input_product_contact'), 'test department')

WebUI.click(findTestObject('Page_Submit a Review/Rate_star'))

WebUI.click(findTestObject('Page_Submit a Review/Summarize_your_exp'))

WebUI.setText(findTestObject('Page_Submit a Review/Summarize_your_exp'), 'Test review title')

WebUI.click(findTestObject('Page_Submit a Review/Please_provide_detail'))

WebUI.setText(findTestObject('Page_Submit a Review/Please_provide_detail'), 'Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review Test review ')

WebUI.click(findTestObject('Page_Submit a Review/Terms_of_use_reviews'))

WebUI.click(findTestObject('Page_Submit a Review/button_Continue'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Submit a Review/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Create your account/input_first_name'), 'Testerson')

WebUI.setText(findTestObject('Object Repository/Page_Create your account/input_last_name'), 'Testerlord')

WebUI.setText(findTestObject('Object Repository/Page_Create your account/input_zip'), '94117')

//WebUI.setText(findTestObject('Object Repository/Page_Create your account/input_email'), CustomKeywords.'randomData.TestDataGenerator.getRandomFemaleName'()+'@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Create your account/input_email'), String.valueOf(randomNumber)+'catest@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create your account/input_password1'), 'tO3m0nBa5UXvNLp7PDyHWw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create your account/input_password2'), 'tO3m0nBa5UXvNLp7PDyHWw==')

WebUI.click(findTestObject('Object Repository/Page_Create your account/button_Create account'))

