package strategy2;

public class StrategyA implements Strategy{
	@Override
	public void behaviour() {
		System.out.println("Estrategia A");
	}
	
	@Override
	public void pago() {
	  System.out.println(" Tipo de pago para la estrategia A ");	
	}
	
	
	
}
