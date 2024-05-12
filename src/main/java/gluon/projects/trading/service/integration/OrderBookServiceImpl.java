package gluon.projects.trading.service.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OrderBookServiceImpl implements OrderBookService{

    private static Logger logger = LoggerFactory.getLogger(OrderBookServiceImpl.class);

    @Override
    public String getOrderBook(String symbol, String limit) throws InterruptedException {
        StringBuilder orderBookUrl = new StringBuilder("https://api.binance.com/api/v3/depth");
        orderBookUrl.append("?symbol=" + symbol);
        orderBookUrl.append("&limit=" + limit);

        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(URI.create(orderBookUrl.toString()))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> httpResponse = null;

        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            logger.error("XXXXXXX",e);

        } catch (InterruptedException e) {
            logger.error("XXXXXXX", e);
            Thread.currentThread().interrupt();
        }

        return httpResponse.body();
    }
}
