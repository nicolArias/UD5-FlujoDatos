package punto13;

import javax.swing.JOptionPane;

/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto13App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*13) Crea una aplicaci�n llamada CalculadoraInversa, nos pedir� 2 operandos (int) y un signo
			aritm�tico (String), seg�n este �ltimo se realizara la operaci�n correspondiente. Al final
			mostrara el resultado en un cuadro de dialogo.
			Los signos aritm�ticos disponibles son:
				+: suma los dos operandos.
				-: resta los operandos.
		 		*: multiplica los operandos.
				/: divide los operandos, este debe dar un resultado con decimales (double)
				^: 1� operando como base y 2� como exponente.
				%: m�dulo, resto de la divisi�n entre operando1 y operando2*/
		
		int op1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero:"));
		String signo=JOptionPane.showInputDialog("Introduzca un signo aritm�tico: ");
		int op2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero: "));
		
		double division=0;//esta variable nos va a servir al momento de que se quiera realizar una division con los operandos y no puedas mostrar un valor decimal.
		
		switch(signo) {
		case "+":
			JOptionPane.showMessageDialog(null, op1+" + "+op2+" = "+(op1+op2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, op1+" - "+op2+" = "+(op1-op2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, op1+" * "+op2+" = "+(op1*op2));
			break;
		case "/":
			division=(double)op1/op2;
			JOptionPane.showMessageDialog(null, op1+" / "+op2+" = "+division);
			break;
		case "^":
			JOptionPane.showMessageDialog(null, op1+" ^ "+op2+" = "+(Math.pow(op1, op2)));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, op1+" % "+op2+" = "+(op1%op2));
			break;
		
		}

		
		
		
	}

}
