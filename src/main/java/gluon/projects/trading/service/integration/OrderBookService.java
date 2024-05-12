package gluon.projects.trading.service.integration;

public interface OrderBookService {
    public String getOrderBook(String symbol, String limit);
}
