package punto5;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5) Lee un n�mero por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, tambi�n
			debemos indicarlo.*/

		double numero=Double.parseDouble(JOptionPane.showInputDialog("Introduzca un n�mero:"));
		
		if(numero%2==0) {
			JOptionPane.showMessageDialog(null, "El n�mero "+numero+" ES DIVISIBLE entre 2");
		}else {
			JOptionPane.showMessageDialog(null, "El n�mero "+numero+" NO ES DIVISIBLE entre 2");
		}
	}

}
