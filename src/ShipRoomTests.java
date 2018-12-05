import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShipRoomTests {

	@Test
	void toString_galley_contains_the_word_galley() {
		ShipRoom room = new ShipRoom("galley");
		assertTrue(room.toString().contains("galley"),
				"Galley should contain 'galley'.");
	}
	
	@Test
	void toString_science_lab_contains_the_words_science_lab() {
		ShipRoom room = new ShipRoom("science lab");
		assertTrue(room.toString().contains("science lab"),
				"Science lab should contain 'science lab'.");
	}

	@Test
	void get_returns_null_when_room_has_no_awfulGreenThings() {
		ShipRoom room = new ShipRoom("room");
		
		AwfulGreenThing adultGreenThingsInRoom = room.get("adult", 1);
		AwfulGreenThing babyGreenThingsInRoom = room.get("baby", 1);
		AwfulGreenThing eggsInRoom = room.get("egg", 1);
		AwfulGreenThing fragmentsInRoom = room.get("fragment", 1);
		
		assertNull(adultGreenThingsInRoom);
		assertNull(babyGreenThingsInRoom);
		assertNull(eggsInRoom);
		assertNull(fragmentsInRoom);
	}
	
}
