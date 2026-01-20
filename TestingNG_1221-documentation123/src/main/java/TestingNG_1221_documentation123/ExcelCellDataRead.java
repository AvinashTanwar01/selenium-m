package TestingNG_1221_documentation123;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCellDataRead {

    public static void main(String[] args) throws IOException {
        // Specify the path of the Excel file
        String filePath = "./testdata/data1.xlsx";

        // Create an input stream for the Excel file
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));

        // Create a workbook instance
        Workbook workbook = new XSSFWorkbook(fileInputStream);

        // Get the first sheet from the workbook
        Sheet sheet = workbook.getSheetAt(0);

        // Specify the row and cell you want to read
        int rowIndex = 1; // Row index (0-based)
        int cellIndex = 2; // Cell index (0-based)

        // Get the specific row from the sheet
        Row row = sheet.getRow(rowIndex);

        if (row != null) {
            // Get the specific cell from the row
            Cell cell = row.getCell(cellIndex);

            if (cell != null) {
                // Switch based on the cell's type and print the value
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.println("String Value: " + cell.getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.println("Numeric Value: " + cell.getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.println("Boolean Value: " + cell.getBooleanCellValue());
                        break;
                    default:
                        System.out.println("Unknown Type");
                        break;
                }
            } else {
                System.out.println("Cell does not exist at row " + rowIndex + ", column " + cellIndex);
            }
        } else {
            System.out.println("Row does not exist at index " + rowIndex);
        }

        // Close the workbook and input stream
        workbook.close();
        fileInputStream.close();
    }
}
