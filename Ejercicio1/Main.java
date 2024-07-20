package Ejercicio1;

public class Main {
	public static void main(String[] arg) {
		Inventario inventario1 = new Inventario();
		
		ProductoEspecifico producto1 = new ProductoEspecifico("12", "Banana", 2000.0, "fruit", "United Fruit");
		ProductoEspecifico producto2 = new ProductoEspecifico("12", "Pineapple", 5000.0, "fruit", "Chiquita");
		ProductoEspecifico producto3 = new ProductoEspecifico("21", "Cellphone", 300000.0, "device", "Apple");
		ProductoEspecifico producto4 = new ProductoEspecifico("21", "Tablet", 150000.0, "device", "Microsoft");
		ProductoEspecifico producto5 = new ProductoEspecifico("31", "Couch", 500000.0, "furniture", "Home Depot");
		ProductoEspecifico producto6 = new ProductoEspecifico("32", "Lamp", 50000.0, "furniture", "Home Depot");
		
		inventario1.toAddProduct(producto1);
		inventario1.toAddProduct(producto2);
		inventario1.toAddProduct(producto3);
		inventario1.toAddProduct(producto4);
		inventario1.toAddProduct(producto5);
		inventario1.toAddProduct(producto6);
				
		System.out.println();
		
		inventario1.toShowProducts();
		
		System.out.println();
		
		inventario1.toRemoveProduct(producto6);
		inventario1.toRemoveProduct(producto4);
		
		System.out.println();
		
		inventario1.toShowProducts();
		
		System.out.println();
		
		inventario1.toSearchByCategory("device");
		
		System.out.println();
		
		inventario1.toSearchByCategory("fruit");
		
		System.out.println();
		
		inventario1.toSearchByName("Pineapple");
	}

}
