package com.gildedrose;

public class NormalItemUpdaterImpl implements ItemUpdater {

	@Override
	public void update(Item item) {
		item.decreaseQuality();
		if (item.getSellIn() <= 0) {
			item.decreaseQuality();
		}
		item.decreaseSellIn();
	}

}
