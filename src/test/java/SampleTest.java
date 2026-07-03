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
		
		
	}
}
