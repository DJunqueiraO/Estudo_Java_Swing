package main.java.com.djunqueirao.components;

import java.util.function.Function;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class DGridPanel<T> extends DPanel {
	
	public DGridPanel<T> setGrid(final T[][] components, Function<T, JComponent> function) {
		for (int line = 0; line < components.length; line++) {
			DPanel linePanel = new DPanel();
			add(linePanel, new DGridBagConstraints().setGrid(line, 0).setFillBoth());
			linePanel.setVisible(true);
			for (int column = 0; column < components[line].length; column++) {
				linePanel.add(function.apply(components[line][column]), new DGridBagConstraints().setGrid(line, column).setFillBoth());
			}
		}
		return this;
	}
	
//	buttonsPanel = new DPanel();
//	String[][] buttons = new String[][] {
//		new String[] {"1", "2", "3", "+"},
//		new String[] {"4", "5", "6", "-"},
//		new String[] {"7", "8", "9", "*"}, 
//        new String[] {"0", ".", "=", "/"}
//	};
//	for (int line = 0; line < buttons.length; line++) {
//		DPanel linePanel = new DPanel();
//		buttonsPanel.add(linePanel, new DGridBagConstraints().setFillBoth());
//		linePanel.setVisible(true);
//		for (int column = 0; column < buttons[line].length; column++) {
//			final String buttonText = buttons[line][column];
//			final JButton button = new JButton(buttonText);
//			button.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 30));
//			button.addActionListener(
//					action -> {
//						textField.addText(buttonText);
//					}
//			);
//			linePanel.add(button, new DGridBagConstraints().setGrid(line, column).setFillBoth());
//		}
//	}
//	buttonsPanel.setVisible(true);
}
