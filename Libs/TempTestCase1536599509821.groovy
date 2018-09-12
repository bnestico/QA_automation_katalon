import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/c4/sk2v9nzx6k56lv2gtq69phyc0000gn/T/Katalon/20180910_141149/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://qa.consumeraffairs.com/login/?next=/brandtools/10848/reviews/\')\n\nWebUI.setText(findTestObject(\'Page_Login/input_Email_username\'), \'qa-tester\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Login/input_Password_password\'), \'slaWsyVk8YVT5/nNqfyoHA0TaSguCV7DqfNTW05xhTM=\')\n\nWebUI.click(findTestObject(\'Page_Login/button_Log In\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/a_Filter reviews\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/div_Status\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_Unread\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_Read\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_All\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/div_Marked as important\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_Yes\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_No\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_All\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/div_Star rating increased\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_Yes\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_No\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_All\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/div_Grace period\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_Yes\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_No\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/label_All\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/div_Source\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/div_Date\'))\n\nWebUI.click(findTestObject(\'Page_Reviews/div_Review action\'))\n\nWebUI.closeBrowser()\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

