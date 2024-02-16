package main.java.com.djunqueirao.components;

import java.awt.GridBagConstraints;

@SuppressWarnings("serial")
public class DGridBagConstraints extends GridBagConstraints {

	public DGridBagConstraints setGrid(
			final int gridy,
			final int gridx
	) {
		this.gridy = gridy;
		this.gridx = gridx;
		return this;
	}
	
	public DGridBagConstraints setWeightx(final double weightx) {
		this.weightx = weightx;
		return this;
	}
	
	public DGridBagConstraints setWeighty(final double weighty) {
		this.weighty = weighty;
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
