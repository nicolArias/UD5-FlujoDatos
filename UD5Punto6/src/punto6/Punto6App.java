package punto6;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*6) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y
			calcule el precio final con IVA. El IVA sera una constante que sera del 21%*/
			
		final double IVA=0.21;
		
		double precio=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio del producto:"));
		
		JOptionPane.showMessageDialog(null, "El precio final con IVA es de: "+(precio+(precio*IVA))+" euros");
	}

}
