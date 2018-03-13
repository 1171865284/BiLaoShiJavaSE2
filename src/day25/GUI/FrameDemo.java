package day25.GUI;

/*
 * 程序功能：GUI---图形化界面---Frame窗体--我们使用了事件的监听，达到了点击事件经行退出窗体
 * 程序员：魏国平
 * 编写时间：3月13日
 */

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frame = new Frame("my frame");
		//设置窗体大小
//		frame.setSize(500, 400);
		
		//设置窗体的边距和大写
		frame.setBounds(400, 200, 500, 600);
		frame.setLayout(new FlowLayout());

		Button but = new Button("按钮");

//		but.setBounds(100, 100, 200, 200);
//		but.setSize(50, 50);
		
		frame.add(but);
		
		
		//进行事件的监听
		//适配器---windowAdaptener
		//窗体监听addWindowListener(new WindowAdaptener)
		frame.addWindowListener(/**
		 * @author Cyan-King
		 *
		 */
		new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
//				System.out.println("cosing...." + e);
				//使用退出事件
				System.exit(0);
				
			}
			
			
		});
		
		//活动监听addActionListener()
		but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

		frame.setVisible(true);

	}

}
