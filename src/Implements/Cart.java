package Implements;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void clear() {
        products.clear();
    }

    public List<Product> getProducts() {
        return products;
    }
}
