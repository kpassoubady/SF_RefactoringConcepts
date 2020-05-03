package com.kavinschool.glided.rose.kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void testUpdateQualityForAgedBrie() {
        Item[] items = new Item[]{new Item("Aged Brie", 100, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(99, app.items[0].sellIn);
        assertEquals(31, app.items[0].quality);
    }

    @Test
    public void testUpdateQualityForAgedBrieLessThan50() {
        Item[] items = new Item[]{new Item("Aged Brie", 49, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(48, app.items[0].sellIn);
        assertEquals(31, app.items[0].quality);
    }

    @Test
    public void testUpdateQualityForSulfuras() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 100, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(100, app.items[0].sellIn);
        assertEquals(30, app.items[0].quality);
    }

    @Test
    public void testUpdateQualityForSulfurasQuality0() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 100, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(100, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    public void testUpdateQualityForSulfurasQualityLessThan0() {
        Item[] items = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 100, -1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[0].name);
        assertEquals(100, app.items[0].sellIn);
        assertEquals(-1, app.items[0].quality);
    }
    @Test
    public void testUpdateQualityBackstage() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 100, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(99, app.items[0].sellIn);
        assertEquals(31, app.items[0].quality);
    }

    @Test
    public void testUpdateQualityBackstageSellInLessThan6QualityLessThan50() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    public void testUpdateQualityBackstageSellInLessThan11QualityLessThan50() {
        Item[] items = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[0].name);
        assertEquals(9, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

}