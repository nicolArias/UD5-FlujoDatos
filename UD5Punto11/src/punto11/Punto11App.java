package punto11;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*11) Crea una aplicaci�n que nos pida un d�a de la semana y que nos diga si es un d�a laboral
			o no. Usa un switch para ello.*/
		
		String dia=JOptionPane.showInputDialog("Introduzca un d�a de la semana:");
		
		switch(dia) {
		case "Lunes":
			JOptionPane.showMessageDialog(null, "Es un d�a laboral");
			break;
		case "Martes":
			JOptionPane.showMessageDialog(null, "Es un d�a laboral");
			break;
		case "Mi�rcoles":
			JOptionPane.showMessageDialog(null, "Es un d�a laboral");
			break;
		case "Jueves":
			JOptionPane.showMessageDialog(null, "Es un d�a laboral");
			break;
		case "Viernes":
			JOptionPane.showMessageDialog(null, "Es un d�a laboral");
			break;
		case "S�bado":
			JOptionPane.showMessageDialog(null, "No es un d�a laboral");
			break;
		case "Domingo":
			JOptionPane.showMessageDialog(null, "No es un d�a laboral");
			break;
			default:
				JOptionPane.showMessageDialog(null, "No has introducido un d�a v�lido");
			
		}
	}

}
