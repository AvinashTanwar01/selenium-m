package mainpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public object[][] excelRCD(int vRow,int vColumn) throws IOException {
		String value=null;
		Workbook wb = null;
		
		FileInputStream fi= new FileInputStream("./data/data2.xlsx");
		wb = new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheetAt(0);
		Row row= sheet.getRow(vRow);
		Cell cell = row.getCell(vColumn);
		value= cell.getStringCellValue();
		List<String> data1= new ArrayList<>();
		for(Row row1: sheet) {
			for(Cell cell1:row1) {
				data1.add(cell1.getStringCellValue());
			}
		}
		
		
		return value;
	}
	public void insertData1(int vRow1, int vColumn1 , String status) throws IOException {


		 FileInputStream fis = new FileInputStream("./data/data2.xlsx");
		 Workbook wb = new XSSFWorkbook(fis);
		 Sheet sheet = wb.getSheetAt(0);

		 Row row = sheet.getRow(vRow1);
		 Cell cell = row.getCell(vColumn1);
		 cell.setCellValue(status);
		      
		 System.out.println("Value inserted: " + status);
		
		

	}
}
