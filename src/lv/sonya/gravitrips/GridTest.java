package lv.sonya.gravitrips;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GridTest {

	@Test
	public void testResolveHorizontal() {
		Grid grid = new Grid();
		// @formatter:off
		grid.coins = new Coin[][] {
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, Coin.O},
			{null, null, null, Coin.O, Coin.O, Coin.O, Coin.O},
			{null, null, null, null, null, null, null},
			{Coin.O, Coin.O, null, Coin.O, null, null, null},
			};
			// @formatter:on
		assertEquals(true, grid.resolveHorizontal(Coin.O));
	}

	@Test
	public void testResolveVertical() {
		Grid grid = new Grid();
		// @formatter:off
		grid.coins = new Coin[][] {
			{null, null, null, Coin.O, Coin.O, Coin.O, null},
			{null, null, null, null, Coin.O, null, null},
			{null, null, null, null, Coin.O, null, null},
			{null, null, null, null, Coin.O, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			};
			// @formatter:on
		assertEquals(true, grid.resolveVertical(Coin.O));
	}

	@Test
	public void testResolveDiagonalRight() {
		Grid grid = new Grid();
		// @formatter:off
		grid.coins = new Coin[][] {
			{null, null, null, Coin.O, null, null, null},
			{null, null, Coin.O, null, null, null, null},
			{null, Coin.O, null, null, null, null, null},
			{Coin.O, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			};
			// @formatter:on
		assertEquals(true, grid.resolveDiagonalRight(Coin.O));
	}

}
