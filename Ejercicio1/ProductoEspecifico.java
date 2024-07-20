package Ejercicio1;

public class ProductoEspecifico extends Producto {
	private String category;
	private String brand;
	public ProductoEspecifico(String id, String name, Double price, String category, String brand) {
		super(id, name, price);
		this.category = category;
		this.brand = brand;
	}
	
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
