package gluon.projects.trading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utilities {

    private static Logger logger = LoggerFactory.getLogger(Utilities.class);

    private Utilities() {}

    private static List<String> excludeSymbol() {
        List<String> symbolExclus = new ArrayList<>();
        symbolExclus.add("BTCUSDT");
        symbolExclus.add("ETHUSDT");
        symbolExclus.add("BNBUSDT");
        symbolExclus.add("USDCUSDT");
        symbolExclus.add("SOLUSDT");
        symbolExclus.add("TUSDUSDT");
        symbolExclus.add("FDUSDUSDT");
        symbolExclus.add("XRPUSDT");
        return symbolExclus;
    }

    public static List<String> getCryptoSymbolWithFilter() {
        List<String> cryptoSymbols = new ArrayList<>();
        List<String> symbolExcludes = excludeSymbol();

        final String CRYPTO_SYMBOL_FILE_PATH = "src/main/resources/cryptoAAnalyser.csv";
        String csvFileLine;
        String swapSymbol;

        try (BufferedReader br = new BufferedReader(new FileReader(CRYPTO_SYMBOL_FILE_PATH))) {
            while ((csvFileLine = br.readLine()) != null) {
                swapSymbol = csvFileLine.split(";")[4];
                if(!symbolExcludes.contains(swapSymbol)) {
                    cryptoSymbols.add(swapSymbol);
                }
            }
            cryptoSymbols.remove(0); // Delete the header
        } catch (IOException e) {
            logger.error("XXXXXXX",e);
        }
        return cryptoSymbols;
    }

}
