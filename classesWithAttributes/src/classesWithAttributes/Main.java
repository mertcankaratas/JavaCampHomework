package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","AssusLaptop",3000,2,"Siyah");
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);

		System.out.println(product.getKod());
	}

}
