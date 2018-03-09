package day23.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.bean.SuffixFilter;

/*
 * 获取指定目录下，指定扩展名的文件（包括子目录中的文件）、
 * 这些文件的据对路径写入到一个文本文件中
 * 
 * 
 * 思路：
 * 	1.首先我们先要获取指定目录的路径
 * 	2.深度遍历一遍这个目录（在这里我们可以使用递归的方法遍历一遍）
 * 	3.在遍历的时候我们就要用到扩张名的过滤
 * 	4.既然是将所有路径都写进去那么我们就要有到list集合
 * 	5.将读到的绝对路径之后我们将他写到指定的温江当中
 */

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File dir = new File("D:\\code\\JavaSE");
		
		List<File> list = new ArrayList<File>();
		
		SuffixFilter suff = new SuffixFilter(".java");
		
		getFileList(dir, suff, list);
		
		File destFile = new File("G:\\javaPath1.txt");
		
		writerToFile(list, destFile);
		
	}
	
	public static void getFileList(File dir, SuffixFilter suff, List<File> list){
		
		File[] files = dir.listFiles();
		
		for(File file : files){
			if (file.isDirectory()) {
				//递归循环
				getFileList(file, suff, list);
			}else {
				//过滤文件
				if (suff.accept(dir, file.getName())) {
					//将顾虑的文件添加到list当中
					list.add(file);
				}
			}
		}
	}
	
	public static void writerToFile(List<File> list, File destFile) throws IOException{
		
		
		BufferedWriter bufw = new BufferedWriter(new FileWriter(destFile));
		
		for(File file :list){
			bufw.write(file.getAbsolutePath());
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
	}

}
