package main.java.com.djunqueirao.application;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import main.java.com.djunqueirao.components.DFrame;
import main.java.com.djunqueirao.components.DGridBagConstraints;
import main.java.com.djunqueirao.components.DPanel;
import main.java.com.djunqueirao.components.DTextField;

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
					
					DTextField textField = new DTextField().setFont(Font.MONOSPACED, Font.BOLD, 30);
					panel.add(textField, new DGridBagConstraints().setGrid(0, 0).setFillHorizontal());
					textField.setVisible(true);
					
					DPanel buttonsPanel = new DPanel();
					panel.add(buttonsPanel, new DGridBagConstraints().setGrid(0, 1).setFillBoth());
					buttonsPanel.setVisible(true);
					
					String[][] buttons = new String[][] {
						new String[] {"1", "2", "3", "+"},
						new String[] {"4", "5", "6", "-"},
						new String[] {"7", "8", "9", "*"}, 
		                new String[] {"0", ".", "=", "/"}
					};
					
					for (int line = 0; line < buttons.length; line++) {
						DPanel linePanel = new DPanel();
						buttonsPanel.add(linePanel, new DGridBagConstraints().setFillBoth());
						linePanel.setVisible(true);
						for (int column = 0; column < buttons[line].length; column++) {
							final String buttonText = buttons[line][column];
							final JButton button = new JButton(buttonText);
							button.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 30));
							button.addActionListener(
									action -> {
										textField.addText(buttonText);
									}
							);
							linePanel.add(button, new DGridBagConstraints().setGrid(line, column).setFillBoth());
						}
					}
				}
		);
	}
}
