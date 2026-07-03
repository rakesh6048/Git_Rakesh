import java.io.IOException;
import java.util.ArrayList;

public class SampleTest {

	public static void main(String[] args) throws IOException {
		
		 DataDriven d = new DataDriven();
		
         ArrayList<?> data=d.getData("RsetAddbook");
         
         System.out.println(data.get(1));
         System.out.println(data.get(2));
         System.out.println(data.get(3));
         System.out.println(data.get(4)); 
         System.out.println(data.get(5));   
         System.out.println(data.get(6));   
         System.out.println(data.get(7)); 
         System.out.println(data.get(8)); 
         System.out.println(data.get(9)); 
         System.out.println(data.get(10)); 
         
         //Add below code in develop branch
         
         System.out.println(data.get(11)); 
         System.out.println(data.get(12)); 
         System.out.println(data.get(13)); 
         
		
		
	}
}
