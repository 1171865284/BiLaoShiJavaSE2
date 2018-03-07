package io.bean;

import java.io.File;
import java.io.FilenameFilter;

public class FilterByName implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		
		//使用endwhith()方法将后缀名进行判断，判断是否.java这样过滤出来
		return name.endsWith(".java");
	}

}
