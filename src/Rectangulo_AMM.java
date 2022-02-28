/** 
* @autor Alex Miralles Montalvo
* @version 1.2
**/

public class Rectangulo_CM extends FiguraGeometrica_AMM {
	private double l1;
	private double l2;
	
	
/**
 * Constructor.
 * @param tipoFigura
 * @param lG
 * @param lP
**/
	public Rectangulo_AMM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
/**
 * Calcula el área.
 * @return l1 * l2
**/
	@Override
	public double area() {
		return l1 * l2;
	}
	
/**
* Calcula el perimetro.
* @return l1 * l2
**/
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
