package gluon.projects.trading.service.integration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TradesServiceImplTest {

    private TradesService tradesService;

    @BeforeEach
    void setUp() {
        this.tradesService = new TradesServiceImpl();
    }

    @Test
    void getLastTrades() {
        String lastTrades = this.tradesService.getLastTrades("WIFUSDT", "50");
        assertTrue(!lastTrades.isEmpty());
        assertTrue(!lastTrades.isBlank());
    }
}