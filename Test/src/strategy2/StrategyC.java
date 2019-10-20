package strategy2;


public class StrategyC implements Strategy{
	@Override
	public void behaviour() {
		System.out.println(" Estrategia C");
	}
	
	public void pago() {
		System.out.print(" Tipo de pago para la estrategia C ");
	}
	
	
}
