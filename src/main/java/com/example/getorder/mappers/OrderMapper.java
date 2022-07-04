package com.example.getorder.mappers;


import com.example.getorder.OrderDTO;
import com.example.getorder.documents.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", uses = {})
public interface OrderMapper {

    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    @Mapping(target="ORDERID", source="orderID")
    @Mapping(target="AFACCTNO", source="account")
    @Mapping(target="SYMBOL", source="symbol")
    @Mapping(target="ORDERQTTY", source="orderQty")
    @Mapping(target="QUOTEPRICE", source="price")
    @Mapping(target="STATUS", source="ordStatus")
    @Mapping(target="REMAINQTTY", source="leavesQty")
    @Mapping(target="TRADEPLACE", source="tradePlace")
    @Mapping(target="ISCANCEL", source="ISDISPOSAL")
    @Mapping(target="ISADMEND", source="ISDISPOSAL")
    @Mapping(target="ISDISPOSAL", source="ISDISPOSAL")
    @Mapping(target="ODTIMESTAMP", source="transactTime")
    @Mapping(target="QUOTEQTTY", source="cumQty")
    @Mapping(target="ORSTATUSVALUE", source="ordStatus")
    @Mapping(target="LIMITPRICE", source="lastPx")
    @Mapping(target="EXECPRICE", source="execPrice")
    @Mapping(target="VIA", source="VIA")
    @Mapping(target="FEEDBACK", source="FEEDBACK")
    OrderDTO entityToDTO(Order order);
    Order dtoToEntity(OrderDTO orderDTO);
}
