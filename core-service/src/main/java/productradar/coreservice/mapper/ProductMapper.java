package productradar.coreservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import productradar.coreservice.product.Product;
import productradar.coreservice.product.ProductRequest;
import productradar.coreservice.product.ProductResponse;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    Product toEntity(ProductRequest productRequest);

    ProductResponse toResponse(Product product);
}
