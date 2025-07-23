import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @author chenxuegui
 * @since 2025/3/7
 */
public class TestLog {

    /* 日志入口 */
    static Logger logger = LoggerFactory.getLogger("ROOT");
    static Logger logger1 = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {
        logger.info("eeee");
        logger1.info("xxx");

    }


}
