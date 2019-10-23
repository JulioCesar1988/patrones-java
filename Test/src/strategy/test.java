package strategy;

public class test {
// codigos de empresa para poder acceder al plant_config "seguridad" 
	enum Empresa {
		empresaA, empresaB, empresaC , empresaZ
	}
	public static String getMontosEmpresa(Empresa e) {
		// mas cambios jejeje
		String montos = null;
		switch (e) {
		case empresaA:
			System.out.println(" Montos para la empresa A");
			montos = "{ 800 , 20 , 30 , 40 ,50 , 60 }";
			break;
		case empresaB:
			System.out.println(" Montos para la empresa B");
			montos = "{ 10 , 20 , 30 , 40 ,50 , 60 }";
			break;
		case empresaC:
			System.out.println(" Montos para la empresa C");
			montos = "{ 10 , 20 , 30 , 40 ,50 , 60 }";
			break;
		default:
			System.out.println(" No hay montos para esta empresa  101010101010 ");
			montos = "{ 0}";
			break;
		}
	 return montos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0 ;
		Empresa empA = Empresa.empresaA;
		Empresa empB = Empresa.empresaB;
		Empresa empC = Empresa.empresaC;
		Empresa empZ = Empresa.empresaZ;
		test t = new test();
		System.out.println(" Show Montos -> " + t.getMontosEmpresa(empA));
		System.out.println(" Show Montos -> " + t.getMontosEmpresa(empB));
		System.out.println(" Show Montos -> " + t.getMontosEmpresa(empC));
		System.out.println(" Show Montos -> " + t.getMontosEmpresa(empZ));
				
		// agregando algo mas para ver si lo toma git 
		for (int i = 0; i < 10; i++) {
			System.out.println("cambios !!! ");
		}

	}

}
