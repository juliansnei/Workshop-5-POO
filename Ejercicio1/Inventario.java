package Ejercicio1;

import java.util.ArrayList;

public class Inventario {
	private ArrayList<ProductoEspecifico> products;
	
	public Inventario() {
		 products = new ArrayList<ProductoEspecifico>();
	}
	
	public void toAddProduct(ProductoEspecifico producto) {
		products.add(producto);
		System.out.println("Has añadido " + producto.getName() + " al inventario");
	}
	
	public void toRemoveProduct(ProductoEspecifico producto) {
		products.remove(products.indexOf(producto));
		System.out.println("Has borrado el producto " + producto.getName() + " del Inventario");
	}
	
	public void toShowProducts() {
		System.out.println("Aquí estan los productos que hay en el inventario listados: ");
		for(ProductoEspecifico product: products) {
			System.out.println("Name: " + product.getName() + ", ID: " + product.getId() + ", Price: " + product.getPrice() +  ", Categorie: " + product.getCategory() + ", Brand: " + product.getBrand());
		}
	}
	
	public void toSearchByCategory(String categorieForSearch) {
		System.out.println("Products by category: " + categorieForSearch);
		for(ProductoEspecifico product: products) {
			if(product.getCategory() == categorieForSearch) {
				System.out.println("Product found --> Name: " + product.getName() + ", ID: " + product.getId() + ", Price: " + product.getPrice() +  ", Categorie: " + product.getCategory() + ", Brand: " + product.getBrand());
			}
		}
	}
	
	public void toSearchByName(String name) {
		System.out.println("Products by name: " + name);
		for(ProductoEspecifico product: products) {
			if(product.getName() == name) {
				System.out.println("Product found --> Name: " + product.getName() + ", ID: " + product.getId() + ", Price: " + product.getPrice() +  ", Categorie: " + product.getCategory() + ", Brand: " + product.getBrand());
			}
		}
	}
}
