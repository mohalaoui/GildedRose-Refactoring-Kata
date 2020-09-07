package com.gildedrose;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class GildedRoseTest {
	
	@Test
	  void shouldUpdateForOneDay() {
		Item[] items = TexttestFixture.getItems();
	    GildedRose rose = new GildedRose(items);

	    rose.updateQuality();

	    assertThat(rose.items).extracting(Item::getSellIn).containsExactly(9, 1, 4, 0, -1, 14, 9, 4);
	    assertThat(rose.items).extracting(Item::getQuality).containsExactly(19, 1, 6, 80, 80, 21, 50, 50);
	  }


	@Test
	void golden_master_test() {

		// GIVEN
		GildedRose rose = new GildedRose(TexttestFixture.getItems());
		GildedRoseGoldenMaster golden = new GildedRoseGoldenMaster(TexttestFixture.getItems());

		for (int day = 0; day < 100; day++) {
		      rose.updateQuality();
		      golden.updateQuality();

		      assertThat(rose.items)
		        .extracting(Item::getSellIn)
		        .containsExactly(Arrays.stream(golden.items).map(Item::getSellIn).toArray(Integer[]::new));
		      assertThat(rose.items)
		        .extracting(Item::getQuality)
		        .containsExactly(Arrays.stream(golden.items).map(Item::getQuality).toArray(Integer[]::new));
		    }


	}

}
