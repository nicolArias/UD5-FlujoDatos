package punto12;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
			se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas
			la contraseña y mostrara un mensaje diciendo “Enhorabuena”. Piensa bien en la condición
			de salida (3 intentos y si acierta sale, aunque le queden intentos).
		 */
		
		String contraseña="12345*";
		
		String contra1=JOptionPane.showInputDialog("Ingrese una contraseña: ");;
		int cont=3;//esta variable es para llevar un contador que solo nos servira para mostrar el número de intentos que le quedan al usuario
		
		for(int i=0;i<3;i++) {
			
			if(contraseña.equals(contra1)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");		
				i=3;
			}else {
				
				contra1=JOptionPane.showInputDialog("Le quedan "+cont+" intento/s"+"\n Ingrese nuevamente la contraseña: ");
				cont--;//aqui va disminuyendo a medida que el usuario vaya intentado
			}
		}
		
		
		
		
	}

}
