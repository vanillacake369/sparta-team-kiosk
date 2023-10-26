package domain.store;

import domain.completedOrder.CompletedOrder;
import domain.menu.entity.Menu;
import domain.order.Order;
import domain.product.entity.Product;
import java.util.ArrayList;
import java.util.List;


public class Store {
    private static int id = 0;

    private List<Menu> storedMenus = new ArrayList<>();

    // 상품 등록 메서드
    public boolean addProduct(String menuName, String productName, String productDescription, double productPrice) {
        // 메뉴를 찾아서 상품을 추가
        Menu menu = findMenuByName(menuName);
        if (menu != null) {
            Product product = new Product(++id, productName, productPrice, productDescription);
            menu.addProduct(product);
            return true;
        }
        return false;
    }

    // 상품 삭제 메서드
    public boolean removeProduct(int id) throws IllegalArgumentException {
        for (Menu menu : storedMenus) {
            if (menu.removeProduct(id)) {
                return true;
            }
        }
        throw new IllegalArgumentException("Product with id " + id + " not found.");
    }

    // 대기 주문 조회 메서드
    public List<Order> selectWaitingOrders() {
        // 대기 주문 목록을 반환
        return new ArrayList<>(); // 실제 데이터를 구현해야 함
    }

    // 대기 주문 처리 메서드
    public boolean completeWaitingOrder(int waitingNumber) {
        // 대기 주문을 처리하고 완료 주문 목록에 추가
        // 실제 데이터 및 처리 로직을 구현해야 함
        return false;
    }

    // 주문 완료 조회 메서드
    public List<CompletedOrder> selectCompletedOrders() {
        // 주문 완료 목록을 반환
        return new ArrayList<>(); // 실제 데이터를 구현해야 함
    }

    private Menu findMenuByName(String menuName) {
        for (Menu menu : storedMenus) {
            if (menu.getName().equals(menuName)) {
                return menu;
            }
        }
        return null;
    }
}
