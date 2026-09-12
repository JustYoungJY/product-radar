package productradar.coreservice.product;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ProductRequest(
        @NotBlank
        @Size(max = 150)
        String name,
        String category
) {
}
