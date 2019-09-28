
public interface RegistroImpreciones {

	public void cargarBD();
	public void ImprimirArchivo();
	public void encolarArchivo(int identificadorImpresion, int cantidadDeHojas, int tamañoDelArchivo);
	public void mostrarTotalHojasImpresas();
	public void mostrarTotalDeBytesParaImpresion();
	public boolean filaLlena();
	public boolean filaVacia();
}
