package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Downloads\\selenuim.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Students");
		Row r =sh.getRow(7);
		Cell c =r.getCell(9);
		String value = c.getStringCellValue();
		System.out.println(value);
		

	}

}
