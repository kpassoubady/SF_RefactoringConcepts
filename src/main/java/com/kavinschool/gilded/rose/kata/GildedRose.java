package com.kavinschool.gilded.rose.kata;

// https://github.com/emilybache/GildedRose-Refactoring-Kata/tree/master/Java

public class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            updateSingleItem(i);
        }
    }

    private void updateSingleItem(int i) {
        if (items[i].name.equals(AGED_BRIE)
                || items[i].name.equals(BACKSTAGE_PASSES)) {
            if (items[i].quality < 50) {
                incQuality(i);

                if (items[i].name.equals(BACKSTAGE_PASSES)) {
                    itemsSellIn(i, 11);

                    itemsSellIn(i, 6);
                }
            }
        } else if (items[i].quality > 0 && !items[i].name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                decQuality(i);
            }

        if (items[i].name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
        } else {
            items[i].sellIn = items[i].sellIn - 1;
        }

        if (items[i].sellIn < 0) {
            whenSellIn(i);
        }
    }

    private void itemsSellIn(int i, int sellInQty) {
        if (items[i].sellIn < sellInQty) {
            whenQuality(i);
        }
    }

    private void whenSellIn(int i) {
        if (items[i].name.equals(AGED_BRIE)) {
            whenQuality(i);
        } else {
            if (items[i].name.equals(BACKSTAGE_PASSES)) {
                decQuality(i);
            } else {
                if (items[i].quality > 0) {
                    if (items[i].name.equals(SULFURAS_HAND_OF_RAGNAROS)) {
                        return;
                    }
                    decQuality(i);
                }
            }
        }
    }

    private void whenQuality(int i) {
        if (items[i].quality < 50) {
            incQuality(i);
        }
    }

    private void incQuality(int i) {
        items[i].quality = items[i].quality + 1;
    }

    private void decQuality(int i) {
        items[i].quality = items[i].quality - 1;
    }


}