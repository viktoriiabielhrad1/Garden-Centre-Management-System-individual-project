package Project;

class Cacti extends Plant{

	public Cacti(double plant_price, String plant_type, String plant_watering, int plant_maxLifetime,
			double plant_minHeight, double plant_maxHeight, String[] soil_type, String[] colours,
			boolean plant_readyForSale) {
		super(30,
				"Cactus",
				"rare",
				10,
				0.01,
				2.0,
				new String [] {"fertilized", "arid"},
				new String [] {"green", "red", "blue"},
				true);
	}

	public Cacti(double plant_price) {
		super(plant_price);
	}

}
