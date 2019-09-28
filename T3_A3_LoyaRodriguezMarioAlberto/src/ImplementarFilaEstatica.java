public class ImplementarFilaEstatica implements RegistroImpreciones{

	int fr = 0, fn = 2;
	int tamañoFila = 3;
	int pendientesID[] = new int [3];
	int pendientes[][] = new int [2][3];
	int contHojas = 0;
	int contBytes = 0;
	
	public void cargarBD(){
		
		pendientesID[0] = 1;
		pendientes[0][0]=1; pendientes[1][0]=1;
		pendientesID[1] = 2;
		pendientes[0][1]=2; pendientes[1][1]=2;
		pendientesID[2] = 3;
		pendientes[0][2]=3; pendientes[1][2]=3;

		System.out.println("La base de datos esta activa");
	}

	public void ImprimirArchivo() {
		if(filaVacia()){
			System.out.println("No hay mas pendietes por imprimir");
		}else{
			System.out.println("Has impreso el archivo: I0" + pendientes[fr] + " Con " + pendientes[0][fr] +" hojas " + " De "+ pendientes[1][fr] + " bytes");
			
			contHojas = contHojas + pendientes[0][fr];
			contBytes = contBytes + pendientes[1][fr];
			
			for(int i = 0; i <= 1; i++){
				pendientesID[i] = pendientesID[i+1];
				pendientes[0][i]= pendientes[0][i+1]; pendientes[1][i] = pendientes[1][i+1];
			}
			
			fn--;
		}
	}

	public void encolarArchivo(int identificadorImpresion, int cantidadDeHojas, int tamañoDelArchivo) {
		
		if(filaLlena()){
			System.out.println("No hay espacio para mas pendientes");
		}else{
			pendientesID[fn] = identificadorImpresion;
			pendientes[0][fn]= cantidadDeHojas; pendientes[1][fn] = tamañoDelArchivo;
			System.out.println("Has encolado el archivo");
			fn++;
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