package OOP.classes;

import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        List<Product> products = productManager.getAll();
       /* for (Product product1:products){
            System.out.println(product1.getName());
        }

        System.out.println("-----------------------------------------------");


        Product product = new Product();
        product.setId(1);
        product.setName("Çamaşır Makinesi");

        System.out.println(product.getName() + " " + product.getUnitPrice());

        System.out.println("-----------------------------------------------");

        productManager.addBasketProduct(product);
        productManager.add(product);

        for (Product product1:products){
            System.out.println(product1.getName());
        }

        System.out.println("-----------------------------------");

        Product responseProduct = productManager.getById(2);
        System.out.println(responseProduct.getId() + " " + responseProduct.getName() + " "
                + responseProduct.getUnitPrice());

        System.out.println("-----------------------------------");

        Product responseProduct1 = productManager.getByName("Laptop");
        System.out.println(responseProduct1.getId() + " " + responseProduct1.getName() + " "
                + responseProduct1.getUnitPrice());


        System.out.println("---------------------------------");
        Product updatedProduct = new Product();
        updatedProduct.setId(1);
        updatedProduct.setName("Bulaşık Makinesi");
        updatedProduct.setUnitPrice(11000);
        productManager.update(updatedProduct);

        for (Product product1:products){
            System.out.println(product1.getName() + " " + product1.getUnitPrice());
        }*/

        System.out.println("---------------------------------");
        productManager.delete(3);
        for (Product product1:products){
            System.out.println(product1.getName() + " " + product1.getUnitPrice());
        }

    }



}
