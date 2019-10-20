package strategy;

public abstract class AbstractArea implements IArea {
	
	private String nombreFigura;

	public AbstractArea(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}

	public String getNombreFigura() {
		return nombreFigura;
	}

	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}
	
	public String metodoIntefaz() {
		return "algo";
		
	}
	
	@Override
	public abstract float calcularArea();
	

}
