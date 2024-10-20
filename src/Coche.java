import java.util.Arrays;

public class Coche {
	
	private String matricula;
	private String marca;
	private String modelo;
	private int potencia;
	private int velocidadMaxima;
	private Chasis chasis;
	private Ruedas[] rueda = new Ruedas[4];
	
	class Chasis{
		private String material;
		private int peso;
		
		public Chasis(String material, int peso) {
			super();
			this.material = material;
			this.peso = peso;
		}

		@Override
		public String toString() {
			return "[material=" + material + ", peso=" + peso + "]";
		}
		
		
	}
	
	class Ruedas{
		private String medida;
		private String tipo;
		private String marca;
		private String modelo;
		
		public Ruedas(String medida, String tipo, String marca, String modelo) {
			super();
			this.medida = medida;
			this.tipo = tipo;
			this.marca = marca;
			this.modelo = modelo;
		}

		@Override
		public String toString() {
			return "Rueda = [ medida = " + medida + ", tipo = " + tipo + ", marca = " + marca + ", modelo = " + modelo + "]\n";
		}
		
		
	}

	public Coche(String matricula, String marca, String modelo, int potencia, int velocidadMaxima) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.velocidadMaxima = velocidadMaxima;
		
		this.chasis = new Chasis("Acero", 1000);
	}
	
	public void inicializarRuedas(String medida, String tipo, String marca, String modelo) {
		for (int i = 0; i < rueda.length; i++) {
			rueda[i] = new Ruedas(medida, tipo, marca, modelo);
		}
	}
	
	public void inicializarChasis(String material, int peso) {
		this.chasis = new Chasis(material, peso);
	}
	
	public String mostrarInformacion() {
		return toString();
	}

	@Override
	public String toString() {
		return "Coche = [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia
				+ ", velocidadMaxima=" + velocidadMaxima +"]\nchasis = " + chasis + "\n" + Arrays.toString(rueda);
	}
	
	
	
	
}
