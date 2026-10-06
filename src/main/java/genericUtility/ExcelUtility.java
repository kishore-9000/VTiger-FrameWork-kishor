package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	/**
	 * @author kishore
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @param value
	 * @return 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getDataFromExcel(String sheetName,int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet(sheetName);
		Row r =sh.getRow(rowIndex);
		Cell c =r.getCell(cellIndex);
		DataFormatter df = new DataFormatter();
		String value1 =df.formatCellValue(c);
		return value1;
	}
	/**
	 * @author kishore
	 * @param svalue
	 * @param rowIndex
	 * @param cellIndex
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public void writeExcelUtilityFile(String sheetvalue,int rowIndex,int cellIndex,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet(sheetvalue);
		Row r =sh.getRow(rowIndex);
		Cell c =r.getCell(cellIndex);
		c.setCellValue(value);
		FileOutputStream fos =new FileOutputStream(IPathUtility.excelPath);
		wb.write(fos);
		
		}
	
}
