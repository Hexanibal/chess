package com.chess.gui;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.chess.Main;
import com.chess.gui.interactions.MouseInteractions;

@SuppressWarnings("serial")
public class Pan extends JPanel{
	
	public Pan() {
		this.setPreferredSize(new Dimension(Main.sx, Main.sy));
		this.addMouseListener(new MouseInteractions());
	}
	
	protected void paintComponent(Graphics g) {
		Main.game.getBoard().displayBoard(g, this);
		Main.game.getBoard().displayPieces(g, this);
	}
	
}
