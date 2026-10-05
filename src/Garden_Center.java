package Project;

public class Garden_Center {
	private Store store; 
    public Garden_Center(Store store) {
        this.store = store;
    }
	  Gardener gar = new Gardener(40000, "Cathal McCarthy"); 
	  Store_Stuff stuff = new Store_Stuff("Caoimhe Byrne", 0.1);
	  
	  protected void stuffCommission(Store_Stuff com, Store sales) {
		    double commission = com.getStaff_commision() * sales.getTotalDailySales();
		    System.out.printf("Commission earned: %.2f euro \n", commission);
	  }
	  
	public void startPlanting() {
		gar.planting();
		gar.feeding();
		gar.watering();
		gar.picking();
		store.startPlanting();
	}
	
	
	public void showDailySales() {
		System.out.printf("Total daily sales: %.2f euro.\n", store.getTotalDailySales());
	}
	
	

}
