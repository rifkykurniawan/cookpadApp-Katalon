import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String finalName = 'Rifky ' + System.currentTimeMillis()

def words = ['Yogyakarta', 'Magelang', 'Surabaya', 'Malang', 'Jakarta']

def randomWord = words[new Random().nextInt(words.size())]

Mobile.startExistingApplication('com.mufumbo.android.recipe.search')

Mobile.verifyElementVisible(findTestObject('android.widget.TextView - Search'), 0)

Mobile.tapAtPosition(100, 260)

Mobile.tap(findTestObject('Object Repository/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Edit Profile'), 0)

Mobile.clearText(findTestObject('User Display Name'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Name'), finalName, 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Edit Profile - Location'), randomWord, 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - Update'), 0)

Mobile.verifyElementText(findTestObject('User Display Name Profile'), finalName)

Mobile.verifyElementText(findTestObject('Profile Page - Location'), randomWord)

Mobile.closeApplication()

