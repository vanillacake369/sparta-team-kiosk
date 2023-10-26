package domain.completedOrder;

import domain.cart.entity.Cart;
import domain.order.entity.Order;

import java.time.Instant;

public class CompletedOrder extends Order {
    private Instant completedOrderDateTime;
    public Instant getCompletedOrderDateTime() {
        return completedOrderDateTime;
    }

    public CompletedOrder(double totalPrice, Cart cart, String requestMessage,
                          Instant orderDateTime, int waitingNumber) {
        super(totalPrice, cart, requestMessage, orderDateTime, waitingNumber);
    }

}
