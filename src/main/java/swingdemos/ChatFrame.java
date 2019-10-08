package swingdemos;

import javax.swing.*;
import java.awt.*;

public class ChatFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Chat Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		JMenuBar top = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		fileMenu.add("Open");
		fileMenu.add("Save As");
		top.add(fileMenu);
		JMenu helpMenu = new JMenu("Help");
		top.add(helpMenu);
		
		JTextArea center = new JTextArea();
		
		JPanel bottom = new JPanel(new FlowLayout());
		JLabel label = new JLabel("Enter Text");
		JTextField textField = new JTextField(10);
		bottom.add(label);
		bottom.add(textField);
		JButton sendButton = new JButton("Send");
		JButton resetButton = new JButton("Reset");
		bottom.add(sendButton);
		bottom.add(resetButton);
		
		frame.getContentPane().add(BorderLayout.NORTH, top);
		frame.getContentPane().add(BorderLayout.CENTER, center);
		frame.getContentPane().add(BorderLayout.SOUTH, bottom);
		frame.setVisible(true);
	}
}
