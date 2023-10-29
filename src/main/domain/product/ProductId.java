package main.domain.product;

public class ProductId {
    private static int id = 0;

    // auto increment
    public static int getIncrementedId() {
        id += 1;
        return id;
    }

    public static int currentId() {
        return id;
    }
}
