package xom.phoenix.Phoenix;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstprojTest {

	@Test
	public void test() {
		FirstProj s=new FirstProj();
		int output=s.squareOf(5);
		assertEquals(25,output);
	}

}
