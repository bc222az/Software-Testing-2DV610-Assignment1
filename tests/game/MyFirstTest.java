package game;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFirstTest {

	@Test
	public void test() {
		GameStarter gameStarter = new GameStarter();
		int result = gameStarter.testFunctiongetSum(1, 2);
		assertEquals(3,result);
	}

}
