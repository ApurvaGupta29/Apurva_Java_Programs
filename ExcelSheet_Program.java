package Selenium24;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_Program {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream f1 = new FileInputStream("C:\\Users\\apgupta\\eclipse-workspace\\Selenium2024\\Excel_Data\\Apurva.xlsx");
Workbook wb = WorkbookFactory.create(f1);
String username = wb.getSheet("login").getRow(1).getCell(0).getStringCellValue(); //return type depend on last method
System.out.println(username);
String password = wb.getSheet("login").getRow(1).getCell(1).getStringCellValue(); //return type depend on last method
System.out.println(password);
String username_1 = wb.getSheet("login").getRow(2).getCell(0).getStringCellValue();
String password_1 =wb.getSheet("login").getRow(2).getCell(1).getStringCellValue();
System.out.println(username_1);
System.out.println(password_1);
	}

}
