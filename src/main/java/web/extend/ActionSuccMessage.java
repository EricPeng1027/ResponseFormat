package web.extend;

import web.ReturnCodeType;
import web.base.ActionMessage;

/**
 * @ClassName ActionSuccMessage
 * @Description sub class of actionmessage which indicate success response
 * @Author ericp
 * @Date 7/1/19 4:44 PM
 * @Version 1.0
 **/

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