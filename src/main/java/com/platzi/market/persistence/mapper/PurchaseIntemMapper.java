package com.platzi.market.persistence.mapper;

import ch.qos.logback.core.joran.node.ComponentNode;
import com.platzi.market.domain.PurchaseItem;
import com.platzi.market.persistence.entity.CompraProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring", uses = {ProductMapper.class})
public interface PurchaseIntemMapper {

    @Mappings({
            @Mapping(source = "id.idProducto", target = "productId"),
            @Mapping(source = "cantidad", target = "quantity"),
            @Mapping(source = "estado", target = "active"),
    })
    PurchaseItem toPurchaseIntem(CompraProducto producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "id.idCompra", ignore = true),
    })
    CompraProducto toComprasProducto(PurchaseItem item);
}
