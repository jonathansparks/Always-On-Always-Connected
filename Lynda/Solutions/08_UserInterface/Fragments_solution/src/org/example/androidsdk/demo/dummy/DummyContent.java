package org.example.androidsdk.demo.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<Flower> ITEMS = new ArrayList<Flower>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, Flower> ITEM_MAP = new HashMap<String, Flower>();

	static {
		// Add 3 sample items.
		addItem(new Flower("1", "Flower 1"));
		addItem(new Flower("2", "Flower 2"));
		addItem(new Flower("3", "Flower 3"));
	}

	private static void addItem(Flower item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.name, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class Flower {
		public String name;
		public String content;

		public Flower(String id, String content) {
			this.name = id;
			this.content = content;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}
