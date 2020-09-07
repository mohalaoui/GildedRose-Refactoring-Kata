package com.gildedrose;

public class BackstagePassesUpdaterImpl implements ItemUpdater {

	@Override
	public void update(Item item) {
		item.increaseQuality();

		if (item.getSellIn() <= 10) {
			item.increaseQuality();
		}

		if (item.getSellIn() <= 5) {
			item.increaseQuality();
		}
		if (item.getSellIn() <= 0) {
			item.setQualityToZero();
		}
		item.decreaseSellIn();
	}

	

}
