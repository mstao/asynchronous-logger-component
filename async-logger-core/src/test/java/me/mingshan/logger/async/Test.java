package me.mingshan.logger.async;

import me.mingshan.logger.async.api.Message;
import me.mingshan.logger.async.common.AsyncLoggerPlugins;

/**
 * @author mingshan
 */
public class Test {

    @org.junit.Test
    public void basicTest() {
        AsyncLoggerContext.start();
        AsyncLogger<Message> asyncLogger = AsyncLoggerContext.getAsyncLogger();
        for (int i = 0; i < 122; i++) {
            Message message = new Message();
            message.setServiceName("aa " + i);
            asyncLogger.logMessage(message);
        }

    }
}