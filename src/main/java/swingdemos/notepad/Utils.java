package swingdemos.notepad;

import javax.swing.*;

public class Utils {
	
	static JMenuBar createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		fileMenu.add("New");
		fileMenu.add("Open");
		fileMenu.add("Close");
		fileMenu.add("Save");
		
		JMenu editMenu = new JMenu("Edit");
		editMenu.add("Select All");
		editMenu.add("Paste");
		
		JMenu formatMenu = new JMenu("Format");
		formatMenu.add("New");
		formatMenu.add("Open");
		formatMenu.add("Close");
		formatMenu.add("Save");
		
		JMenu viewMenu = new JMenu("View");
		viewMenu.add("New");
		viewMenu.add("Open");
		viewMenu.add("Close");
		viewMenu.add("Save");
		
		
		JMenu helpMenu = new JMenu("Help");
		helpMenu.add("New");
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);
		
		return menuBar;
	}
}
