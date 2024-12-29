package practiceDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SampleDataDrivenTesting {

	public static void main(String[] args) throws IOException {
		// step1 : get the java representation object of the physical file
		
		FileInputStream fis =new FileInputStream("C:\\Users\\Shree\\Desktop\\commondata.properties");
		
		
		//step2 : using Properties class,load all the keys
		
		Properties pObj=new Properties();
		pObj.load(fis);
		
		//step 3 : get the value based on key

System.out.println(pObj.getProperty("browser"));
	}

}