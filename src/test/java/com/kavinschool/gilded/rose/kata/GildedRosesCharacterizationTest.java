package com.kavinschool.gilded.rose.kata;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRosesCharacterizationTest {
	@Test
	public void testUpdateQuality() {
		Item[] items = new Item[] {new Item("Aged Brie",55, 25 )};
		GildedRose gildedRose = new GildedRose(items);
		gildedRose.updateQuality();
		assertEquals(26,gildedRose.items[0].quality);
		assertEquals(54,gildedRose.items[0].sellIn);
		assertEquals("Aged Brie",gildedRose.items[0].name);
	}

}
