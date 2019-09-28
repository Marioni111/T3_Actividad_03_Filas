import java.util.LinkedList;
import java.util.Queue;

public class ImplementarFilaDinamica implements RegistroImpreciones{

	Queue<Impresiones> mS = new LinkedList<>();
	
	int fr = 0, fn = 2;
	int tamañoFila = 3;
	Impresiones pendientes[] = new Impresiones[3];
	int contHojas = 0;
	int contBytes = 0;
	
	public void cargarBD() {
		mS.add(new Impresiones(1, 1, 1));
		mS.add(new Impresiones(2, 2, 2));
		mS.add(new Impresiones(3, 3, 3));
		System.out.println("La base de datos esta activa");
	}

	public void ImprimirArchivo() {
		if(filaVacia()){
			System.out.println("No hay mas pendietes por imprimir");
		}else{
			pendientes[fr]=mS.remove();
			
			System.out.println("Has impreso el archivo: I0" + pendientes[fr].getIntidentificadorImpresion() + 
					" con " + pendientes[fr].getCantidadDeHojas() + " hojas " + " De " + pendientes[fr].getTamañoDelArchivo() + " bytes");
			
			contHojas = contHojas + pendientes[fr].getCantidadDeHojas();
			contBytes = contBytes + pendientes[fr].getTamañoDelArchivo();
			
			fn--;
		}
	}

	public void encolarArchivo(int identificadorImpresion, int cantidadDeHojas, int tamañoDelArchivo) {
		if(filaLlena()){
			System.out.println("No hay espacio para mas pendientes");
		}else{
			fn++;
			mS.add(new Impresiones(identificadorImpresion, cantidadDeHojas, tamañoDelArchivo));
			System.out.println("Has encolado el archivo");
		}
	}

	public void mostrarTotalHojasImpresas() {
		
		System.out.println("Se imprimieron " + contHojas + " hojas en total");
	}

	public void mostrarTotalDeBytesParaImpresion() {
		
		System.out.println("Fueron un total de " + contBytes + " bytes en archivos");
		
	}

	public boolean filaLlena() {

		return (fn == tamañoFila-1) ? true : false;
	}

	public boolean filaVacia() {

		return (fn == -1) ? true : false;
	}

}
