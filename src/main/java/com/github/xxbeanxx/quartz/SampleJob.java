package com.github.xxbeanxx.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @author Greg Baker
 */
public class SampleJob extends QuartzJobBean {

	private static final Logger LOGGER = LoggerFactory.getLogger(SampleJob.class);
	
	@Override
	protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		LOGGER.info("executeInternal executed");
	}

	public void execute() {
		LOGGER.info("execute executed");
	}
	
}
