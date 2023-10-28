package main.domain.product.entity;

public class ProductId {
    private static int id = 1;

    // auto increment
    public static int getIncrementedId() {
        return ++id;
    }
}
