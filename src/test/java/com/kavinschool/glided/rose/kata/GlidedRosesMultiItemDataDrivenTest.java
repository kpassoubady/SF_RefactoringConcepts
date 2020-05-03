package com.kavinschool.glided.rose.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GlidedRosesMultiItemDataDrivenTest {

    Item[] items;
    Item[][] expectedItemsDay = new Item[2][6];

    @Before
    public void setUp() throws Exception {
        items = new Item[]{
                new Item("Aged Brie", 2, 0), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 50), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)
                //
        };

        expectedItemsDay[0] = new Item[]{
                new Item("Aged Brie", 1, 1), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 50), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 48),
                new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21),
                new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", 4, 50)
                //
        };
        expectedItemsDay[1] = new Item[]{
                new Item("Aged Brie", 0, 2), //
                new Item("Sulfuras, Hand of Ragnaros", 0, 50), //
                new Item("Sulfuras, Hand of Ragnaros", -1, 47),
                new Item("Backstage passes to a TAFKAL80ETC concert", 13, 22),
                new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50)
                //
        };
    }

    @Test
    public void testMultiDays() {
        GildedRose app = new GildedRose(items);
        int days = 2;
        for (int day = 0; day < days; day++) {
            app.updateQuality();
            for (int item = 0; item < items.length; item++) {
                String expectedSingleItem = expectedItemsDay[day][item].name + ", " + expectedItemsDay[day][item].sellIn + ", " + expectedItemsDay[day][item].quality;
                assertEquals(expectedSingleItem,app.items[item].toString());
                assertEquals(expectedItemsDay[day][item].name, app.items[item].name);
                assertEquals(expectedItemsDay[day][item].sellIn, app.items[item].sellIn);
                assertEquals(expectedItemsDay[day][item].quality, app.items[item].quality);
            }
        }
    }
}
