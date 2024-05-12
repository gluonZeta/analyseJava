package gluon.projects.trading.service.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TradesServiceImpl implements TradesService {

    private static Logger logger = LoggerFactory.getLogger(TradesServiceImpl.class);

    @Override
    public String getLastTrades(String symbol, String limit) {
        StringBuilder recentTradesUrl = new StringBuilder("https://api.binance.com/api/v3/trades");
        recentTradesUrl.append("?symbol=" + symbol);
        recentTradesUrl.append("&limit=" + limit);

        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(URI.create(recentTradesUrl.toString()))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> httpResponse = null;

        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            logger.error("XXXXXXX",e);
        } catch (InterruptedException e) {
            logger.warn("XXXXXXX", e);
            Thread.currentThread().interrupted();
        }

        return httpResponse.body();
    }
}
