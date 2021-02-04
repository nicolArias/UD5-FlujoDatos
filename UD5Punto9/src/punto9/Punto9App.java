package punto9;
/*FECHA: 03/02/2021
 * Nicol Dayana Arias Lebro*/
public class Punto9App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*9) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle
			que desees.*/
		
		int num=1;//declare la variable num que ira dentro del ciclo como contador para luego poder hacer la condicion
		
		do {
			if(num%2==0 && num%3==0) {//una vez entre en el ciclo lo primero que se hará es una validacion, ya que solo necesitamos la lista con los números
										//divisibles entre 2 y 3
				System.out.println(num);//si la validación es correcta se imprimien los números que cumplan la condición
			}
			num++;
		}while(num<=100);

	}

}
