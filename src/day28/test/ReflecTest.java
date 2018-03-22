package day28.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReflecTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Mainboard mb = new Mainboard();
		mb.run();
		
		File confile = new File("D:\\code\\JavaSE\\BiLaoShiJavaSE2-master\\src\\day28\\test\\pci.properties");
		
		FileInputStream fis = new FileInputStream(confile);
		Properties prop = new Properties();
		
		//将文件加载到properties里面
		prop.load(fis);
		for (int x = 0; x < prop.size(); x++) {
			String pciName = prop.getProperty("pci" + (x+1));
			Class clazz = Class.forName(pciName);
			PCI p = (PCI) clazz.newInstance();
			mb.usePCI(p);
		}
		
		fis.close();
	}

}
