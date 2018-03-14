package day25.GUI;

/*
 * 程序功能：GUI界面的读取文本框中的数据读取目录中的数据然后输入到文本区域当中
 * 程序员：魏国平
 * 编写时间：3月14日
 */

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class GUIDir {

	protected static final String LINE_SEPARATOR = System.getProperty("line.separator");
	//初始化变量
	private Frame frame;
	private TextField textField;
	private Button button;
	private TextArea textArea;

	
	public GUIDir() {
		Init();
	}

	// 在这里我们设置GUI界面
	private void Init() {
		// TODO Auto-generated method stub

		//设置组件的数据
		frame = new Frame("My Window");
		button = new Button("转到");
		textField = new TextField(40);
		textArea = new TextArea();
		
		frame.setLayout(new FlowLayout());

		frame.setSize(800, 800);
		frame.setLocation(400, 200);

		button.setBounds(50, 50, 100, 50);
		textField.setBounds(50, 50, 400, 50);
		textArea.setBounds(100, 50, 500, 800);

		frame.add(button);
		frame.add(textField);
		frame.add(textArea);

		myEven();

		frame.setVisible(true);

	}

	private void myEven() {
		frame.addWindowListener(new WindowAdapter() {

			// 我们使用windowClosing关闭Frame
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				showDir();

			}

			
			
		});
		
		textField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					showDir();
				}
			}
			
			
		});
	}

	/**
	 * @param e
	 */
	public void showDir() {
		// TODO Auto-generated method stub
		/*
		 * 通过点击按钮获取文本框中的目录 将目录中的内容显示到文本区域中
		 */

		// 但是我们无法清空刷新一遍我们只能这么做
		textArea.setText("");

		// 通过button的点击事件获取文本空中的目录
		String dir_str = textField.getText();

		// 将目录封装起来
		File dir = new File(dir_str);

		if (dir.exists() && dir.isDirectory()) {
			// 遍历目录
			File[] names = dir.listFiles();

			for (File name : names) {
				textArea.append(name.getAbsolutePath() + LINE_SEPARATOR);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GUIDir();
	}

}
