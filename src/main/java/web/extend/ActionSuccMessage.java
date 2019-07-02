package web.extend;

import web.ReturnCodeType;
import web.base.ActionMessage;

/**
 * sub class of actionmessage which indicate success response
 * @author ericp
 * @version 1.0
 * @since 7/1/19 4:44 PM
 */
public class ActionSuccMessage extends ActionMessage<Object> {
    public ActionSuccMessage(){
        this(ReturnCodeType.OPERATION_SUCCEED.getDesc());
    }

    public ActionSuccMessage(String msg){
        setReturnCode(ReturnCodeType.OPERATION_SUCCEED);
        setMsg(msg);
    }

    public ActionSuccMessage(Object responseContent){
        setReturnCode(ReturnCodeType.OPERATION_SUCCEED);
        setResponseContent(responseContent);
    }
}