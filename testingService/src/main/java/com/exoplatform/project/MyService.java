package com.exoplatform.project;

import org.picocontainer.Startable;
import java.util.logging.Logger;


public class MyService implements Startable {


    Logger logger = Logger.getLogger(MyService.class.getName());

    public void start() { logger.info("start service");}

    public void stop() {logger.info("Stop service");
    }




}
