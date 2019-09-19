package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class fio {
  @Test
  public void f() throws IOException
  {
	File src= new File("C://Users//A08019DIRP_C2C.02.02//Desktop//file//data.xlsx");  
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet1=wb.getSheetAt(0);

	int la= sheet1.getLastRowNum();
    System.out.println("last : "+la);
    int fi= sheet1.getFirstRowNum();
    System.out.println("last : "+fi);
    //int rowCount = sheet1.getLastRowNum()-sheet1.getFirstRowNum();
    int rowCount = sheet1.getLastRowNum();

 
 //  Row row = sheet1.getRow(0);


   // Row newRow = sheet1.createRow(rowCount+1);

    for(int j = 0; j < rowCount; j++)
    {
       
	String data0 = sheet1.getRow(j).getCell(0).getStringCellValue();
	System.out.println("Data from excel is : "+data0);
	
	String data1 = sheet1.getRow(j).getCell(1).getStringCellValue();
	System.out.println("Data from excel is : "+data1);
	
	String data2 = sheet1.getRow(j).getCell(2).getStringCellValue();
	System.out.println("Data from excel is : "+data2);
	
	wb.close();
    }
	
  }
}
