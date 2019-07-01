package web.extend;

import web.ReturnCodeType;
import web.base.ActionMessage;

/**
 * @ClassName ActionErrorMessage
 * @Description sub class of actionmessage which indicate error response
 * @Author ericp
 * @Date 7/1/19 4:58 PM
 * @Version 1.0
 **/

public class ActionErrorMessage extends ActionMessage<Object> {
    public ActionErrorMessage(String msg){
        this(msg, null);
    }

    public ActionErrorMessage(String msg, Object responseContent){
        this.setMsg(msg);
        this.setResponseContent(responseContent);
    }

    public ActionErrorMessage(ReturnCodeType returnCode){
        super(returnCode);
    }
}