package domain.menu.Store;
import java.util.ArrayList;
import java.util.List;


public class Store {

    public static void main(String[] args) {
        private List<Menu> storedMenus = new ArrayList<>();

        // 상품 등록 메서드
        public boolean addProduct (String menuName, String productName, String productDescription,double productPrice){
            // 메뉴를 찾아서 상품을 추가
            Menu menu = findMenuByName(menuName);
            if (menu != null) {
                Product product = new Product(productName, productDescription, productPrice);
                menu.addProduct(product);
                return true;
            }
            return false;
        }

        // 상품 삭제 메서드
        public boolean removeProduct ( int id) throws IllegalArgumentException {
            for (Menu menu : storedMenus) {
                if (menu.removeProduct(id)) {
                    return true;
                }
            }
            throw new IllegalArgumentException("Product with id " + id + " not found.");
        }

        // 대기 주문 조회 메서드
        public List<Order> selectWaitingOrders () {
            // 대기 주문 목록을 반환
            return new ArrayList<>(); // 실제 데이터를 구현해야 함
        }

        // 대기 주문 처리 메서드
        public boolean completeWaitingOrder ( int waitingNumber){
            // 대기 주문을 처리하고 완료 주문 목록에 추가
            // 실제 데이터 및 처리 로직을 구현해야 함
            return false;
        }

        // 주문 완료 조회 메서드
        public List<CompletedOrder> selectCompletedOrders () {
            // 주문 완료 목록을 반환
            return new ArrayList<>(); // 실제 데이터를 구현해야 함
        }

        private Menu findMenuByName (String menuName){
            for (Menu menu : storedMenus) {
                if (menu.getName().equals(menuName)) {
                    return menu;
                }
            }
            return null;
        }
    }

    class Menu {
        private String name;
        private List<Product> products = new ArrayList<>();

        public Menu(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public boolean removeProduct(int id) {
            for (Product product : products) {
                if (product.getId() == id) {
                    products.remove(product);
                    return true;
                }
            }
            return false;
        }
        // 다른 필드, getter 및 setter 메서드 추가 필요
    }

    class Product {
        private static int nextId = 1;
        private int id;
        private String name;
        private String description;
        private double price;

        public Product(String name, String description, double price) {
            this.id = nextId++;
            this.name = name;
            this.description = description;
            this.price = price;
        }

        public int getId() {
            return id;
        }
        // 다른 필드, getter 및 setter 메서드는 추가 필요
    }

    class Order {
        // 주문과 관련된 필드와 메서드 추가 필요
    }

    class CompletedOrder {
        // 완료된 주문과 관련된 필드와 메서드 추가 필요
    }

}