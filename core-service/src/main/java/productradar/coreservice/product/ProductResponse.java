package productradar.coreservice.product;

import java.time.Instant;

public record ProductResponse(
        Long id,
        String name,
        String category,
        Instant createdAt
) {
}
