package com.atmecs.toolsqademosite.reports;

import java.util.logging.Logger;

import com.atmecs.toolsqademosite.constants.Constants;
import com.atmecs.toolsqademosite.utils.ConfigReader;


public class LogReportInformation {
Logger logger = null;

public LogReportInformation() {
getlogger();
logger = Logger.getLogger(LogReportInformation.class.getName());
}

public void getlogger() {
ConfigReader.configure(Constants.LOGFILEPATH_FILE);
}

public void info(String message) {
logger.info(message);
}
}
