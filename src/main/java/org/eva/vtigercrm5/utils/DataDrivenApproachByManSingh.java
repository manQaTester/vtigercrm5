package org.eva.vtigercrm5.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenApproachByManSingh {

	@Test(priority = 1)
	public void TestData() throws IOException {
		List<Map<String, String>> testCaseDataMap = getAllTestCaseData("form", "VT001");
		for (int i = 0; i < testCaseDataMap.size(); i++) {
			System.out.println(testCaseDataMap.get(i));
		}
	}

	@Test(priority = 2, dataProvider = "getData")
	public void verifyVT001CreateAccount(Object dataObj) {
		Map<String, String> mapData = (Map<String, String>) dataObj;
		System.out.println(mapData.get("AccountName").trim());
		System.out.println("hello");

	}

	
	
	
	@DataProvider
	public Object[][] getData(Method mt) throws IOException {
		List<Map<String, String>> testCaseDataMap = getAllTestCaseData("form", mt.getName());
		int matchingTestcaseCount = testCaseDataMap.size();
		Object[][] dim2Arr = new Object[matchingTestcaseCount][1];
		for (int i = 0; i < matchingTestcaseCount; i++) {
			dim2Arr[i][0] = testCaseDataMap.get(i);
		}
		return dim2Arr;
	}

	public List<Map<String, String>> getAllTestCaseData(String sheetName, String testCaseId)
			throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\formData.xlsx");
		Workbook work = null;
		try {
			work = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheetObj = work.getSheet(sheetName);
		List<Integer> allTcRowNumbersList = getAllRowNumbersByTestCaseID(sheetObj, testCaseId);
		List<Map<String, String>> listOfMapData = new ArrayList<Map<String, String>>();
		for (int j = 0; j < allTcRowNumbersList.size(); j++) {
			int rowNumber = allTcRowNumbersList.get(j);
			Row rowObj = sheetObj.getRow(rowNumber);
			Map<String, String> mapObj = new HashMap<String, String>();
			for (int i = 3; i < rowObj.getLastCellNum(); i = i + 2) {
				String cellDataKey = getCellData(rowObj, i);
				String cellDataValue = getCellData(rowObj, i + 1);
				mapObj.put(cellDataKey, cellDataValue);
			}
			listOfMapData.add(mapObj);
		}

		return listOfMapData;
	}

	// this method will read data from excel on the basis of row object and cell
	// number
	// it will manage data whether it is in string or integer
	public String getCellData(Row rowObj, int cellNumber) {
		String data = null;
		Cell cellObj = rowObj.getCell(cellNumber, MissingCellPolicy.CREATE_NULL_AS_BLANK);
		if (cellObj.getCellType() == CellType.STRING) {
			data = cellObj.getStringCellValue();

		} else if (cellObj.getCellType() == CellType.NUMERIC) {
			Double dbl = cellObj.getNumericCellValue();
			Integer intValue = dbl.intValue();
			data = intValue.toString();
		}
		return data;
	}

	/// below lines will search for testcase id in data sheet
	/// and will give row number where data exist
	public List<Integer> getAllRowNumbersByTestCaseID(Sheet sheetObj, String TestCaseID) {
		List<Integer> allTcRowNumbers = new ArrayList<Integer>();
		for (int i = 1; i <= sheetObj.getLastRowNum(); i++) {
			Row rowObj = sheetObj.getRow(i);
			Cell cellObj = rowObj.getCell(2);
			String cellValue = cellObj.getStringCellValue();
			// System.out.println(cellValue);
			if (TestCaseID.contains(cellValue.trim())) {
				allTcRowNumbers.add(i);
			}
		}
		return allTcRowNumbers;
	}

}
