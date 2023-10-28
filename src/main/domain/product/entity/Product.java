package main.domain.product.entity;


public class Product {
    private static int id = 1;
    private String name;
    private String description;
    private double price;

    public static Product makeProduct(int id, String name, double price, String description) {
        return new Product(id, name, price, description);
    }


    // @임지훈
    // private으로 막아두고 싶은데,,,여기저기서 사용되는 부분이 많음
    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // @임지훈
    // private으로 막아두고 싶은데,,,여기저기서 사용되는 부분이 많음
    public Product() {
    }


    // 생성된 메뉴의 제품 추가
    public static Product makeProductOfNewMenu(int id, String name, double price, String description) {
        Product product = new Product();
        product.id = id;
        product.name = name;
        product.price = price;
        product.description = description;
        return product;
    }

    @Override
    public String toString() {
        return String.format("Id : %s | %s | W %s | %s\n", id, this.name, this.price, this.description);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public static void incrementId() {
        id += 1;
    }
}
