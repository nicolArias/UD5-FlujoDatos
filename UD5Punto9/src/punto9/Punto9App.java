package punto9;
/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto9App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*9) Muestra los n�meros del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle
			que desees.*/
		
		int num=1;//declare la variable num que ira dentro del ciclo como contador para luego poder hacer la condicion
		
		do {
			if(num%2==0 && num%3==0) {//una vez entre en el ciclo lo primero que se har� es una validacion, ya que solo necesitamos la lista con los n�meros
										//divisibles entre 2 y 3
				System.out.println(num);//si la validaci�n es correcta se imprimien los n�meros que cumplan la condici�n
			}
			num++;
		}while(num<=100);

	}

}
