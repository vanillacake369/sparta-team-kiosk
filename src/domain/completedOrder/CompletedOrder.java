package domain.completedOrder;

import domain.order.entity.Order;

import java.time.Instant;

public class CompletedOrder extends Order {
    private Instant completedOrderDateTime;

    public Instant getCompletedOrderDateTime() {
        return completedOrderDateTime;
    }
}
