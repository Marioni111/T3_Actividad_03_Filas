
public interface RegistroImpreciones {

	public void cargarBD();
	public void ImprimirArchivo();
	public void encolarArchivo(int identificadorImpresion, int cantidadDeHojas, int tama�oDelArchivo);
	public void mostrarTotalHojasImpresas();
	public void mostrarTotalDeBytesParaImpresion();
	public boolean filaLlena();
	public boolean filaVacia();
}
