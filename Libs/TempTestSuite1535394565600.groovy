import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/CA_Suite_1')

suiteProperties.put('name', 'CA_Suite_1')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/rodrigodavila/Katalon Studio/TestProject1/Reports/CA_Suite_1/20180827_152925/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/CA_Suite_1', suiteProperties, [new TestCaseBinding('Test Cases/CA_Test_1', 'Test Cases/CA_Test_1',  null), new TestCaseBinding('Test Cases/CA_Test_2', 'Test Cases/CA_Test_2',  null), new TestCaseBinding('Test Cases/CA_Test_3', 'Test Cases/CA_Test_3',  null), new TestCaseBinding('Test Cases/CA_Test_4', 'Test Cases/CA_Test_4',  null), new TestCaseBinding('Test Cases/CA_Test_5', 'Test Cases/CA_Test_5',  null), new TestCaseBinding('Test Cases/CA_Test_6', 'Test Cases/CA_Test_6',  null), new TestCaseBinding('Test Cases/VideoReview/Written_review_ Existing acc - unverified', 'Test Cases/VideoReview/Written_review_ Existing acc - unverified',  null)])
