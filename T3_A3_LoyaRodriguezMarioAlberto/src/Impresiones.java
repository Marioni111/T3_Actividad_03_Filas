
public class Impresiones {

	int intidentificadorImpresion;
	int cantidadDeHojas;
	int tama�oDelArchivo;
	
	public Impresiones(int intidentificadorImpresion, int cantidadDeHojas, int tama�oDelArchivo) {
		super();
		this.intidentificadorImpresion = intidentificadorImpresion;
		this.cantidadDeHojas = cantidadDeHojas;
		this.tama�oDelArchivo = tama�oDelArchivo;
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

	public int getTama�oDelArchivo() {
		return tama�oDelArchivo;
	}

	public void setTama�oDelArchivo(int tama�oDelArchivo) {
		this.tama�oDelArchivo = tama�oDelArchivo;
	}
}
