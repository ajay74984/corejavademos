package swingdemos.notepad;

import javax.swing.*;
import java.awt.*;

public class MainScreen {
	
	public static void main(String[] args) {
		JFrame mainWindow = new JFrame("Notepad3");
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.getContentPane().add(Utils.createMenuBar(), BorderLayout.NORTH);
		JTextArea textArea = new JTextArea();
		JPanel center = new JPanel();
		center.add(textArea);
		JScrollPane jScrollPane = new JScrollPane(center,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		mainWindow.getContentPane().add(jScrollPane);
		//mainWindow.add(textArea, BorderLayout.CENTER);
		mainWindow.setSize(300, 300);
		mainWindow.setVisible(true);
		
	}
}
