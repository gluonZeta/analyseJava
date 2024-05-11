package gluon.projects.subtilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) {
        logger.info("Hehehe");
        int x = 5;
        logger.info("x: " + x++ + " ### x: " + x);
    }
}
