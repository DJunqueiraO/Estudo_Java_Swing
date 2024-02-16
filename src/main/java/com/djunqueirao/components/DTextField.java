package main.java.com.djunqueirao.components;

import java.awt.Font;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DTextField extends JTextField {
	
	public DTextField() {
	}
	
	public DTextField addText(final String text) {
		setText(getText() + text);
		return this;
	}
	
	public DTextField setFont(final String name, final int style, final int size) {
		super.setFont(new Font(name, style, size));
		return this;
	}
}
