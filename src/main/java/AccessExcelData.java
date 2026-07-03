import java.io.IOException;
import java.util.ArrayList;

public class AccessExcelData {

	public static void main(String args[]) throws IOException {
		// TODO Auto-generated constructor stub
		
		ReadDataFromExcel readExcel = new ReadDataFromExcel();
		
		ArrayList data = readExcel.readDataFromExcel("Add Profile", "Teastcases", "testdata");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
}
