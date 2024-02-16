package main.java.com.djunqueirao.application.calculator;

import java.awt.Font;

import javax.swing.JButton;

import main.java.com.djunqueirao.components.DFrame;
import main.java.com.djunqueirao.components.DGridBagConstraints;
import main.java.com.djunqueirao.components.DGridPanel;
import main.java.com.djunqueirao.components.DPanel;
import main.java.com.djunqueirao.components.DTextField;

@SuppressWarnings("serial")
public class Calculator extends DFrame {
	
	private DPanel panel;
	
	private DTextField textField;
	
	private DGridPanel<String> buttonsPanel;
	
	public Calculator() {
		setSize(400, 400);
		setVisible(true);
		add(getPanel());
	}
	
	public DPanel getPanel() {
		if(panel == null) {
			panel = new DPanel();
			panel.add(getTextField(), new DGridBagConstraints().setGrid(0, 0).setFillHorizontal());
			panel.add(getButtonsPanel(), new DGridBagConstraints().setGrid(1, 0).setFillBoth());
			panel.setVisible(true);
		}
		return panel;
	}
	
	public DPanel getButtonsPanel() {
		if(buttonsPanel == null) {
			buttonsPanel = new DGridPanel<String>();
			buttonsPanel.setGrid(
					new String[][] {
						new String[] {"1", "2", "3", "+"},
						new String[] {"4", "5", "6", "-"},
						new String[] {"7", "8", "9", "*"}, 
			            new String[] {"0", ".", "=", "/"}
					}, 
					buttonText -> {
						final JButton button = new JButton(buttonText);
						button.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 30));
						button.addActionListener(
								action -> {
									getTextField().addText(buttonText);
								}
						);
						return button;
					}
			);
			buttonsPanel.setVisible(true);
		}
		return buttonsPanel;
	}
	
	public DTextField getTextField() {
		if(textField == null) {
			textField = new DTextField().setFont(Font.MONOSPACED, Font.BOLD, 30);
			textField.setVisible(true);
		}
		return textField;
	}
}
