package punto3;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir
          (recuerda usar JOptionPane).*/
		
		String nombre=JOptionPane.showInputDialog("Introduce tú nombre:");
		
		JOptionPane.showMessageDialog(null,"\"Bienvenida "+nombre+"\"");
	

	}

}
