
public class Impresiones {

	int intidentificadorImpresion;
	int cantidadDeHojas;
	int tamañoDelArchivo;
	
	public Impresiones(int intidentificadorImpresion, int cantidadDeHojas, int tamañoDelArchivo) {
		super();
		this.intidentificadorImpresion = intidentificadorImpresion;
		this.cantidadDeHojas = cantidadDeHojas;
		this.tamañoDelArchivo = tamañoDelArchivo;
	}

	public int getIntidentificadorImpresion() {
		return intidentificadorImpresion;
	}

	public void setIntidentificadorImpresion(int intidentificadorImpresion) {
		this.intidentificadorImpresion = intidentificadorImpresion;
	}

	public int getCantidadDeHojas() {
		return cantidadDeHojas;
	}

	public void setCantidadDeHojas(int cantidadDeHojas) {
		this.cantidadDeHojas = cantidadDeHojas;
	}

	public int getTamañoDelArchivo() {
		return tamañoDelArchivo;
	}

	public void setTamañoDelArchivo(int tamañoDelArchivo) {
		this.tamañoDelArchivo = tamañoDelArchivo;
	}
}
