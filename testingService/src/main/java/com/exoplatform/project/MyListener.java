package com.exoplatform.project;

import org.exoplatform.services.log.Log;
import org.exoplatform.services.organization.User;
import org.exoplatform.services.organization.UserEventListener;

import java.util.logging.Logger;

/**
 * Created by exo on 22/09/16.
 */
public class MyListener extends UserEventListener {

   // Logger logger = Logger.getLogger(MyService.class.getName());
   public void preSave(User user, boolean isNew) throws Exception {

       System.out.println("Before " + (isNew?"creating":"updating") + " user " + user.getUserName());

   }

   public void postSave(User user, boolean isNew) throws Exception {

       Logger logger = Logger.getLogger(MyService.class.getName());

       //logger.info("After user " + user.getUserName() + (isNew?" created":" updated"));
       logger.info("Before user is added into database");
       logger.info("After user is added into database");
       logger.info("After user " + user.getUserName() + (isNew?" created":" updated"));

   }

    public void preDelete(User user) throws Exception {
        Logger logger = Logger.getLogger(MyService.class.getName());
        logger.info("Before deleting user " + user.getUserName());

    }


    public void postDelete(User user) throws Exception {

        Logger logger = Logger.getLogger(MyService.class.getName());
        logger.info("After deleting user " + user.getUserName());

    }



    public void preSetEnabled(User user) throws Exception {
        Logger logger = Logger.getLogger(MyService.class.getName());
        logger.info("Before enabling/disabling user " + user.getUserName());

    }


    public void postSetEnabled(User user) throws Exception {

        Logger logger = Logger.getLogger(MyService.class.getName());
        logger.info("After enabling/disabling user " + user.getUserName());

    }


}
