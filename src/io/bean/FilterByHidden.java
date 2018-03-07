package io.bean;

import java.io.File;
import java.io.FileFilter;

public class FilterByHidden implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		
		//过滤出隐藏起来的文件
		return pathname.isHidden();
	}

}
