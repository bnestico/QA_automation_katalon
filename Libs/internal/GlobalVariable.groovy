package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object main_site_url
     
    /**
     * <p></p>
     */
    public static Object superuser_username
     
    /**
     * <p></p>
     */
    public static Object superuser_password
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['main_site_url' : 'https://qa.consumeraffairs.com/', 'superuser_username' : 'dev+qa@consumeraffairs.com', 'superuser_password' : '9am3j4ZOpIRosZM29VAII5nt'])
        allVariables.put('staging', allVariables['default'] + ['main_site_url' : 'https://staging.consumeraffairs.com/', 'superuser_username' : 'dev+qa@consumeraffairs.com', 'superuser_password' : '9am3j4ZOpIRosZM29VAII5nt'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        main_site_url = selectedVariables['main_site_url']
        superuser_username = selectedVariables['superuser_username']
        superuser_password = selectedVariables['superuser_password']
        
    }
}
