import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/c4/sk2v9nzx6k56lv2gtq69phyc0000gn/T/Katalon/Test Cases/Categories/Category_test_1/20180828_105111/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Categories/Category_test_1', new TestCaseBinding('Test Cases/Categories/Category_test_1',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
