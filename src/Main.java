
public class Main {

	public static void main(String[] args) {
		
		Coche coche1 = new Coche("1234ABC", "Toyota", "Corolla", 120, 200);
		Coche coche2 = new Coche("5678DEF", "BMW", "Serie 3", 180, 250);
		
		coche1.inicializarChasis("Acero", 1200);
		coche1.inicializarRuedas("195/65 R15", "seco", "Michelin", "Primacy 4");
		
		coche2.inicializarChasis("Fibra de carbono", 2000);
		coche2.inicializarRuedas("205/55 R16", "seco", "Continental", "SportContact 6");
		
		System.out.println(coche1.mostrarInformacion());
		System.out.println("\n");
		System.out.println(coche2.mostrarInformacion());
	}

}
