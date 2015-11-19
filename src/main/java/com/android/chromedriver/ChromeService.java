package com.android.chromedriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriverService;

public class ChromeService {
	private static ChromeDriverService service = null;
	
    public static void startService() throws IOException {
        System.setProperty("webdriver.chrome.logfile", "./log/chromedriver.log");
        service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("./chromedriver.exe"))
                .usingAnyFreePort()
                .build();
        service.start();
    }
    
    public static void stopService() {
    	if (service != null)
    		service.stop();
    }
    
    public static ChromeDriverService getService() {
    	return service;
    }
}

