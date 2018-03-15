package day25.GUI;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuDemo {

	private Frame frame;
	private MenuBar mb;

	public MenuDemo() {

		init();

	}

	private void init() {
		// TODO Auto-generated method stub
		frame = new Frame("my menu");
		mb = new MenuBar();

		frame.setBounds(400, 200, 500, 500);
		frame.setLayout(new FlowLayout());
		frame.setMenuBar(mb);
		Menu file = new Menu("File");
		mb.add(file);
		MenuItem newItem = new MenuItem("New");
		file.add(newItem);
		MenuItem saveItem = new MenuItem("Save");
		file.add(saveItem);

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MenuDemo();
	}

}
