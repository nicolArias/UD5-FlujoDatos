package punto12;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*) Escribe una aplicaci�n con un String que contenga una contrase�a cualquiera. Despu�s
			se te pedir� que introduzcas la contrase�a, con 3 intentos. Cuando aciertes ya no pedir� mas
			la contrase�a y mostrara un mensaje diciendo �Enhorabuena�. Piensa bien en la condici�n
			de salida (3 intentos y si acierta sale, aunque le queden intentos).
		 */
		
		String contrase�a="12345*";
		
		String contra1=JOptionPane.showInputDialog("Ingrese una contrase�a: ");;
		int cont=3;//esta variable es para llevar un contador que solo nos servira para mostrar el n�mero de intentos que le quedan al usuario
		
		for(int i=0;i<3;i++) {
			
			if(contrase�a.equals(contra1)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");		
				i=3;
			}else {
				
				contra1=JOptionPane.showInputDialog("Le quedan "+cont+" intento/s"+"\n Ingrese nuevamente la contrase�a: ");
				cont--;//aqui va disminuyendo a medida que el usuario vaya intentado
			}
		}
		
		
		
		
	}

}
