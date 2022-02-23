
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import test.Circulo_CM;
/**
 * @author klofenix
 *
 */

class Circulo_CMTest {
	private double radio;
	static final double PI = 3.1416;
	
}
@Test
void test() {
	Circulo_CM circ1 = new Circulo_CM(7, "tipoFigura");
	assertEquals(153.9384, circ1.area());
	assertEquals(43.9824, circ1.perimetro());

	Circulo_CM circ2 = new Circulo_CM(0, "tipoFigura");
	assertEquals(0, circ2.area());
	assertEquals(0, circ2.perimetro());

	Circulo_CM circ3 = new Circulo_CM(-3, "tipoFigura");
	assertEquals(28.2744, circ3.area());
	assertEquals(18.8496, circ3.perimetro());
}
	