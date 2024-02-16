package main.java.com.djunqueirao.application;

import javax.swing.SwingUtilities;

import main.java.com.djunqueirao.application.calculator.Calculator;

public class Application {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
				() -> {
					new Calculator();
				}
		);
	}
}
