package com.gildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ItemUpdaterimplTest {

	@Test
	void should_updateAgedBrie_when_sellin_upper_zero() {
		//GIVEN
		ItemUpdater agedBrieUpdater = new AgedBrieUpdaterImpl();
		Item item = new Item("Aged Brie", 2, 0);
		
		//WHEN
		agedBrieUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(1);
		assertThat(item.getSellIn()).isEqualTo(1);
	}
	
	@Test
	void should_update_up_agedBrie_quality_two_times_when_sellin_isEqualTo_zero() {
		//GIVEN
		ItemUpdater agedBrieUpdater = new AgedBrieUpdaterImpl();
		Item item = new Item("Aged Brie", 0, 0);
		
		//WHEN
		agedBrieUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(2);
		assertThat(item.getSellIn()).isEqualTo(-1);
	}

	@Test
	void should_update_up_agedBrie_quality_two_times_when_sellin_is_under_zero() {
		//GIVEN
		ItemUpdater agedBrieUpdater = new AgedBrieUpdaterImpl();
		Item item = new Item("Aged Brie", 0, 0);
		
		//WHEN
		agedBrieUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(2);
		assertThat(item.getSellIn()).isEqualTo(-1);
	}

	@Test
	void should_updateBackstagePasses_when_sellin_upper_zero() {
		//GIVEN
		ItemUpdater backstagePassesUpdater = new BackstagePassesUpdaterImpl();
		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
		
		//WHEN
		backstagePassesUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(21);
		assertThat(item.getSellIn()).isEqualTo(14);
	}
	
	@Test
	void should_updateBackstagePasses_quality_two_times_when_sellin_under_eleven() {
		//GIVEN
		ItemUpdater backstagePassesUpdater = new BackstagePassesUpdaterImpl();
		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
		
		//WHEN
		backstagePassesUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(22);
		assertThat(item.getSellIn()).isEqualTo(9);
	}
	
	@Test
	void should_update_BackstagePasses_quality_tree_times_when_sellin_under_six() {
		//GIVEN
		ItemUpdater backstagePassesUpdater = new BackstagePassesUpdaterImpl();
		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
		
		//WHEN
		backstagePassesUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(23);
		assertThat(item.getSellIn()).isEqualTo(4);
	}
	
	@Test
	void should_update_BackstagePasses_quality_to_zero_when_sellin_isEqualTo_zero() {
		//GIVEN
		ItemUpdater backstagePassesUpdater = new BackstagePassesUpdaterImpl();
		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
		
		//WHEN
		backstagePassesUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(0);
		assertThat(item.getSellIn()).isEqualTo(-1);
	}
	
	@Test
	void should_update_BackstagePasses_quality_to_zero_when_sellin_under_zero() {
		//GIVEN
		ItemUpdater backstagePassesUpdater = new BackstagePassesUpdaterImpl();
		Item item = new Item("Backstage passes to a TAFKAL80ETC concert", -1, 20);
		
		//WHEN
		backstagePassesUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(0);
		assertThat(item.getSellIn()).isEqualTo(-2);
	}
	
	@Test
	void should_not_update_Sulfuras_when_sellin_isEqualTo_zero() {
		//GIVEN
		ItemUpdater sulfurasUpdater = new SulfurasUpdaterImpl();
		Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
		
		//WHEN
		sulfurasUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(80);
		assertThat(item.getSellIn()).isEqualTo(0);
	}

	
	@Test
	void should_not_update_Sulfuras_when_sellin_under_zero() {
		//GIVEN
		ItemUpdater sulfurasUpdater = new SulfurasUpdaterImpl();
		Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 80);
		
		//WHEN
		sulfurasUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(80);
		assertThat(item.getSellIn()).isEqualTo(-1);
	}
	
	@Test
	void should_not_update_Sulfuras_when_sellin_upper_zero() {
		//GIVEN
		ItemUpdater sulfurasUpdater = new SulfurasUpdaterImpl();
		Item item = new Item("Sulfuras, Hand of Ragnaros", 5, 80);
		
		//WHEN
		sulfurasUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(80);
		assertThat(item.getSellIn()).isEqualTo(5);
	}
	
	@Test
	void should_decrease_NormalItem_quality_one_time_when_sellin_upper_zero() {
		//GIVEN
		ItemUpdater normalItemUpdater = new NormalItemUpdaterImpl();
		Item item = new Item("+5 Dexterity Vest", 10, 20);
		
		//WHEN
		normalItemUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(19);
		assertThat(item.getSellIn()).isEqualTo(9);
	}
	
	@Test
	void should_decrease_NormalItem_quality_two_times_when_sellin_equalTo_zero() {
		//GIVEN
		ItemUpdater normalItemUpdater = new NormalItemUpdaterImpl();
		Item item = new Item("+5 Dexterity Vest", 0, 20);
		
		//WHEN
		normalItemUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(18);
		assertThat(item.getSellIn()).isEqualTo(-1);
	}
	
	@Test
	void should_decrease_NormalItem_quality_two_times_when_sellin_under_zero() {
		//GIVEN
		ItemUpdater normalItemUpdater = new NormalItemUpdaterImpl();
		Item item = new Item("+5 Dexterity Vest", -2, 20);
		
		//WHEN
		normalItemUpdater.update(item);
		
		//THEN
		assertThat(item.getQuality()).isEqualTo(18);
		assertThat(item.getSellIn()).isEqualTo(-3);
	}

}
