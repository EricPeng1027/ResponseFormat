package web.base;

import web.ReturnCodeType;

/**
 * General action result between service method calls
 * @author ericp
 * @version 1.0
 * @since 6/3/19 10:19 AM
 */
public class    CommonMessage {
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
