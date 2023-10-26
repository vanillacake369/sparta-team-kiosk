package domain.cart.entity;

import domain.product.entity.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cart {
    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public int getProductCount() {
        return products.size();
    }

    public boolean addProduct(Product product) {
        return products.add(product);
    }

    //printAllProduct
    @Override
    public String toString() {
        return products.stream()
                .map(Product::toString)
                .collect(Collectors.joining());
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for (Product product : products) {
            totalPrice = product.getPrice() + totalPrice;
        }
        return totalPrice;
    }

    public void clear() {
        products.clear();
    }
}
