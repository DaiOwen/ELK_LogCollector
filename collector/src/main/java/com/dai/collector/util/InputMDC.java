package com.dai.collector.util;

import org.jboss.logging.MDC;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @description: MDC（Mapped Diagnostic Context，映射调试上下文）是 log4j 和 logback 提供的一种方便在多线程条件下记录日志的功能，也可以说是一种轻量级的日志跟踪工具。
 * @author Administrator
 * @date 2021-05-15
 */
@Component
public class InputMDC implements EnvironmentAware {

	private static Environment environment;
	
	@Override
	public void setEnvironment(Environment environment) {
		InputMDC.environment = environment;
	}
	
	public static void putMDC() {
		MDC.put("hostName", NetUtil.getLocalHostName());
		MDC.put("ip", NetUtil.getLocalIp());
		MDC.put("applicationName", environment.getProperty("spring.application.name"));
	}

}
