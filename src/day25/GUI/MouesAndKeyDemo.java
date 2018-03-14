package day25.GUI;

/*
 * 程序功能：鼠标和键盘的点击事件
 * 程序员：魏国平
 * 编写时间：3月14日
 */

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouesAndKeyDemo {

	private Frame frame;
	private TextField textField;
	private Button but;

	public MouesAndKeyDemo() {

		Init();
	}

	/**
	 * 
	 */
	public void Init() {
		frame = new Frame("演示鼠标和键盘的监听");

		frame.setBounds(200, 200, 400, 400);
		frame.setLayout(new FlowLayout());

		textField = new TextField(15);

		but = new Button("一个可以双击的按钮");

		// 添加到窗体当中
		frame.add(textField);
		// 添加按钮到窗体当中
		frame.add(but);

		// textField.setBounds(50, 50, 100, 50);

		myEvent();

		frame.setVisible(true);
	}

	// 窗体监听
	private void myEvent() {
		// TODO Auto-generated method stub

		frame.addWindowListener(new WindowAdapter() {

			// 设置关闭的监听事件
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				// super.windowClosing(e);
				System.exit(0);
			}

		});
		
		//按钮事件
		but.addMouseListener(new MouseAdapter() {

			private int count = 0;
			//moseEntered是触发执行
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
//				if (e.getClickCount() == 2) {
//					textField.setText("run Entered ....." + count++);
//				}
				/*//只要移置按钮就相当于触摸一样
				textField.setText("run Entered ....." + count++);*/
				
//				System.out.println(e);
				
			}
			
			//这个是一个点击执行
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getClickCount() == 2) {
					textField.setText("run Entered ....." + count++);
				}
			}
			
			
			
			
		});
		
		textField.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

				System.out.println("run key..." + e.getKeyChar() + "::" + KeyEvent.getKeyText(e.getKeyCode()));
				/*int code = e.getKeyCode();e.getKeyCode()
				if (!(code >= e.VK_0 && code <= e.VK_9)) {
					e.consume();
				}*/
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MouesAndKeyDemo();
	}

}
