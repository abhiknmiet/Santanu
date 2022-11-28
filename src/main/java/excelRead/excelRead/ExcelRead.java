package excelRead.excelRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	DButility db=new DButility();
	ProdEvent prdEvent=new ProdEvent();
	void readExcelData() throws EncryptedDocumentException, IOException, SQLException{
		
		final String SAMPLE_XLSX_FILE_PATH = System.getProperty("user.dir") + "\\src\\Files\\NR01.xlsx";
		
		
		// Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
        
     // Retrieving the number of sheets in the Workbook
        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
        
       
        
        System.out.println("Retrieving Sheets using for-each loop");
        for(Sheet sheet: workbook) {
            System.out.println("=> " + sheet.getSheetName());
        }
        
		for (int i = 0; i < 1; i++) {
			// Getting the Sheet at index zero
			Sheet sheet = workbook.getSheetAt(i);

			// Create a DataFormatter to format and get each cell's value as String
			DataFormatter dataFormatter = new DataFormatter();

			String sqlForCreateTable = "CREATE TABLE " + sheet.getSheetName() + "(PRODUCT_CODE VARCHAR(255), " + " EVENT_CODE VARCHAR(255), SEQ_NO INTEGER not NULL)";
			
			db.createTableIntoDB((sheet.getSheetName()), sqlForCreateTable);
			
			// you can use a for-each loop to iterate over the rows and columns
			System.out.println("\nIterating over Rows and Columns using for-each loop\n");
			String insertData = null;
			for (Row row : sheet) {

				int rowNum = row.getRowNum();
				if (rowNum == 0) {
					rowNum++;
					continue;
				}
				int cellNumber = 0;
				for (Cell cell : row) {

					String cellValue = dataFormatter.formatCellValue(cell);
					if (cellNumber == 0) {

						System.out.print(cellValue + "\t");

						prdEvent.setPRODUCT_CODE(cellValue);
					} else if (cellNumber == 1) {
						prdEvent.setEVENT_CODE(cellValue);
					} else {
						prdEvent.setSEQ_NO(Integer.parseInt(cellValue));
					}

					cellNumber++;

				}
				insertData = "INSERT INTO " + sheet.getSheetName() + " VALUES ('" + prdEvent.getPRODUCT_CODE() + "', '"
						+ prdEvent.getEVENT_CODE() + "', " + prdEvent.getSEQ_NO() + ")";
				System.out.println(insertData);
				db.insertData(insertData);
				
				System.out.println();
			}
			

			
			
			

		}
        
        // Closing the workbook
        workbook.close();
		
	}

}
