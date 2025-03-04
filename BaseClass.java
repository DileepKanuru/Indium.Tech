
package baseClass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import iSAFE.ApplicationKeywords;

public class BaseClass extends ApplicationKeywords {
	
	public static boolean generateExcelReport = false;
	
	public static String filepath="/data/Execution_Table.xlsx";
	public static String currentFilePath;
	

	public  FileInputStream file;
	public  FileOutputStream outputFile;
	/*public  XSSFWorkbook workbook;
	public  XSSFSheet sheet;
	
	public static HashMap<String , String> startTimeCount = new HashMap<String, String>();
	public static HashMap<String , String> endTimeCount = new HashMap<String, String>();
	public static HashMap<String , String> durationCount = new HashMap<String, String>();
	public static HashMap<String , String >  osCount=new HashMap<String, String>();
	public static HashMap<String , String >  osVersionCount=new HashMap<String, String>();
	public static HashMap<String , String >  browserVersionCount=new HashMap<String, String>();
	public static HashMap<String , String > browserCount=new HashMap<String, String>();*/
	
	////////////////////////////////////////////////////////////////////////////////
	// Function Name :
	// Purpose :
	// Parameters :
	// Return Value :
	// Created by :
	// Created on :
	// Remarks :
	/////////////////////////////////////////////////////////////////////////////////

	public BaseClass() {

	}

	public void setup(String machineName, String host, String port, String browser, String os, String browserVersion,
			String osVersion, String sheetNo) {
		testDataSheetNo = Integer.parseInt(sheetNo);
		setEnvironmentTimeouts();

		openBrowser(machineName, host, port, browser, os, browserVersion, osVersion);
		testResultsFolder(machineName.replace(" ", ""), host, port, browser, os, browserVersion, osVersion);
		currentExecutionMachineName(machineName.replace(" ",""), os, osVersion, browserVersion);

//		currentExecutionMachineName(machineName.replace(" ", ""));
	}

	public void setEnvironmentTimeouts() {
		setTimeouts();
	}

	public void closeAllSessions() {
		driver.quit();
	}
} 
