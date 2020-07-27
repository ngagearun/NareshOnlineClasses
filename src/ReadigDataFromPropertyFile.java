import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadigDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Documents\\NareshTraining\\configuration.properties");
		Properties p=new Properties();
		p.load(fi);
		System.out.println(p.getProperty("browsername"));
		System.out.println(p.getProperty("appurl"));
		fi.close();

	}

}
