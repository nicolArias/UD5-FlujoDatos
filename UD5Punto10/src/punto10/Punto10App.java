package punto10;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*10) Realiza una aplicación que nos pida un número de ventas a introducir, después nos
			pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
			mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/
		
		double numVenta=Double.parseDouble(JOptionPane.showInputDialog("Introduzca un número de ventas: "));//Primero solicito la cantidad de ventas que voy a pedir
	
		
		double venta=0;
		double suma=0;
		
		
		for(int i=0;i<numVenta;i++) {//Este ciclo funcionara la cantidad de veces que hayamos ingresado en la variable numVenta
			 venta=Double.parseDouble(JOptionPane.showInputDialog("Introduzca una venta: "));
			 suma+=venta;//en la variable suma ira haciendo un acumulado de los valores que hayamos ingresado, para luego poder mostrarlo en pantalla
		}
		
		System.out.println(suma);
		JOptionPane.showMessageDialog(null, "La suma de todas las ventas es: "+suma);

	}

}
