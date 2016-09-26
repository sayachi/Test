package com.exoplatform.project;

import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;



/*
 * Created by exo on 22/09/16.
 */
    //Logger logger = Logger.getLogger(MyService.class.getName());

   public class MyJob implements Job{


     private static final Log log = ExoLogger.getLogger(MyJob.class);



    public void execute(JobExecutionContext context) throws JobExecutionException {

        log.info("Myjob is running");

    }

    }




