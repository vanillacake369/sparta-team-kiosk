package main.domain.product.entity;

public class ProductId {
    private static int id = 0;

    // auto increment
    public static int getIncrementedId() {
        return ++id;
    }
}
