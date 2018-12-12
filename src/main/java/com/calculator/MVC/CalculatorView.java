package com.calculator.MVC;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * I denna klass �terfinns samtliga resurser g�llande programmets grafiska gr�nssnitt (GUI). Programmet utvidgar
 * JFrame och �rver samt utvidgar d�rmed dess inneh�ll.  
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */


@SuppressWarnings("serial")
public class CalculatorView extends JFrame {

	/**
	 * Array med knappar som avser minir�knarens siffror samt "." och "="
	 */
	protected JButton[] digits = new JButton[12];
	/**
	 * Array med knappar som avser minir�knarens avancerade utr�kningar, ex. x^2
	 */
	protected JButton[] advancedCalc = new JButton[8];
	/**
	 * Array med knappar som avser minir�knarens fyra r�knes�tt, +,-,*,/
	 */
	protected JButton[] standardCalc = new JButton[4];
	/**
	 * Array med knappar som avser minir�knarens knappar f�r "C", "pil bak�t" samt "+-"
	 */
	protected JButton[] options = new JButton[3];
	/**
	 * Minir�knarens inmatningsf�lt
	 */
	protected JTextField input = new JTextField("");
	/**
	 * Minir�knarens presentationsf�lt
	 */
	protected JLabel results = new JLabel();


	public CalculatorView() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //St�ngs om anv�ndaren trycker p� kryss

		JPanel container = new JPanel(); //Container-panel inneh�llandes �vriga paneler. 
		this.add(container); //Panelen adderas till f�nstret
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS)); //BowLayout enligt Y-axeln, dvs. inneh�llet centreras vetrikalt.

		JPanel input_output = new JPanel(); //Panel f�r inmatningsf�lt samt resultatf�ltet. 
		input_output.setLayout(new BoxLayout(input_output, BoxLayout.Y_AXIS));

		input.setMinimumSize(new Dimension(200, 50));
		input.setMaximumSize(new Dimension(200, 50));

		input.setEditable(false); //Tar enbart input genom siffer-knapparna.
		input.setBackground(Color.white);

		input_output.add(Box.createRigidArea(new Dimension(0, 10)));
		input_output.add(results);
		input_output.add(Box.createRigidArea(new Dimension(0, 10)));
		input_output.add(input);
		input_output.add(Box.createRigidArea(new Dimension(0, 20)));
		container.add(input_output);

		JPanel optionsPanel = new JPanel(); //Panel f�r knapparna "C", "<-" samt "+-"
		optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.X_AXIS));
		optionsPanel.setPreferredSize(new Dimension(500, 300));

		options[0] = new JButton("\u00B1"); //+-
		options[1] = new JButton("\u2190");//<-
		options[2] = new JButton("C");

		optionsPanel.add(options[0]);
		optionsPanel.add(options[1]);
		optionsPanel.add(options[2]);

		container.add(optionsPanel);

		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setMinimumSize(new Dimension(600, 400));
		buttonsPanel.setMaximumSize(new Dimension(600, 400));
		container.add(buttonsPanel);

		JPanel advancedPanel = new JPanel();

		GridLayout digits1 = new GridLayout(4, 3); 
		digits1 = new GridLayout(4, 3);
		advancedPanel.setLayout(digits1);

		advancedCalc[0] = new JButton("x^2");
		advancedCalc[1] = new JButton("x^3");
		advancedCalc[2] = new JButton("\u221A"); // SQRT
		advancedCalc[3] = new JButton("\u33D2"); // log
		advancedCalc[4] = new JButton("SIN");
		advancedCalc[5] = new JButton("COS");
		advancedCalc[6] = new JButton("TAN");
		advancedCalc[7] = new JButton("\u03C0"); // PI

		advancedPanel.add(advancedCalc[0]);
		advancedPanel.add(advancedCalc[1]);
		advancedPanel.add(advancedCalc[2]);
		advancedPanel.add(advancedCalc[3]);
		advancedPanel.add(advancedCalc[4]);
		advancedPanel.add(advancedCalc[5]);
		advancedPanel.add(advancedCalc[6]);
		advancedPanel.add(advancedCalc[7]);

		advancedPanel.setPreferredSize(new Dimension(150, 200));

		buttonsPanel.add(advancedPanel);

		JPanel digitsPanel = new JPanel();
		digitsPanel.setLayout(new BoxLayout(input_output, BoxLayout.X_AXIS));

		digits1 = new GridLayout(4, 3);

		digits[0] = new JButton("7");
		digits[1] = new JButton("8");
		digits[2] = new JButton("9");
		digits[3] = new JButton("4");
		digits[4] = new JButton("5");
		digits[5] = new JButton("6");
		digits[6] = new JButton("1");
		digits[7] = new JButton("2");
		digits[8] = new JButton("3");
		digits[9] = new JButton("0");
		digits[10] = new JButton(".");
		digits[11] = new JButton("=");

		digitsPanel.setLayout(digits1);
		digitsPanel.add(digits[0]);
		digitsPanel.add(digits[1]);
		digitsPanel.add(digits[2]);
		digitsPanel.add(digits[3]);
		digitsPanel.add(digits[4]);
		digitsPanel.add(digits[5]);
		digitsPanel.add(digits[6]);
		digitsPanel.add(digits[7]);
		digitsPanel.add(digits[8]);
		digitsPanel.add(digits[9]);
		digitsPanel.add(digits[10]);
		digitsPanel.add(digits[11]);

		digitsPanel.setPreferredSize(new Dimension(200, 200));
		buttonsPanel.add(digitsPanel);

		digits1 = new GridLayout(4, 0);
		JPanel basicCalc = new JPanel();
		basicCalc.setLayout(digits1);

		standardCalc[0] = new JButton("/");
		standardCalc[1] = new JButton("*");
		standardCalc[2] = new JButton("-");
		standardCalc[3] = new JButton("+");

		basicCalc.add(standardCalc[0]);
		basicCalc.add(standardCalc[1]);
		basicCalc.add(standardCalc[2]);
		basicCalc.add(standardCalc[3]);

		basicCalc.setPreferredSize(new Dimension(50, 200));
		buttonsPanel.add(basicCalc);

		this.setSize(680, 900);
		this.setVisible(true); //F�nstret visas vid start. 

	}

	/**
	 * Funktion f�r att addera lyssnare till samtliga knappar. 
	 * 
	 * @param listenForButtons lyssna etfer knapptryck
	 */
	public void addCalculatorListener(ActionListener listenForButtons) {

		for (int i = 0; i < standardCalc.length; i++) {
			standardCalc[i].addActionListener(listenForButtons);
		}

		for (int i = 0; i < advancedCalc.length; i++) {
			advancedCalc[i].addActionListener(listenForButtons);
		}

		for (int i = 0; i < digits.length; i++) {
			digits[i].addActionListener(listenForButtons);
		}

		for (int i = 0; i < options.length; i++) {
			options[i].addActionListener(listenForButtons);
		}

	}

}
