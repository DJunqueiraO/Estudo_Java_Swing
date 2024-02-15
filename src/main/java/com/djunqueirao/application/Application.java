package main.java.com.djunqueirao.application;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import main.java.com.djunqueirao.components.DFrame;
import main.java.com.djunqueirao.components.DGridBagConstraints;
import main.java.com.djunqueirao.components.DPanel;

public class Application {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
				() -> {
					DFrame frame = new DFrame();
					frame.setSize(400, 400);
					frame.setVisible(true);
					
					DPanel panel = new DPanel();
					frame.add(panel);
					panel.setVisible(true);
					
					String[][] buttons = new String[][] {
						new String[] {"1", "2", "3", "+"},
						new String[] {"4", "5", "6", "-"},
						new String[] {"7", "8", "9", "*"}, 
		                new String[] {"0", ".", "=", "/"}
					};
					
					for (int line = 0; line < buttons.length; line++) {
						DPanel linePanel = new DPanel();
						panel.add(linePanel, new DGridBagConstraints().setFillBoth());
						linePanel.setVisible(true);
						for (int column = 0; column < buttons[line].length; column++) {
							linePanel.add(new JButton(buttons[line][column]), new DGridBagConstraints().setGrid(line, column).setFillBoth());
							linePanel.add(new JButton(buttons[line][column]), new DGridBagConstraints().setGrid(line, column).setFillBoth());
							linePanel.add(new JButton(buttons[line][column]), new DGridBagConstraints().setGrid(line, column).setFillBoth());
						}
					}
				}
		);
	}
}
