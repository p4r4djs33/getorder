package com.example.getorder.documents;

import com.example.getorder.utils.TradePlace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    private String id;
    private String OrderID;
    private String Side; //54 EXECTYPE
    private String OrderType; //40 PRICETYPE
    private String TimeInForce; //59 PRICETYPE
    private String Account; // AFACCTNO
    private String Symbol; // SYMBOL
    private String OrderQty; // ORDERQTTY
    private String Price; //QUOTEPRICE
    private String OrdStatus; //STATUS, ORDERSTATUSVALUE
    private String LeavesQty; // REMAINQTTY, EXECQTTY
    private TradePlace TradePlace; // TRADEPLACE
    private String ISCANCEL = "Y";
    private String ISADMEND = "Y";
    private String ISDISPOSAL = "N";
    private String TransactTime; //ODTIMESTAMP
    private String CumQty; // QUOTEQTTY
    private String LastPx; // LIMITPRICE
    private String ExecPrice = "0";
    private String VIA = "BSC_Trade";
    private String FEEDBACK = null;



}
