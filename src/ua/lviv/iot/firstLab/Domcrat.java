package ua.lviv.iot.firstLab;

public class Domcrat {
	private static int shape;
	protected int priceInHryvnia;
	protected String description;
	private int maxLiftingWeightInKilograms;
	private String producerName;
	private String colour;
	private int weightInKilograms;
	private String type;
	private int heightInSm;

	public Domcrat(int maxLiftingWeightInKilograms, String producerName, String colour, int weightInKilograms,
			int priceinHryvnia, String description) {
		this.maxLiftingWeightInKilograms = maxLiftingWeightInKilograms;
		this.producerName = producerName;
		this.colour = colour;
		this.weightInKilograms = weightInKilograms;
		this.priceInHryvnia = priceinHryvnia;
		this.description = description;
	}

	public Domcrat(int maxLiftingWeightInKilograms, String producerName, String colour, int weightInKilograms,
			int priceinHryvnia) {
		this(maxLiftingWeightInKilograms, producerName, colour, weightInKilograms, priceinHryvnia, null);

	}

	public Domcrat() {
	}

	public static void domcratShape() {
		System.out.println(shape);
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeightInKilograms() {
		return weightInKilograms;
	}

	public void setWeightInKilograms(int weightInKilograms) {
		this.weightInKilograms = weightInKilograms;
	}

	public int getPriceInHryvnia() {
		return priceInHryvnia;
	}

	public void setPriceInHryvnia(int priceInHryvnia) {
		this.priceInHryvnia = priceInHryvnia;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Domcrat{" + "maxLiftingWeightInKilograms=" + maxLiftingWeightInKilograms + ", producerName='"
				+ producerName + '\'' + ", colour='" + colour + '\'' + ", weightInKilograms=" + weightInKilograms
				+ ", type='" + type + '\'' + ", heightInSm=" + heightInSm + ", priceInHryvnia=" + priceInHryvnia
				+ ", description='" + description + '\'' + '}';
	}

	public void shapeOfDomcrat() {
		System.out.println(shape);
	}
}
