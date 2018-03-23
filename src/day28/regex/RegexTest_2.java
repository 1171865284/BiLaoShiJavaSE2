package day28.regex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/*
 * 程序功能： 网络爬虫
 * 程序员：魏国平
 * 编写时间：3月22日
 */

public class RegexTest_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<String> list = getWebMails();
		if (list.size() == 0) {
			System.out.println("没有获取到数据");
		}

		for (String mail : list) {
			System.out.println("mail:" + mail);
		}
	}

	@Test
	private static List<String> getWebMails() throws IOException {

		URL url = new URL("https://www.bing.com/search?q=google%E9%82%AE%E7%AE%B1%E8%B4%A6%E6%88%B7&qs=n&form=QBLH&sp=-1&pq=undefined&sc=0-8&sk=&cvid=8D7DD4335CFD44FEACE880CAF31C39E2");
		// 读取源文件
		InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
		BufferedReader bufr = null;
		if (inputStreamReader != null) {
			bufr = new BufferedReader(inputStreamReader);
		}

		// 对读取的数据进行规则的匹配。从中获取符合规则的数据
		String regex = "[a-zA-Z0-9_]+@QQ\\.+([a-zA-Z0-9]+)";
//		String regex = "创建gmail方法";

		List<String> list = new ArrayList<String>();

		Pattern p = Pattern.compile(regex);

		String line = null;

		while ((line = bufr.readLine()) != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				list.add(m.group());
			}
		}

		return list;
	}

	private static List<String> getMails() throws IOException {
		// TODO Auto-generated method stub
		
		// 读取源文件
		BufferedReader bufr = new BufferedReader(new FileReader("G:\\Regex\\Mails.txt"));

		// 对读取的数据进行规则的匹配。从中获取符合规则的数据
		String regex = "[a-zA-Z0-9_]+@gmail\\.+([a-zA-Z0-9]+)";

		List<String> list = new ArrayList<String>();

		Pattern p = Pattern.compile(regex);

		String line = null;

		while ((line = bufr.readLine()) != null) {
			Matcher m = p.matcher(line);
			while (m.find()) {
				list.add(m.group());
			}
		}

		return list;
	}

}
