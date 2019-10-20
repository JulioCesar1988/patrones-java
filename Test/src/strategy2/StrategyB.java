package strategy2;

public class StrategyB implements Strategy{
	@Override
	public void behaviour() {
		System.out.println("Estrategia B ");
	}
	
	
	@Override
	public void pago() {
		System.out.println(" Tipo de pago para la estrategia B ");
	}
	
	
	
	
	
}