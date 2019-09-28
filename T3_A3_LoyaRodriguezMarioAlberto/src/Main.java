import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random rnd = new Random();
		ImplementarFilaEstatica obj1 = new ImplementarFilaEstatica();
		ImplementarFilaDinamica obj2 = new ImplementarFilaDinamica();
		
		System.out.println("Selecciona: \n1)Pila estatica \n2)pila dinamica");
		int op = entrada.nextInt();
		int cont = 0;
		int contID = 3;
		
		if(op==1){
			obj1.cargarBD();
			do{
				System.out.println("1)Imprimir pendientes \n2)Encolar Pendiete \n3)Mostar total de hojas impresas\n4)Mostar total de bytes de los archivos impresos \n5)Salir \n-----------------------------");
				op = entrada.nextInt();
				switch(op) {
					case 1 :
						obj1.ImprimirArchivo();
						break;
					case 2 :
						contID = contID + 1;
						int identificadorImpresion = contID;
						int cantidadDeHojas = rnd.nextInt(20) + 1;
						int tamañoDelArchivo = rnd.nextInt(20) + 1;
						
						obj1.encolarArchivo(identificadorImpresion, cantidadDeHojas, tamañoDelArchivo);
						break;
					case 3 :
						obj1.mostrarTotalHojasImpresas();
						break;
					case 4 :
						obj1.mostrarTotalDeBytesParaImpresion();
						break;
					case 5 :
						System.out.println("Nos vemos!");
						cont++;
						break;
				}
			}while(cont<1);
		}
		else if(op==2){
			obj2.cargarBD();
			do{
				System.out.println("1)Imprimir pendientes \n2)Encolar Pendiete \n3)Mostar total de hojas impresas\n4)Mostar total de bytes de los archivos impresos \n5)Salir \n-----------------------------");
				op = entrada.nextInt();
				switch(op) {
					case 1 :
						obj2.ImprimirArchivo();
						break;
					case 2 :
			
						contID = contID +1;
						int identificadorImpresion = contID;
						int cantidadDeHojas = rnd.nextInt(20) + 1;
						int tamañoDelArchivo = rnd.nextInt(20) + 1;
						
						obj2.encolarArchivo(identificadorImpresion, cantidadDeHojas, tamañoDelArchivo);
						break;
					case 3 :
						obj2.mostrarTotalHojasImpresas();
						break;
					case 4 :
						obj2.mostrarTotalDeBytesParaImpresion();
						break;
					case 5 :
						System.out.println("Nos vemos!");
						cont++;
						break;
				}
			}while(cont<1);
		}
		else if(op==3){
			System.out.println("Salir");
		}
		
	}
}