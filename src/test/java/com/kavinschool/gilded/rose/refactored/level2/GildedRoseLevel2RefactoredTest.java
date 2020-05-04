package com.kavinschool.gilded.rose.refactored.level2;

import com.kavinschool.gilded.rose.kata.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class GildedRoseLevel2RefactoredTest {
    Item[] items;
    String expectedName;
    int expectedSellIn;
    int expectedQuality;


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Item[]{new Item("Aged Brie", 100, 30)},"Aged Brie",99,31},
                {new Item[]{new Item("Aged Brie", 49, 30)},"Aged Brie",48,31},
                {new Item[]{new Item("Aged Brie", -1, 20)},"Aged Brie",-2,22},
                {new Item[]{new Item("Sulfuras, Hand of Ragnaros", 100, 30)},"Sulfuras, Hand of Ragnaros",100,30},
                {new Item[]{new Item("Sulfuras, Hand of Ragnaros", 100, 0)},"Sulfuras, Hand of Ragnaros",100,0},
                {new Item[]{new Item("Sulfuras, Hand of Ragnaros", 100, -1)},"Sulfuras, Hand of Ragnaros",100,-1},
                {new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 100, 30)},"Backstage passes to a TAFKAL80ETC concert",99,31},
                {new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)},"Backstage passes to a TAFKAL80ETC concert",4,50},
                {new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)},"Backstage passes to a TAFKAL80ETC concert",9,50},
                // 100% coverage?
                //{new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", -1, 49)},"Backstage passes to a TAFKAL80ETC concert",-2,0},
                //{new Item[]{new Item("Super Duper Kangs", 1, 10)},"Super Duper Kangs",0,9},
                //{new Item[]{new Item("Sulfuras, Hand of Ragnaros", -1, 20)},"Sulfuras, Hand of Ragnaros",-1,19},

        });
    }

    public GildedRoseLevel2RefactoredTest(Item[] items, String expectedName, int expectedSellIn, int expectedQuality) {
        this.items = items;
        this.expectedName = expectedName;
        this.expectedSellIn = expectedSellIn;
        this.expectedQuality = expectedQuality;
    }

    @Test
    public void updateQuality() {
        GildedRoseLevel2Refactored app = new GildedRoseLevel2Refactored(items);
        app.updateQuality();
        assertEquals(expectedName, app.items[0].name);
        assertEquals(expectedSellIn, app.items[0].sellIn);
        assertEquals(expectedQuality, app.items[0].quality);
        // 100 % coverage?
        //assertEquals(expectedName+", "+expectedSellIn+", "+expectedQuality, app.items[0].toString());
    }

}