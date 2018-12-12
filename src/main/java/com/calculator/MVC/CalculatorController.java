package com.calculator.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.calculator.interfaces.CalculatorAdvancedOperationsInterface;
import com.calculator.interfaces.CalculatorBasicOperationsInterface;

/**
 * Detta �r kontroller-klassen som samspelar mellan klasserna ControllerView, ModelBasicOperations samt ModelAdvancedOperations. 
 * Genom att skapa instanser av dessa klasser ges �tkomst till inneh�ll, dvs. de grafiska komponenterna samt funktioner
 * f�r att genomf�ra ber�kningar. 
 * 
 * @author Magnus Gustafson - KVALIT18
 * @version 1.0 ALPHA, 2018-12-10
 * 
 *
 */

public class CalculatorController {

	/**
	 * En instans av interface CalculatorAdvancedOperationsInterface. Anv�nds f�r �tkomst
	 * av de avancerade utr�kningarna i minir�knaren. 
	 */
	CalculatorAdvancedOperationsInterface ao;
	
	/**
	 * En instans av interface CalculatorBasicOperationsInterface. Anv�nds f�r �tkomst
	 * av de grundl�ggande utr�kningarna i minir�knaren. 
	 */
	CalculatorBasicOperationsInterface bo;
	
	/**
	 * En instans av klassen CalculatorView. Anv�nds f�r �tkomst
	 * av gr�nssnittskomponenterna.  
	 */
	CalculatorView cw;

	/**
	 * variabeln prevSum anv�nds vid den allra f�rsta ber�kningen f�r att kunna lagra talet. Detta g�rs
	 * eftersom programmet vid detta tillf�lle beh�ver inv�nta det andra talet f�r en utr�kning 
	 */
	double prevSum = 0;
	
	/**
	 * variabeln counter anv�nds f�r att avg�ra om minir�knaren utf�r en f�rsta ber�kning, dvs. att inga andra utr�kningar tidigare genomf�rts.  
	 */
	int counter = 0;
	
	/**
	 * variabeln totSum lagrar v�rdet av en utr�kning som sedan presenteras i gr�nssnittet.  
	 */
	double totSum = 0;
	
	/**
	 * Variabeln calc inneh�ller den operation, dvs. utr�kning som en anv�ndare har valt att g�ra. Denna anv�nds sedan
	 * f�r att kontrollera vilken given ber�kning som programmet ska genomf�ra.  
	 */
	String calc = "";
	
	/**
	 * isActive anv�nds f�r att f�r att kontrollera om en utr�kning precis genomf�rts. Detta inneb�r att resultatet rensas fr�n input-f�ltet 
	 * och l�mnar plats f�r nya tal som anges
	 */
	boolean isActive = true;
	
	/**
	 * piActive anv�nds f�r att kontrollera om anv�ndaren har anv�nt pi vid en ber�kning. Anv�ndaren ska inte kunna anv�nds sig av pi mer �n en g�ng
	 * vid varje enskild ber�kning. 
	 */
	boolean piActive = true;

	
	/**
	 * Klassens konstruktor. 
	 * 
	 * Instansierar de tre objekten bo, ao och cw med hj�lp av parametrarna model1 som refererar till klassen ModelBasicOperations, 
	 * model2 som refererar till klassen ModelAdvancedOperations samt view1 som refererar till klassen CalculatorView. 
	 * Detta ger s�ledes �tkomst till metoderna f�r genomf�ra de olika ber�kningarna samt till det grafiska gr�nssnittet. 
	 * 
	 * 
	 * @param model1
	 * @param model2
	 * @param view1
	 */
	public CalculatorController(ModelBasicOperations model1, ModelAdvancedOperations model2, CalculatorView view1) {

		this.bo = model1; // Notera att de b�da instanserna pekar p� interfacen
							// och inte klasserna!!
		this.ao = model2;
		this.cw = view1; // View implementerar inte n�got interface, s� detta
							// blir en instans av klassen

		
		/**
		 * Metoden addCalculatorListener i klassen ControllerView anropas genom instansen "cw" med lyssnarklassen som argument 
		 */
		this.cw.addCalculatorListener(new CalculatorListener());

	}
	
	
	/**
	 * 
	 * Klass f�r h�ndelsehantering (lyssnare), dvs. om en av knapparna i minir�knaren anv�nds. 
	 * Notera metoden addCalculatorListener i klassen CalculatorView d�r lyssnare adderas. 
	 * 
	 * @author Magnus Gustafson - KVALIT18
	 * @version 1.0 ALPHA, 2018-12-10
	 * 
	 *
	 */
	class CalculatorListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			/**
			 * Om knappen +- anv�nds, blir talet i inmatningsf�ltet antingen positivt eller negativt vilket beror p� urpsrungsv�rdet. 
			 */
			if (e.getSource() == cw.options[0]) { // Knapp f�r +-

				if (!cw.input.getText().equals("") && !cw.input.getText().equals("0")) {

					if (cw.input.getText().charAt(0) == '-') {
						cw.input.setText(cw.input.getText().substring(1, cw.input.getText().length()));
					} else {
						cw.input.setText("-" + cw.input.getText());
					}

				}

			}

			
			/**
			 * Om pil-knappen anv�nds, skall en siffra tas bort fr�n inmatningsf�ltet. Kontrollerar
			 * f�rst om det finns en siffra i inmatningsf�ltet. 
			 */
			if (e.getSource() == cw.options[1]) { // Knapp f�r att ta bort EN
													// siffra

				if (cw.input.getText().length() > 0) {
					cw.input.setText(cw.input.getText().substring(0, cw.input.getText().length() - 1));

					if (cw.input.getText().length() == 1 && cw.input.getText().charAt(0) == '-') {
						cw.input.setText("");
					}
				}

			}

