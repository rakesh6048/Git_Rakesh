import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	public static void main(String args[]) throws IOException {
		
		FileInputStream fis = new FileInputStream("/Users/rakeshsingh/git/ExcelReader/ExcelDrivenFramework/Testdata.xlsx");
				
				//(System.getProperty("user.dir") + "\\Testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) {
			
           if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
        	   XSSFSheet sheet = workbook.getSheetAt(i);
        	   //identyfy Testcases column by scanning the entire 1st row
        	   
        	   Iterator<Row> rows=sheet.iterator();  //sheet is collection of Rows
        	   Row firstrow = rows.next();
        	   Iterator<Cell> cell = firstrow.cellIterator(); //rows is collection of cell
        	   int k=0;
        	   int column=0;
        	   while(cell.hasNext()) {
        		   
        		 Cell value = cell.next();
        		 if(value.getStringCellValue().equalsIgnoreCase("Testcases")) {
        			 
        			 column=k;
        		 }
        	   }
        	   System.out.println("column : "+column);
        	   while(rows.hasNext()) {
        		 
        		   Row r = rows.next();
        		   if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Add Profile")) {
        			   
        			 //after you grab purchase testcase row = pull all the data of that row and feed
        			 Iterator<Cell> cv=r.cellIterator();
        			 while(cv.hasNext()) {
        				 Cell c=cv.next();
        				 
        				 if(c.getCellTypeEnum()==CellType.STRING) {
        					 
        					 System.out.println(c.getStringCellValue());
        				 }else {
        					 System.out.println(NumberToTextConverter.toText(c.getNumericCellValue()));
        				 }
        			 }
        		   }
        	   }
           }
		}
	}

}
