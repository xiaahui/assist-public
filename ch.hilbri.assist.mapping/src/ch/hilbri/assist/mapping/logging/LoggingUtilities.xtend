package ch.hilbri.assist.mapping.logging

import ch.qos.logback.classic.Level
import ch.qos.logback.classic.Logger
import org.slf4j.LoggerFactory

class LoggingUtilities {
	def static setLogLevel(String loggerName, boolean verboseDebugging) {
		val logger = LoggerFactory.getLogger(loggerName) as Logger
		if (verboseDebugging) 	logger.level = Level.DEBUG
		else					logger.level = Level.INFO
	}
}
