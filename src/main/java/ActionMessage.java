import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @ClassName ActionMessage
 * @Description TODO
 * @Author ericp
 * @Date 6/28/19 5:49 PM
 * @Version 1.0
 **/

public class ActionMessage<T> extends CommonMessage{
    // logger
    private static Logger logger = LoggerFactory.getLogger(ActionMessage.class);

    public ActionMessage() throws IOException {
    }
}