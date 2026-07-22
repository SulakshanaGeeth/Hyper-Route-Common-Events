package com.hyperroute.events;

import java.time.Instant;

public record OrderCreatedEvent(
        Long orderId,
        String customerId,
        double latitude,
        double longitude,
        Instant createdAt
) {
}