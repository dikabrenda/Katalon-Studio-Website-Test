## Script View

```groovy
'User open browser'
WebUI.openBrowser(GlobalVariable.url)

//'User click icon mobil'
//WebUI.click(findTestObject('cariMobil/icon_mobil'))

'User select merek mobil'
WebUI.selectOptionByValue(findTestObject('cariMobil/merk_mobil'), merkMobil, false)

'User select type mobil'
WebUI.selectOptionByValue(findTestObject('cariMobil/seri_mobil'), typeMobil, false)

'User select tahun mobil'
WebUI.selectOptionByValue(findTestObject('cariMobil/tahun_mobil'), tahunMobil, false)

'User select harga mobil'
WebUI.selectOptionByValue(findTestObject('cariMobil/harga_mobil'), hargaMobil, false)

'User click tombol cari'
WebUI.click(findTestObject('cariMobil/button_cari'))

'Delay'
WebUI.delay(2)

if (merkMobil == 'HONDA') {
    'Mencari Mobil Honda'
    WebUI.click(findTestObject('typeMobil/mobil_hrv'))
} else if (merkMobil == 'TOYOTA') {
    'Mencari Mobil Toyota'
    WebUI.click(findTestObject('typeMobil/mobil_avanza'))
} else if (merkMobil == 'DAIHATSU') {
    'Mencari Mobil Ayla'
    WebUI.click(findTestObject('typeMobil/mobil_ayla'))
} else {
    'Error Message'
    println('ERROR!')
}

WebUI.delay(2)

if (typeMobil == 'CR-V') {
   'Verify user berhasil mencari mobil honda HRV'
   WebUI.verifyTextPresent('HONDA CR-V 2.0', true, FailureHandling.CONTINUE_ON_FAILURE)
	'Screenshot'
   WebUI.takeScreenshotAsCheckpoint('C:\\Users\\BMT\\Katalon Studio\\ibidProject\\Screenshot')
	println ("Verify User berhasil mencari honda HRV")
}     else if (typeMobil == 'AVANZA') {
      'Verify user berhasil mencari mobil Toyota Avanza'
      WebUI.verifyTextPresent('TOYOTA AVANZA 1.5 G', true, FailureHandling.CONTINUE_ON_FAILURE)
	    'Screenshot'
	    WebUI.takeScreenshotAsCheckpoint('C:\\Users\\BMT\\Katalon Studio\\ibidProject\\Screenshot')
	    println ("Verify User berhasil mencari mobil toyota avanza")
}     else if (typeMobil == 'AYLA') {
      'Verify user berhasil mencari mobil Daihatsu Ayla'
      WebUI.verifyTextPresent('DAIHATSU AYLA 1.0 M', true, FailureHandling.CONTINUE_ON_FAILURE)
	    'Screenshot'
	    WebUI.takeScreenshotAsCheckpoint('C:\\Users\\BMT\\Katalon Studio\\ibidProject\\Screenshot')
	    println ("Verify User berhasil mencari mobil Daohatsu Ayla")
}     else {
      'Error Message'
      println ('ERORR!')
}

'Close Browser'
WebUI.closeBrowser()
```
