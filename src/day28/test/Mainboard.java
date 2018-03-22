package day28.test;

import java.nio.file.attribute.UserPrincipal;

/*
 * 电脑主板
 */

public class Mainboard {

	public void run(){
		System.out.println("main board run .....");
	}
	
	public void usePCI(PCI p){
		if (p != null) {
			p.open();
			p.close();
		}
	}
	
	

}
