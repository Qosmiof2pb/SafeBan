package org.qosmiof2.gui.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI {
	
	private static JFrame frame = new JFrame("Safety stop");
	private static JComboBox cb = new JComboBox();
	private static JButton button = new JButton("The Script can start");
	private static JLabel label = new JLabel("After how many hours" +"the script should stop");
	private static JPanel panel = new JPanel();
	
	public static int hours;
	
	public static void GUI(){
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(500, 300, 300, 100);
		frame.add(panel);
		frame.setResizable(false);
		
		panel.setLayout(null);
		panel.add(button);
		panel.add(cb);
		panel.add(label);

		cb.setBounds(50, 30, 70, 40);
		cb.addItem("1");
		cb.addItem("2");
		cb.addItem("3");
		cb.addItem("4");
		cb.addItem("5");
		cb.addItem("Never");
		
		label.setBounds(10, 10, 300, 20);
		
		button.setBounds(130, 30, 150, 40);
		
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				hours = Integer.parseInt(cb.getSelectedItem().toString()) * 3600;
				
				frame.dispose();
				
			}
			
		});
		
		
		
	}


}
