package web.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import web.ReturnCodeType;

/**
 * @ClassName web.base.CommonMessage
 * @Description General action result between service method calls
 * @Author ericp
 * @Date 6/3/19 10:19 AM
 * @Version 1.0
 **/

public class CommonMessage {
    // logger
    private static Logger logger = LoggerFactory.getLogger(CommonMessage.class);

    // return code
    private Integer code;
    // action result description
    private String desc;

    // default constructor
    public CommonMessage() {
        // default error
        this.code = ReturnCodeType.SERVER_ERROR.getCode();
        this.desc = ReturnCodeType.SERVER_ERROR.getDesc();
    }

    // getter and setters
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public CommonMessage setDesc(String desc) {
        this.desc = desc;
        return this;
    }
}
