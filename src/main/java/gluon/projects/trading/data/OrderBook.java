package gluon.projects.trading.data;

import lombok.Getter;
import lombok.Setter;
import org.json.simple.JSONArray;

@Getter
@Setter
public class OrderBook {
    private String symbol;

    private String limit;

    private JSONArray bids;

    private JSONArray asks;

    public OrderBook(String symbol, String limit) {
        this.symbol = symbol;
        this.limit = limit;
    }
}
