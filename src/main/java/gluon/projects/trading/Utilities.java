package gluon.projects.trading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Utilities {

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
        List<String> cryptoInfos = new ArrayList<>();
        List<String> symbolExclus = excludeSymbol();

        String CRYPTO_SYMBOL_FILE_PATH = "src/main/resources/cryptoAAnalyser.csv";
        String csvFileLine;
        String symbol;

        try (BufferedReader br = new BufferedReader(new FileReader(CRYPTO_SYMBOL_FILE_PATH))) {
            while ((csvFileLine = br.readLine()) != null) {
                symbol = csvFileLine.split(";")[4];
                if(!symbolExclus.contains(symbol)) {
                    cryptoInfos.add(symbol);
                }
            }
            cryptoInfos.remove(0); // Delete the header
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cryptoInfos;
    }

}