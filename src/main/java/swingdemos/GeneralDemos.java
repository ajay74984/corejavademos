package swingdemos;

import javax.swing.*;

public class GeneralDemos {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		JButton pressButton = new JButton("Press Me");
		JButton pressButton1 = new JButton("Press Me Again");
		frame.getContentPane().add(pressButton);
		frame.getContentPane().add(pressButton1);
		frame.setVisible(true);
	}
}
