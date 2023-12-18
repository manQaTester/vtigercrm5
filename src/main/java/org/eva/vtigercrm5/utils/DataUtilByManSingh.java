package org.eva.vtigercrm5.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataUtilByManSingh {
	public static void main(String[] args) throws IOException {
		Map<String , String > allData=testCaseData("form","VT002");
		  
			System.out.println(allData.get("phone"));
			
		 
	}
	
	public static Map<String ,String > testCaseData(String sheetName,String testCaseId) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\formData.xlsx");
		Workbook work = null;
		try {
			work = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet sheetObj = work.getSheet(sheetName);
		int rowNumber=getRowNumberByTestCaseID(sheetObj, testCaseId);
		Row rowObj=sheetObj.getRow(rowNumber);
		Map<String ,String > mapObj=new HashMap<String ,String >();
		for (int i = 3; i < rowObj.getLastCellNum(); i=i+2) {
			String cellDataKey=getCellData(rowObj,i);
			String cellDataValue=getCellData(rowObj,i+1);
			mapObj.put(cellDataKey, cellDataValue);
		}
		return mapObj;
	}

	// this method will read data from excel on the basis of row object and cell number
	// it will manage data whether it is in string or integer
	public static String getCellData(Row rowObj,int cellNumber) {
		String data=null;
		Cell cellObj=rowObj.getCell(cellNumber,MissingCellPolicy.CREATE_NULL_AS_BLANK);
		if (cellObj.getCellType()==CellType.STRING) {
			 data=cellObj.getStringCellValue();

		} else if(cellObj.getCellType()==CellType.NUMERIC){
			 Double dbl=cellObj.getNumericCellValue();
			 Integer intValue=dbl.intValue();
			   data=intValue.toString();
		}
		return data;
	}
	 
	/// below lines will search for testcase id in data sheet 
			/// and will give row number where data exist
	public static int getRowNumberByTestCaseID(Sheet sheetObj,String TestCaseID) {
		int rowNumber=-1;
		for(int i=1;i<=sheetObj.getLastRowNum();i++) {
			Row rowObj=sheetObj.getRow(i);
			Cell cellObj=rowObj.getCell(2);
			String cellValue=cellObj.getStringCellValue();
			//System.out.println(cellValue);
			if(cellValue.trim().equalsIgnoreCase(TestCaseID)) {
				rowNumber=i;
				break;
			}
		}
		return rowNumber;
	}

}
