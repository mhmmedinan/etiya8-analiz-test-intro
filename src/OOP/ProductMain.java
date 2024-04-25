package OOP;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        Product product = new Product(1,"Laptop",25000,5);

        System.out.println(product.name + " " + product.unitPrice);

        //--------------------------------------------------------

        productManager.addBasketProduct(product);
        productManager.add(product);


        List<Product> products = productManager.getAll();
        for (Product product1:products){
            System.out.println(product1.name);
        }


    }



}
