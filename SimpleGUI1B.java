package gui;

import javax.swing.*;

import java.awt.Button;
import java.awt.event.*;



public class SimpleGUI1B implements ActionListener { //an instance of SimpleGUI1B is an ActionListener
	JButton button;
	
	
	public static void main(String[] args) {
		SimpleGUI1B gui = new SimpleGUI1B();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		button.addActionListener(this);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		button.setText("I've been clicked!" + String.valueOf(e.hashCode()));
		
//		button.setText(String.valueOf(e.hashCode()));
	}

}
