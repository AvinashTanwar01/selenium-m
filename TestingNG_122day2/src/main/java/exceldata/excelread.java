package exceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelread {
	public String excelRCD(int vRow,int vColumn) throws IOException {
		String value=null;
		Workbook wb = null;
		
		FileInputStream fi= new FileInputStream("../TestData/day1.xlsx");
		wb = new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheetAt(0);
		Row row= sheet.getRow(vRow);
		Cell cell = row.getCell(vColumn);
		value= cell.getStringCellValue();
		return value;
	}

}
