package punto4;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*4) Haz una aplicaci�n que calcule el �rea de un circulo (pi*R2). El radio se pedir� por teclado
			(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el
			m�todo pow de Math.*/
		final double pi=3.1415;
		double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio:"));
		
		JOptionPane.showMessageDialog(null,"El �rea del circulo es: "+(pi*Math.pow(radio, 2)));
	}

}
