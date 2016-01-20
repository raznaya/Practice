package lv.sonya.shopping;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ShoppingGUI implements ActionListener {

	JButton button;

	public static void main(String[] args) {

		ShoppingGUI gui = new ShoppingGUI();
		gui.go();

	}

	public void go() {
		JFrame frame = new JFrame();
		MyDrawPanel panel = new MyDrawPanel();

		frame.getContentPane().add(panel);

		button = new JButton("click on me!");

		button.addActionListener(this);

		// frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		button.setText("I`ve been clicked");
	}

}