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


RunConfiguration.setExecutionSettingFile('/var/folders/88/ywvz3bxs7138b02_sxvf0xp00000gn/T/Katalon/Test Cases/Login to Main Site/20180909_225018/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/Login to Main Site', new TestCaseBinding('Test Cases/Login to Main Site',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
