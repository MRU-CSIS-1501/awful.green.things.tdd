
public class AwfulGreenThingsApp {

	public void run() {
		displayWelcome();
		ShipRoom room = new ShipRoom("Galley");
		
		room.add(3, new AwfulGreenThing("baby"));
		room.add(2, new AwfulGreenThing("adult"));
		room.add(4, new AwfulGreenThing("egg"));
		
		System.out.println("Here's what's in the room:");
		System.out.println(room);
		
		AwfulGreenThing firstAdult = room.get("adult", 1);
		firstAdult.grow();
		
		AwfulGreenThing secondBaby = room.get("baby", 2);
		secondBaby.frag(3);
		
		AwfulGreenThing thirdEgg = room.get("egg", 3);
		thirdEgg.shrink();
		
		System.out.println("Now here's what's in the room:");
		System.out.println(room);
		
	}

	private void displayWelcome() {
		System.out.println("Welcome to the AGTFOS App");
	}

}
