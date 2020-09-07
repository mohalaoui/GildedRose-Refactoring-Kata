package com.gildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.gildedrose.factory.ItemUpdaterFactory;

class ItemUpdaterFactoryTest {

	@Test
	void should_get_BackstagePassesUpdater_instance() {
		//GIVEN
		ItemUpdaterFactory itemUpdaterFactory = new ItemUpdaterFactory();
		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20);
		
		//WHEN
		ItemUpdater itemUpdater = itemUpdaterFactory.getItemUpdater(item);
		
		//THEN
		assertThat(itemUpdater).isInstanceOf(BackstagePassesUpdaterImpl.class);
	}
	
	@Test
	void should_get_AgedBrieUpdater_instance() {
		//GIVEN
		ItemUpdaterFactory itemUpdaterFactory = new ItemUpdaterFactory();
		Item item = new Item("Aged Brie", 2, 0);
		
		//WHEN
		ItemUpdater itemUpdater = itemUpdaterFactory.getItemUpdater(item);
		
		//THEN
		assertThat(itemUpdater).isInstanceOf(AgedBrieUpdaterImpl.class);
	}

	@Test
	void should_get_SulfurasUpdater_instance() {
		//GIVEN
		ItemUpdaterFactory itemUpdaterFactory = new ItemUpdaterFactory();
		Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
		
		//WHEN
		ItemUpdater itemUpdater = itemUpdaterFactory.getItemUpdater(item);
		
		//THEN
		assertThat(itemUpdater).isInstanceOf(SulfurasUpdaterImpl.class);
	}
	
	@Test
	void should_get_NormalItemUpdater_instance() {
		//GIVEN
		ItemUpdaterFactory itemUpdaterFactory = new ItemUpdaterFactory();
		Item item = new Item("+5 Dexterity Vest", 0, 80);
		
		//WHEN
		ItemUpdater itemUpdater = itemUpdaterFactory.getItemUpdater(item);
		
		//THEN
		assertThat(itemUpdater).isInstanceOf(NormalItemUpdaterImpl.class);
	}
}
