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
}
