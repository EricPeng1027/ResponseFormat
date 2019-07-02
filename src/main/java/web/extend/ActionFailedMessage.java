package web.extend;

import web.base.ActionMessage;

/**
 * sub class of actionmessage which indicate failed response
 * @author ericp
 * @version 1.0
 * @since 7/1/19 4:52 PM
 */
public class ActionFailedMessage extends ActionMessage<Object> {
    public ActionFailedMessage(){
        this.setCode(-1);
        this.setMsg("Operation Failed");
        this.setResponseContent(null);
    }

    public ActionFailedMessage(String msg, Object responseContent){
        this.setCode(-1);
        this.setMsg(msg);
        this.setResponseContent(responseContent);
    }

    public ActionFailedMessage(String msg){
        this(msg, null);
    }
}