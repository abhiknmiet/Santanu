package excelRead.excelRead;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.poi.EncryptedDocumentException;


public class App 
{
    public static void main( String[] args ) throws EncryptedDocumentException, IOException, SQLException
    {
    	ExcelRead excl=new ExcelRead();
    	
    	excl.readExcelData();
    }
}
