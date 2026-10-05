package Project;

public class Store_Stuff {
	protected String staff_name;
	protected double staff_commision;
	public boolean request;

	protected void makeRequest(Gardener gar) {
		if (request == true) {
			gar.give_advice();
		}
	}
	
	public Store_Stuff(String staff_name, double staff_commision) {
		this.staff_name = staff_name;
		this.staff_commision = staff_commision;
		this.request = false;
	}
	
	protected double getStaff_commision() {
		return staff_commision;
	}
	protected void setStaff_commision(double staff_commision) {
		this.staff_commision = staff_commision;
	}
	protected String getStaff_name() {
		return staff_name;
	}
	protected void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	
	
}
