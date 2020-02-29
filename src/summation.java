import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class summation {

	@Test
	void test() {
		int a =30;
		int c= 400;
		Sum p = new Sum();
		p.setX(a);
		p.setY(c);
	
		int g = p.plus(a, c);
		
		assertEquals(430,g);
			
		
	}

}
