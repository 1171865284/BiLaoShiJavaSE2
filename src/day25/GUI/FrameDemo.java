package day25.GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FrameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frame = new Frame("my frame");
		frame.setBounds(400, 200, 400, 500);
		frame.setLayout(new FlowLayout());

		Button but = new Button("按钮");

		frame.add(but);

		frame.setVisible(true);

	}

}
