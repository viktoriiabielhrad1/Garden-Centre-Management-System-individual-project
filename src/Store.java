package Project;

public class Store {
	protected int cactiStock;
	protected int bonsaiStock;
	protected double totalDailySales = 0;
	
	public void startPlanting() {
		cactiStock = 1000;
		bonsaiStock = 1000;
		System.out.println("Planted and picked.");
	}
	public void sell_bonsaiTree(int enterQuantity, Bonsai price) {
		if (enterQuantity <= bonsaiStock) {
			bonsaiStock = bonsaiStock - enterQuantity;
			totalDailySales = totalDailySales + enterQuantity*price.getPlant_price();
			System.out.println("Sold");
		}
		else {
			System.out.println("Not enough stock.");
		}
	}
	public void sell_cacti(int enterQuantity, Cacti price) {
		if (enterQuantity <= cactiStock) {
			cactiStock = cactiStock - enterQuantity;
			totalDailySales = totalDailySales + enterQuantity*price.getPlant_price();
			System.out.println("Sold");
		}
		else {
			System.out.println("Not enough stock.");
		}
	}
	public void stockLevel_dropping() {
		System.out.println("Initial stock of bonsai is 1000");
		System.out.println("Current bonsai stock is " + bonsaiStock);
		System.out.println("Initial stock of cacti is 1000");
		System.out.println("Current cacti stock is " + cactiStock);
	}
	
	public void showStock() {
	    System.out.println("Our stock:");
	    System.out.println("Bonsai trees: " + bonsaiStock);
	    System.out.println("Cacti: " + cactiStock);
	}
	
	protected double getTotalDailySales() {
		return totalDailySales;
	}
	protected void setTotalDailySales(double totalDailySales) {
		this.totalDailySales = totalDailySales;
	}
	
	protected int getBonsaiStock() {
		return bonsaiStock;
	}
	protected void setBonsaiStock(int bonsaiStock) {
		this.bonsaiStock = bonsaiStock;
	}
	protected int getCactiStock() {
		return cactiStock;
	}
	protected void setCactiStock(int cactiStock) {
		this.cactiStock = cactiStock;
	}
	
	
}


