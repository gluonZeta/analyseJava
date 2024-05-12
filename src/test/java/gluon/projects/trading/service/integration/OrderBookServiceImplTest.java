package gluon.projects.trading.service.integration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderBookServiceImplTest {

    private OrderBookService orderBookService;

    @BeforeEach
    void setUp() {
        this.orderBookService = new OrderBookServiceImpl();
    }

    @Test
    void getOrderBook() {
        String orderBookInfo = this.orderBookService.getOrderBook("WIFUSDT", "50");
        assertTrue(!orderBookInfo.isEmpty());
        assertTrue(!orderBookInfo.isBlank());
    }
}