package com.gildedrose;

public class AgedBrieUpdaterImpl implements ItemUpdater {

	@Override
	public void update(Item item) {
		item.increaseQuality();
		if (item.getSellIn() <= 0) {
			item.increaseQuality();
		}
		item.decreaseSellIn();
	}

}
