package domain.menu.cart;

import domain.menu.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products = new ArrayList<>();
    private int productCount;

    public List<Product> getProducts() {
        return products;
    }

    public double getSum() {
        return sum;
    }

    public int getProductCount() {
        return productCount;
    }

    public boolean addProduct(Product product) {
        return products.add(product);
    }

    public String printAllProducts() {
        return this.products.toString();
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        return totalPrice;
    }

    public void clear() {
        return;
    }

}
