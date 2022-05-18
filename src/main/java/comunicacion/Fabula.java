package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	private static final int factor = 1;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.setEnsenanza(ensenanza);
		this.setInterpretacion(interpretacion);
	}

	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int factor) {
		return this.getPaginas() * Fabula.factor;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}

	public String toString() {
		return this.getOrigen() +
				"\n" + this.getTitulo() +
				"\n" + this.getAutor() +
				"\n" + this.getPaginas() +
				"\n" + this.getEnsenanza();
	}

}
