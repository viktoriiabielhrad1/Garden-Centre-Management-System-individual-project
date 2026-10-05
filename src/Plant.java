package Project;

public abstract class Plant {
	protected double plant_price; //in euro
	protected String plant_type;
	protected String plant_watering;
	protected int plant_maxLifetime; //in years
	protected double plant_minHeight; //in meters
	protected double plant_maxHeight; //in meters
	protected String[] soil_type;
	protected String[] colours;
	protected boolean plant_readyForSale;
	
	protected boolean getPlant_readyForSale() {
		return plant_readyForSale;
	}
	protected void setPlant_readyForSale(boolean plant_readyForSale) {
		this.plant_readyForSale = plant_readyForSale;
	}
	
	protected String[] getSoil_type() {
		return soil_type;
	}
	protected void setSoil_type(String[] soil_type) {
		this.soil_type = soil_type;
	}
	
	protected int getPlant_maxLifetime() {
		return plant_maxLifetime;
	}
	protected void setPlant_maxLifetime(int plant_maxLifetime) {
		this.plant_maxLifetime = plant_maxLifetime;
	}
	protected String getPlant_watering() {
		return plant_watering;
	}
	protected void setPlant_watering(String plant_watering) {
		this.plant_watering = plant_watering;
	}
	protected String getPlant_type() {
		return plant_type;
	}
	protected void setPlant_type(String plant_type) {
		this.plant_type = plant_type;
	}
	protected double getPlant_price() {
		return plant_price;
	}
	protected void setPlant_price(double plant_price) {
		this.plant_price = plant_price;
	}
	protected double getPlant_maxHeight() {
		return plant_maxHeight;
	}
	protected void setPlant_maxHeight(double plant_maxHeight) {
		this.plant_maxHeight = plant_maxHeight;
	}
	protected double getPlant_minHeight() {
		return plant_minHeight;
	}
	protected void setPlant_minHeight(double plant_minHeight) {
		this.plant_minHeight = plant_minHeight;
	}
	protected String[] getColours() {
		return colours;
	}
	protected void setColours(String[] colours) {
		this.colours = colours;
	}
	public Plant(double plant_price, String plant_type, String plant_watering, int plant_maxLifetime,
			double plant_minHeight, double plant_maxHeight, String[] soil_type, String[] colours,
			boolean plant_readyForSale) {
		this.plant_price = plant_price;
		this.plant_type = plant_type;
		this.plant_watering = plant_watering;
		this.plant_maxLifetime = plant_maxLifetime;
		this.plant_minHeight = plant_minHeight;
		this.plant_maxHeight = plant_maxHeight;
		this.soil_type = soil_type;
		this.colours = colours;
		this.plant_readyForSale = plant_readyForSale;
	}
	public Plant(double plant_price) {
		this.plant_price = plant_price;
	}
	
	
}
