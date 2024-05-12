package gluon.projects.trading.service.integration;

public interface TradesService {
    public String getLastTrades(String symbol, String limit) throws InterruptedException;
}
