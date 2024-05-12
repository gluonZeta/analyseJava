package gluon.projects.trading.service.integration;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OrderBookServiceImpl implements OrderBookService{
    @Override
    public String getOrderBook(String symbol, String limit) {
        StringBuilder orderBookUrl = new StringBuilder("https://api.binance.com/api/v3/depth");
        orderBookUrl.append("?symbol=" + symbol);
        orderBookUrl.append("&limit=" + limit);

        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(URI.create(orderBookUrl.toString()))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> httpResponse;

        try {
            httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return httpResponse.body();
    }
}
