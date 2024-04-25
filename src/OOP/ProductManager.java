package OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductManager {
    private final List<Product> products;

    public ProductManager(){
        products = new ArrayList<Product>();
        products.add(new Product(1,"Laptop",25000,2));
        products.add(new Product(2,"Tablet",12000,5));
        products.add(new Product(3,"Çamaşır Makinesi",11000,5));
    }

    public List<Product> getAll(){
        return products;
    }

    public void addBasketProduct(Product product){
        System.out.println("Başarıyla sepete eklendi " + product.getName());
    }

    public void add(Product product){
        products.add(product);
    }


    public Product getById(int id){
        for(Product product:products){
            if(product.getId()==id){
                return product;
            }
        }
        return null;
    }

    public Product getByName(String name){
        for (Product product:products){
            if(product.getName()==name){
                return product;
            }
        }
        return null;
    }

    public void update(Product product){
        for (Product updateProduct:products){
            if (updateProduct.getId()==product.getId()){
                updateProduct.setName(product.getName());
                updateProduct.setUnitPrice(product.getUnitPrice());
            }
        }
    }


    public void delete(int id){
        Iterator<Product> iterator = products.iterator();
        while(iterator.hasNext()){
            Product product = iterator.next();
            if (product.getId()==id){
                iterator.remove();
            }
        }
        /*for(Product product:products){
            if (product.getId()==id){
                products.remove(id-1);
            }
        }*/
    }
}


//Technology diye bir sınıf oluşturun. id,name,programmingLanguageName list,update,delete,add,getById
//metodlarımızı yazalım.