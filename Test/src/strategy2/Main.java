package strategy2;

/***************
 * Strategy Encapsula algoritmos en clases, permitiendo que éstos sean
 * re-utilizados e intercambiables. En base a un parámetro, que puede ser
 * cualquier objeto, permite a una aplicación decidir en tiempo de ejecución el
 * algoritmo que debe ejecutar. La esencia de este patrón es encapsular
 * algoritmos relacionados que son subclases de una superclase común, lo que
 * permite la selección de un algoritmo que varia según el objeto y también le
 * permite la variación en el tiempo. Esto se define en tiempo de ejecución.
 * Este patrón busca desacoplar bifurcaciones inmensas con algoritmos
 * dificultosos según el camino elegido.
 * 
 * Este patrón debe utilizarse cuando:
 * 
 * Un programa tiene que proporcionar múltiples variantes de un algoritmo o
 * comportamiento. Es posible encapsular las variantes de comportamiento en
 * clases separadas que proporcionan un modo consistente de acceder a los
 * comportamientos. Permite cambiar o agregar algoritmos, independientemente de
 * la clase que lo utiliza.
 */
public class Main {
	public static void main(String args[]) {
		// Usamos la estrategia A
		Strategy estrategiaA = new StrategyA();
		Context context = new Context(estrategiaA);
		context.some_method();
		context.pago();

		// Decidimos usar la estrategia B
		Strategy estrategiaB = new StrategyB();
		context.setStrategy(estrategiaB);
		context.some_method();
		context.pago();

		// Decidimos usar la estrategia C
		Strategy estrategiaC = new StrategyC();
		context.setStrategy(estrategiaC);
		context.some_method();
		context.pago();

	}
}
