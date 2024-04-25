package OOP;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();
    public List<Product> getAll(){
        Product product = new Product(1,"Laptop",25000,2);
        Product product2 = new Product(2,"Tablet",12000,5);
        Product product3 = new Product();

        products.add(product);
        products.add(product2);
        return products;
    }

    public void addBasketProduct(Product product){
        System.out.println("Başarıyla sepete eklendi" + product.name);
    }

    public void add(Product product){
        products.add(product);
    }


}
