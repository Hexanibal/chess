package com.chess.gui;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame{

	Pan p;
	
	public Window() {
		p = new Pan();
		
		init();
		this.setVisible(true);
	}
	
	private void init() {
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setUndecorated(false);
		this.setContentPane(p);
		this.pack();
	}
	
}
