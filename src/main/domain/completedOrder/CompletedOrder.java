package main.domain.completedOrder;

import java.time.Instant;
import main.domain.cart.Cart;
import main.domain.order.Order;

public class CompletedOrder extends Order {
    private Instant completedOrderDateTime;

    public CompletedOrder(double totalPrice,
                          Cart cart,
                          String requestMessage,
                          Instant orderDateTime,
                          int waitingNumber,
                          Instant completedOrderDateTime) {
        super(totalPrice, cart, requestMessage, orderDateTime, waitingNumber);
        this.completedOrderDateTime = orderDateTime;
    }

    public Instant getCompletedOrderDateTime() {
        return completedOrderDateTime;
    }
}