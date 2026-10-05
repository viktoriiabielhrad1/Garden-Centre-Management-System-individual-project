package Project;

class Bonsai extends Plant {

	public Bonsai(double plant_price, String plant_type, String plant_watering, int plant_maxLifetime,
			double plant_minHeight, double plant_maxHeight, String[] soil_type, String[] colours,
			boolean plant_readyForSale) {
		super(100,
				"Bonsai tree",
				"frequent",
				1000,
				0.1,
				0.5,
				new String [] {"fertilized"},
				new String [] {"pink", "orange", "yellow", "red"},
				true);
	}

	public Bonsai(double plant_price) {
		super(plant_price);
	}
	

}
