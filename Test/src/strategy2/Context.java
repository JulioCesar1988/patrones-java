package strategy2;

public class Context {

	Strategy c;

	public Context(Strategy c) {
		this.c = c;
	}

	public void setStrategy(Strategy c) {
		this.c = c;
	}

	public void some_method() {
		c.behaviour();
	}

	public void pago() {
		c.pago();
	}

}
