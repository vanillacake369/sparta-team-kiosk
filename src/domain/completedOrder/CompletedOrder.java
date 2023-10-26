package domain.completedOrder;

import domain.order.Order;

import java.time.Instant;

public class CompletedOrder extends Order {
    private Instant completedOrderDateTime;

    public Instant getCompletedOrderDateTime() {
        return completedOrderDateTime;
    }
}
