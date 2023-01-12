package Composition;

public class Motherboard {
	private String model;
	private String manufacturer;
	private int ramSlots;
	private int cardslot;
	private String bios;
	
	public Motherboard(String model, String manufacturer, int ramSlots, int cardslot, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlots = ramSlots;
		this.cardslot = cardslot;
		this.bios = bios;
	}
	
	public void loadProgram(String programName) {
		System.out.println("Program "+programName+" is Loading......");
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getRamSlots() {
		return ramSlots;
	}

	public int getCardslot() {
		return cardslot;
	}

	public String getBios() {
		return bios;
	}
	
	

}
