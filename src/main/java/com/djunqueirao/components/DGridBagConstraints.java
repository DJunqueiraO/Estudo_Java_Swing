package main.java.com.djunqueirao.components;

import java.awt.GridBagConstraints;

@SuppressWarnings("serial")
public class DGridBagConstraints extends GridBagConstraints {

	public DGridBagConstraints setGrid(
			final int gridx,
			final int gridy
	) {
		this.gridx = gridx;
		this.gridy = gridy;
		return this;
	}
	
	public DGridBagConstraints setFillBoth() {
		weightx = 1;
		weighty = 1;
		fill = BOTH;
		return this;
	}
	
	public DGridBagConstraints setFillHorizontal() {
		weightx = 1;
		fill = HORIZONTAL;
		return this;
	}
	
	public DGridBagConstraints setFillVertical() {
		weighty = 1;
		fill = VERTICAL;
		return this;
	}
}
