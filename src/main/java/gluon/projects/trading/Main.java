package gluon.projects.trading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        List<String> cryptoSymbols = Utilities.getCryptoSymbolWithFilter();
        for(int i = 0; i < cryptoSymbols.size(); i++) {
            if(logger.isInfoEnabled()) logger.info(cryptoSymbols.get(i));
        }
    }

}
