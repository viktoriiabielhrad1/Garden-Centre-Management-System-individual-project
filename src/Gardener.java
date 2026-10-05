package Project;

public class Gardener {
	protected int gardener_annualSalary;
	protected String gardener_name;
	
	protected void planting() {
		System.out.println("Planting.");
	}
	protected void feeding () {
		System.out.println("Feeding.");
	}
	protected void watering() {
		System.out.println("Watering.");
	}
	protected void picking() {
		System.out.println("Picking.");
	}
	protected void give_advice() {
		System.out.println("Giving advice.");
	}
	
	public Gardener(int gardener_annualSalary, String gardener_name) {
		this.setGardener_annualSalary(gardener_annualSalary);
		this.setGardener_name(gardener_name);
	}
	
	protected String getGardener_name() {
		return gardener_name;
	}
	protected void setGardener_name(String gardener_name) {
		this.gardener_name = gardener_name;
	}
	protected int getGardener_annualSalary() {
		return gardener_annualSalary;
	}
	protected void setGardener_annualSalary(int gardener_annualSalary) {
		this.gardener_annualSalary = gardener_annualSalary;
	}
	
	
	
}