package web.base;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import web.ReturnCodeType;

/**
 * @ClassName web.base.ActionMessage
 * @Description TODO
 * @Author ericp
 * @Date 6/28/19 5:49 PM
 * @Version 1.0
 **/

public class ActionMessage<T> extends CommonMessage{
    // logger
    private static Logger logger = LoggerFactory.getLogger(ActionMessage.class);

    // return object, including data
    private T responseContent;
    // extra message
    private String msg;

    // constructors
    public ActionMessage() {}

    public ActionMessage(String msg) {
        this.msg = msg;
    }

    public ActionMessage(T responseContent) {
        this.responseContent = responseContent;
    }

    public ActionMessage(T responseContent, String msg) {
        this.responseContent = responseContent;
        this.msg = msg;
    }

    public ActionMessage(ReturnCodeType returnCodeType) {
        super.setCode(returnCodeType.getCode());
        super.setDesc(returnCodeType.getDesc());
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }

    // getter and setters
    public T getResponseContent() {
        return responseContent;
    }

    public ActionMessage setResponseContent(T responseContent) {
        this.responseContent = responseContent;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ActionMessage setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public ActionMessage<T> setReturnCode(ReturnCodeType returnCode) {
        setCode(returnCode.getCode());
        setDesc(returnCode.getDesc());
        return this;
    }

    public ActionMessage setDesc(String desc){
        return (ActionMessage) super.setDesc(desc);
    }
}