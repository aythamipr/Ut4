
public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("El jugador 1 hace su lanzamiento:");
		int d11 = (int)(Math.random()*6)+1;
		int d12 = (int)(Math.random()*6)+1;
		
		//Creamos variables random para simular los dos dados del juegador 1
		System.out.println("Dado 1: " + d11);
		System.out.println("Dado 2: " + d12);
		
		System.out.println("El jugador 2 hace su lanzamiento:");
		int d21 = (int)(Math.random()*6)+1;
		int d22 = (int)(Math.random()*6)+1;
		
		//Creamos variables random para simular los dos dados del juegador 2
		System.out.println("Dado 1: " + d21);
		System.out.println("Dado 2: " + d22);

		//Varaible suma de cada jugador
		int sum1 = d11 + d12;
		int sum2 = d21 + d22;
		
		//Almacenar e imprimir pantalla el máximo de los dos jugadores
		int max = Math.max(sum1, sum2);
		System.out.println("La tirada más alta es " + max);
		
		//Opcional 1
		//Decir cual es el jugador ganador
		if(max==sum1) {
		System.out.println("El ganador es el jugador 1");
		}else {
			System.out.println("El ganador es el jugador 2");
		}
		
		//Opcional 2
		int sumt = d11 + d12 + d21 + d22;
		int media = (int) Math.round((double)sumt / 4);
		System.out.println("La media de los 4 dados es " + media);
		
	}
}
