package gluon.projects.trading;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UtilitiesTest {

    @Test
    void getCryptoSymbolWithFilter() {
        List<String> cryptoSymbols = Utilities.getCryptoSymbolWithFilter();
        assertNotNull(cryptoSymbols);
        assertTrue(cryptoSymbols.size() > 0);
        assertEquals("DOGEUSDT", cryptoSymbols.get(0));
    }
}