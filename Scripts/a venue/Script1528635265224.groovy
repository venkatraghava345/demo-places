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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa-business.ontroapp.com/venues/1/timetracker')

WebUI.setText(findTestObject('Page_Ontro (1)/input_email'), 'bala@ontroapp.com')

WebUI.setText(findTestObject('Page_Ontro (1)/input_password'), 'password')

WebUI.click(findTestObject('Page_Ontro (1)/button_Login'))

WebUI.setText(findTestObject('Page_Ontro (1)/input_form-control'), customer)

WebUI.sendKeys(findTestObject('Page_Ontro (1)/input_form-control'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Ontro (1)/small_aabb.com  9952290265'))

WebUI.click(findTestObject('Page_Ontro (1)/button_Check In'))

WebUI.click(findTestObject('Page_Ontro (1)/button_OK'))

