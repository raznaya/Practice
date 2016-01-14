package lv.sonya.shopping;

import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ShoppingGUI {
	
	JFrame frame = new JFrame();
	JButton button = new JButton("click on me!");
	
	frame.getContentPane().add(button);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(300,300);
	frame.setVisible(true);
	
}