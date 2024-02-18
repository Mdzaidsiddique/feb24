package Enum;

public enum Item {
	
	SUGER, SALT, RICE;
	
	public void info() {
		System.out.println("this is grocery items : ");
	}
	
	public static void main(String[] args) {
		Item[] item = Item.values();
		
		for(Item i: item) {
			i.info();
			System.out.println(i.ordinal()+" "+i.name());
		}
	}
}