			/**
			 * Knappen f�r "C" rensar och �terst�ller samtliga variabler till deras default-v�rde.  
			 */
			
			if (e.getSource() == cw.options[2]) { // Knappen f�r C, dvs. allt
													// rensas.

				cw.input.setText("");
				prevSum = 0;
				counter = 0;
				cw.results.setText(" ");
				totSum = 0;
				isActive = true;
				piActive = true;

			}

			/**
			 * Unders�ker om en siffra trycks p� och agerar d�refter - Se metod "digitsClicked()"
			 */
			
			digitsClicked(e.getSource()); // S�ker efter siffror, hittar och
											// ritar upp i inputf�ltet

			/**
			 * Unders�ker Om +, -, *, / trycks p� och agerar d�refter - Se metod "standardCalc()"
			 */
			
			standardCalcClicked(e.getSource()); // Om +, -, *, / trycks

			/**
			 * Unders�ker om n�gon av de avancerade r�knes�tten trycks p� och agerar d�refter - Se metod "advancedCalc()"
			 */
			
			advancedCalcClicked(e.getSource());

		}

	}

	
	/**
	 * Denna funktion kontrollerar om en av knapparna f�r avancerad utr�kning har tryckts p�, ex. x^2.
	 * H�r anv�nds objektet "ao" som pekar p� klassen ModelAdvancedOperations och sedermera interface CalculatorAdvancedOperationsInterface.
	 * Funktionen anropas i lyssnarklassen CalculatorListener som skickar med objektet "c" som parameter. 
	 * "c" inneh�ller information g�llande den knapp tryckts p� vilket d�refter matchas mot dess korresponderande knapp
	 * i knapp-arrayen "advancedCalc" fr�n CalculatorView. 
	 * 
	 * N�r en tr�ff uppst�r i for-loopen, dvs. att objektet "c" kan matchas mot en av knapparna, h�mtas texten fr�n knappen f�r att sedan
	 * utf�ra en given ber�kning. Om anv�ndaren ex. trycker p� "x^2", anropas metoden powerOfTwo fr�n objektet "ao" d�r talet
	 * fr�n inmatningsf�ltet skickas som argument. Notera att samtliga tal m�ste konverteras till en "String" innan presentation
	 * eftersom JInputField inte kan hantera n�gon av de primitiva datatyperna. 
	 * 
	 * @param c
	 */
	
	public void advancedCalcClicked(Object c) {

		for (int x = 0; x < cw.advancedCalc.length - 1; x++) { 

			if (c.equals(cw.advancedCalc[x])) { //om "c", dvs. knappen som trycks g�r att matcha mot en av de avancerade utr�kningarna

				if (cw.input.getText().isEmpty()) { //om inmatningsf�ltet �r tomt. 
					JOptionPane.showMessageDialog(null, "Du m�ste ange ett v�rde");
				} else if (cw.advancedCalc[x].getText().equals("x^2")) { //om "x^2"-knappen har tryckts, ska denna ber�kning genomf�ras

					cw.input.setText(toString(ao.powerOfTwo(Double.parseDouble(cw.input.getText()))));

				} else if (cw.advancedCalc[x].getText().equals("x^3")) {

					cw.input.setText(toString(ao.powerOfThree(Double.parseDouble(cw.input.getText()))));

				} else if (cw.advancedCalc[x].getText().equals("\u221A")) { // SQRT

					cw.input.setText(toString(ao.squareRoot(Double.parseDouble(cw.input.getText()))));

				} else if (cw.advancedCalc[x].getText().equals("\u33D2")) { // LOG

					if (cw.input.getText().equals("0") || cw.input.getText().equals("0.0")) { //log tar inte v�rdet 0 och under.
						JOptionPane.showMessageDialog(null, "Ogiltig data! M�ste vara st�rre �n 0");
					} else {
						cw.input.setText(toString(ao.log(Double.parseDouble(cw.input.getText()))));
					}

				} else if (cw.advancedCalc[x].getText().equals("SIN")) {

					cw.input.setText(toString(ao.sin(Double.parseDouble(cw.input.getText()))));

				} else if (cw.advancedCalc[x].getText().equals("COS")) {

					cw.input.setText(toString(ao.cos(Double.parseDouble(cw.input.getText()))));

				} else if (cw.advancedCalc[x].getText().equals("TAN")) {

					cw.input.setText(toString(ao.tan(Double.parseDouble(cw.input.getText()))));

				}

				isActive = true;
				piActive = true;

			}

		}
		
		/**
		 * Eftersom pi inte �r en ber�kning, g�r det bra att trycka p� pi-knappen trots
		 * att inmatningsf�ltet �r tomt samt att piActive = true. Det sistn�mnda inneb�r
		 * att pi enbart f�r anv�ndas en g�ng per utr�kning. 
		 */

		if (c.equals(cw.advancedCalc[7]) && piActive) {
			cw.input.setText(toString(ao.pi()));
			piActive = false;
		}

	}

	/**
	 * Denna funktion bygger p� samma princip som funktionen advancedCalcClicked, dvs. att
	 * den f�rst kontrollerar om en knapp f�r de vanliga utr�kningarna har tryckts p� och 
	 * d�refter genomf�r ber�kningen. Parametern "Object c" �r s�ledes den knappt som har tryckts p�
	 * vilket sedan j�mf�rs med knapparna i knapp-arrayen standardCalc som �terfinns i CalculatorView. 
	 * 
	 * @param c
	 */
	
	public void standardCalcClicked(Object c) {

		for (int x = 0; x < cw.standardCalc.length; x++) {

			if (c.equals(cw.standardCalc[x])) {

				/**
				 * isActive anv�nds f�r att kontrollera om anv�ndaren precis genomf�rt en ber�kning. Om s� �r fallet,
				 * tas samtliga siffror fr�n f�reg�ende resultat bort till f�rm�n f�r de nya som anges. 
				 */
				
				if (isActive) { 

					if (cw.input.getText().isEmpty()) { //om inmatningsf�ltet �r tomt. 
						JOptionPane.showMessageDialog(null, "Du m�ste ange ett v�rde");
					} else if (counter < 1) {

						counter++; //anv�nds f�r att kontrollera om anv�ndaren g�r sin f�rsta utr�kning. 
						/*
						 * Om anv�ndaren g�r sin f�rsta utr�kning s� m�ste det f�rsta talet
						 * lagras i en tempor�r variabel i v�ntat p� n�sta v�rde. Detta eftersom 
						 * samtliga av de vanliga r�knes�tten tar tv� tal som argument. 
						 */
						prevSum = Double.parseDouble(cw.input.getText()); //det f�rsta v�rdet lagras.
						showCalc(x); //v�rdet presenteras i f�ltet ovanf�r inmatningsf�ltet. 

					} else { //Om det inte �r den f�rsta ber�kningen, dvs. anv�ndaren har gjort en ber�kning tidigare. 

						if (calc.equals("*")) {
							if (counter < 3) { //Om det �r f�rsta ber�kningen
								totSum = totSum + Double
										.parseDouble(toString(bo.multiplication(prevSum, Double.parseDouble(cw.input.getText()))));
								showCalc(x);
								counter++;

							} else { //om det finns ber�kningar sedan tidigare. 
								totSum = Double
										.parseDouble(toString(bo.multiplication(totSum, Double.parseDouble(cw.input.getText()))));
								showCalc(x);

							}
						} else if (calc.equals("/")) {
							if (cw.input.getText().equals("0") || cw.input.getText().equals("0.0")) { //Division med noll
								JOptionPane.showMessageDialog(null, "SYNTAX ERROR - KAN INTE DIVIDERA MED 0");
							} else {
								if (counter < 3) {
									totSum = totSum + Double
											.parseDouble(toString(bo.division(prevSum, Double.parseDouble(cw.input.getText()))));
									showCalc(x);
									counter++;

								} else {

									if (totSum == 0 || totSum == 0.0 || cw.input.getText().equals("0")
											|| cw.input.getText().equals("0.0")) {
										JOptionPane.showMessageDialog(null, "SYNTAX ERROR - KAN INTE DIVIDERA MED 0");
										calculate();
										cw.input.setText("");
									} else {
										totSum = Double.parseDouble(toString(
												bo.division(totSum, Double.parseDouble(cw.input.getText()))));
										showCalc(x);
									}

								}
							}
						} else if (calc.equals("+")) {
							if (counter < 3) {
								totSum = totSum + Double
										.parseDouble(toString(bo.addition(prevSum, Double.parseDouble(cw.input.getText()))));
								showCalc(x);
								counter++;

							} else {
								totSum = Double
										.parseDouble(toString(bo.addition(totSum, Double.parseDouble(cw.input.getText()))));
								showCalc(x);

							}
						} else if (calc.equals("-")) {
							if (counter < 3) {
								totSum = totSum + Double
										.parseDouble(toString(bo.substraction(prevSum, Double.parseDouble(cw.input.getText()))));
								showCalc(x);
								counter++;

							} else {
								totSum = Double
										.parseDouble(toString(bo.substraction(totSum, Double.parseDouble(cw.input.getText()))));
								showCalc(x);

							}
						} else {
							System.out.println("H�r ska jag inte hamna"); // Test
						}

						piActive = true; //Om en ber�kningen genomf�rs, kan pi-knappen anv�ndas igen. 

					}

				}
			}

		}
	}

	/**
	 * Denna funktion bygger p� samma princip som funktionerna advancedCalcClicked standardCalcClicked.
	 * H�r kontrolleras om en siffra har tryckts p� varp� siffran d�refter anges till inmatningsf�ltet. 
	 * N�r funktionen har kontrollerat att en siffer-knapp har anv�nts, kontrolleras f�rst om anv�ndaren har 
	 * tryckt p� pi-knappen. Detta g�rs f�r att den angivna siffran inte ska hamna l�ngst bak. Samtliga
	 * siffror f�r pi tas ist�llet bort varp� den agivna siffran skrivs in. 
	 * 
	 * Detsamma g�ller �ven f�r om en utr�kning precis har genomf�rts genom isActive. Om en utr�kning precis 
	 * har genomf�rts s� tas detta resultat bort varp� den angivna siffras skrivs in. 
	 * 
	 * Funktionen inneh�ller �ven hantering f�r om "."-knappen anv�nds samt "="-knappen.
	 * 
	 * Parametern "Object c" �r s�ledes den knappt som har tryckts p�
	 * vilket sedan j�mf�rs med knapparna i knapp-arrayen standardCalc som �terfinns i CalculatorView. 
	 * 
	 * 
	 * @param c
	 */
	
	public void digitsClicked(Object c) {

		for (int x = 0; x < cw.digits.length - 2; x++) {

			if (c.equals(cw.digits[x])) {

				if (!piActive) {
					cw.input.setText("");
					cw.input.setText(cw.input.getText() + cw.digits[x].getText());
					piActive = true;
				} else if (isActive) {

					cw.input.setText(cw.input.getText() + cw.digits[x].getText());

				} else {
					cw.input.setText("");
					cw.input.setText(cw.input.getText() + cw.digits[x].getText());
					isActive = true;
				}

			}
		}

		/**
		 * Anv�ndaren ska inte kunna ange fler �n ett(1) komma-tecken. 
		 */
		
		if (c.equals(cw.digits[10])) { // Komma-tecken - Notera att det �r punkt
										// som anv�nds, dvs. "."
			if (!cw.input.getText().contains(".") && cw.input.getText().equals("")) {
				cw.input.setText("0" + cw.digits[10].getText());
			} else if (!cw.input.getText().contains(".")) {
				cw.input.setText(cw.input.getText() + cw.digits[10].getText());
			}

		}

		/**
		 * Vid "="-knappen m�ste det f�rst kontrolleras om anv�ndaren har genomf�rt f�reg�ende ber�kningar. 
		 * Om s� inte �r fallet, m�ste den f�rsta summan lagras i "prevSum" och den befintliga skickas med som argument f�r ber�kning. 
		 * 
		 * Motsatsen till detta �r om anv�ndaren redan genomf�rt ber�kning vilket inneb�r att variabeln totSum kan skickas med som argument
		 * f�r ber�kning. 
		 */
		
		if (c.equals(cw.digits[11])) { // Lika-med, dvs. "="

			if (counter == 2) { 

				if (cw.input.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Du m�ste ange ett v�rde");
				} else {

					if (calc.equals("*")) {
						cw.input.setText(toString(bo.multiplication(prevSum, Double.parseDouble(cw.input.getText()))));
						calculate();
					} else if (calc.equals("/")) {

						if (cw.input.getText().equals("0") || cw.input.getText().equals("0.0")) {
							JOptionPane.showMessageDialog(null, "SYNTAX ERROR - KAN INTE DIVIDERA MED 0");
						} else {
							cw.input.setText(toString(bo.division(prevSum, Double.parseDouble(cw.input.getText()))));
							calculate();
						}

					} else if (calc.equals("+")) {
						cw.input.setText(toString(bo.addition(prevSum, Double.parseDouble(cw.input.getText()))));
						calculate();
					} else if (calc.equals("-")) {
						cw.input.setText(toString(bo.substraction(prevSum, Double.parseDouble(cw.input.getText()))));
						calculate();
					}

				}

			} else { //dvs. om anv�ndaren redan genomf�rt en ber�kning. 
				if (cw.input.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Du m�ste ange ett v�rde");
				} else {
					if (calc.equals("*")) {
						cw.input.setText(toString(bo.multiplication(totSum, Double.parseDouble(cw.input.getText()))));
						calculate();
					} else if (calc.equals("/")) {

						if (cw.input.getText().equals("0") || cw.input.getText().equals("0.0")) {
							JOptionPane.showMessageDialog(null, "SYNTAX ERROR - KAN INTE DIVIDERA MED 0");
						} else {
							cw.input.setText(toString(bo.division(totSum, Double.parseDouble(cw.input.getText()))));
							calculate();
						}

					} else if (calc.equals("+")) {
						cw.input.setText(toString(bo.addition(totSum, Double.parseDouble(cw.input.getText()))));
						calculate();
					} else if (calc.equals("-")) {
						cw.input.setText(toString(bo.substraction(totSum, Double.parseDouble(cw.input.getText()))));
						calculate();
					}
				}

			}

			isActive = true;
		}

	}

	
	/**
	 * Funktion f�r att presentera resultatet av en ber�kning i inmatningsf�ltet "results" som �terfinns i
	 * klassen CalculatorView. F�rst m�ste det kontrolleras om anv�ndaren har genomf�rt minst en ber�kning tidigare. 
	 * Om detta inte st�mmer s� m�ste variabeln "counter" inkrementeras med 1 f�r att signalera att det nu finns
	 * en totalsumma att arbeta med, dvs. variabeln totSum. 
	 * 
	 * Parametern x �r index p� den ber�kningsknapp som anv�nts (+,-,/,*), dvs. knapp-arrayen i CalculatorView. 
	 * 
	 * @param x
	 */
	
	private void showCalc(int x) {

		calc = cw.standardCalc[x].getText();

		if (counter < 2) {
			cw.results.setText(cw.input.getText() + cw.standardCalc[x].getText());
			cw.input.setText("");
			counter++;
		} else {

			cw.results.setText(Double.toString(totSum) + " " + cw.standardCalc[x].getText());
			cw.input.setText(Double.toString(totSum));
			isActive = false;

		}

	}

	
	
	/**
	 * Funktion f�r att resan all data. Anv�nds i samband med att "="-knappen anv�nds och anv�ndaren vill ha
	 * det totala resultatet
	 */
	private void calculate() {
		prevSum = 0;
		counter = 0;
		cw.results.setText(" ");
		totSum = 0;
		isActive = false;
	}
	
	/**
	 * Anv�nds f�r att konvertera double-variabel till String. Detta m�ste g�ras vid presentation
	 * av data till inmatningsf�ltet eftersom JInputField enbart kan hantera String. 
	 * 
	 * @param sum
	 * @return Stringv�rde av parametern sum
	 */
	
	private String toString(double sum){
		
		return Double.toString(sum);
		
	}

}
