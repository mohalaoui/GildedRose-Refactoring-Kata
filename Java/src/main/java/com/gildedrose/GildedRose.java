package com.gildedrose;

import com.gildedrose.factory.ItemUpdaterFactory;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			updateItem(item);
		}
	}

	private void updateItem(Item item) {
		ItemUpdater updater = new ItemUpdaterFactory().getItemUpdater(item);
		updater.update(item);
	}



	


	
	
}