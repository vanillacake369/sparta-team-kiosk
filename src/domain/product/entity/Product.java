package domain.product.entity;


public class Product {
    private int id;
    private String name;
    private String description;
    private double price;

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    private Product() {
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
}
