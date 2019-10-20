package strategy;

import strategy.AbstractArea;
public class AreaCircular extends AbstractArea{

	private float radio;

	public AreaCircular(float radio) {
		this.radio = radio;
	}
	
	@Override
    public float calcularArea(float radio ) {
		return (float)(Math.PI * Math.pow(radio,2));
	}
	
	
	
	
	
	
	
}
