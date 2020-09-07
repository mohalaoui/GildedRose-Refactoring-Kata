package com.gildedrose.factory;

import static com.gildedrose.constant.ItemConstants.AGED_BRIE;
import static com.gildedrose.constant.ItemConstants.BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT;
import static com.gildedrose.constant.ItemConstants.SULFURAS_HAND_OF_RAGNAROS;

import com.gildedrose.AgedBrieUpdaterImpl;
import com.gildedrose.BackstagePassesUpdaterImpl;
import com.gildedrose.Item;
import com.gildedrose.ItemUpdater;
import com.gildedrose.NormalItemUpdaterImpl;
import com.gildedrose.SulfurasUpdaterImpl;

public class ItemUpdaterFactory {
	
	public ItemUpdater getItemUpdater(Item item) {
		ItemUpdater updater = null;
		switch (item.getName()) {
		case SULFURAS_HAND_OF_RAGNAROS:
			 updater = new SulfurasUpdaterImpl();
			break;
		case AGED_BRIE:
			 updater = new AgedBrieUpdaterImpl();
			break;
		case BACKSTAGE_PASSES_TO_A_TAFKAL80ETC_CONCERT:
			updater = new BackstagePassesUpdaterImpl();
			break;
		default:
			updater = new NormalItemUpdaterImpl();
			break;
		}
		return updater;
	}

}
