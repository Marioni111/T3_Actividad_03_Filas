
public class Impresiones {

	int intidentificadorImpresion;
	int cantidadDeHojas;
	int tamaņoDelArchivo;
	
	public Impresiones(int intidentificadorImpresion, int cantidadDeHojas, int tamaņoDelArchivo) {
		super();
		this.intidentificadorImpresion = intidentificadorImpresion;
		this.cantidadDeHojas = cantidadDeHojas;
		this.tamaņoDelArchivo = tamaņoDelArchivo;
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

	public int getTamaņoDelArchivo() {
		return tamaņoDelArchivo;
	}

	public void setTamaņoDelArchivo(int tamaņoDelArchivo) {
		this.tamaņoDelArchivo = tamaņoDelArchivo;
	}
}
