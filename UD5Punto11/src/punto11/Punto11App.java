package punto11;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto11App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*11) Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral
			o no. Usa un switch para ello.*/
		
		String dia=JOptionPane.showInputDialog("Introduzca un día de la semana:");
		
		switch(dia) {
		case "Lunes":
			JOptionPane.showMessageDialog(null, "Es un día laboral");
			break;
		case "Martes":
			JOptionPane.showMessageDialog(null, "Es un día laboral");
			break;
		case "Miércoles":
			JOptionPane.showMessageDialog(null, "Es un día laboral");
			break;
		case "Jueves":
			JOptionPane.showMessageDialog(null, "Es un día laboral");
			break;
		case "Viernes":
			JOptionPane.showMessageDialog(null, "Es un día laboral");
			break;
		case "Sábado":
			JOptionPane.showMessageDialog(null, "No es un día laboral");
			break;
		case "Domingo":
			JOptionPane.showMessageDialog(null, "No es un día laboral");
			break;
			default:
				JOptionPane.showMessageDialog(null, "No has introducido un día válido");
			
		}
	}

}
