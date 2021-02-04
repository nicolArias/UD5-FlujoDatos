package punto1;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/

public class Punto1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los
			dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que
			funciona.*/
		
		int numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero:"));
		int numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero:"));
		
		if(numero1>numero2) {
			JOptionPane.showMessageDialog(null, "El número mayor es: "+numero1);
		}else if(numero2>numero1) {
			JOptionPane.showMessageDialog(null, "El número mayor es: "+numero2);
		}else {
			JOptionPane.showMessageDialog(null, "Los dos números son iguales");
		}

	}

}
