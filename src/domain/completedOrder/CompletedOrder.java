package domain.completedOrder;

import domain.cart.Cart;
import domain.order.Order;
import java.time.Instant;

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