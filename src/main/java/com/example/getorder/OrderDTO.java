package com.example.getorder;

import com.example.getorder.utils.TradePlace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String ORDERID;
    private String EXECTYPE;
    private String PRICETYPE;
    private String AFACCTNO;
    private String SYMBOL;
    private String ORDERQTTY;
    private String QUOTEPRICE;
    private String STATUS;
    private String REMAINQTTY;
    private TradePlace TRADEPLACE;
    private String ISCANCEL;
    private String ISADMEND;
    private String ISDISPOSAL;
    private String ODTIMESTAMP;
    private String ORSTATUSVALUE;
    private String QUOTEQTTY;
    private String LIMITPRICE;
    private String EXECQTTY;
    private String EXECPRICE;
    private String VIA;
    private String FEEDBACK;

}
