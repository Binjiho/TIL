package com.Binjiho.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogTestBasic {

      public static void main(String[] args) {
         Logger logger = LoggerFactory.getLogger(LogTestBasic.class);
         
         
         //Error - Warn - Info - Debug - Trace
         logger.error("Oh, No!!!");
         logger.warn("Watch out!!!");
         logger.info("Hello, slf4j log");
         logger.debug("What's wrong with this?");
         logger.trace("Here we are...");
      }
}