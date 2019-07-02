package web.base;

import web.ReturnCodeType;

import java.io.IOException;

/**
 * @ClassName web.base.ActionResult
 * @Description action result, usually used between function callings between different layers
 * @Author ericp
 * @Date 6/3/19 11:14 AM
 * @Version 1.0
 **/

public class ActionResult<T> {
    // error code value
    private Integer code;
    // action result
    private Boolean result;
    // error code description message
    private String msg;
    // detail description message
    private String detail;
    // exception
    private Exception exception;
    // data
    private T data;

    // constructor with no param
    public ActionResult(){
        this.code = ReturnCodeType.OPERATION_FAILED.getCode();
        this.result = false;
    }

    // constructor with param return code type
    public ActionResult(ReturnCodeType errorCode){
        this.code = errorCode.getCode();
        setResult(errorCode == ReturnCodeType.OPERATION_SUCCEED);
    }

    public ReturnCodeType getErrorCode(){
        return ReturnCodeType.parse(this.code);
    }

    public ActionResult setErrorCode(ReturnCodeType code) throws IOException {
        this.code = code.getCode();
        this.msg = code.getDesc();
        this.result = (code == ReturnCodeType.OPERATION_SUCCEED);

        return this;
    }

    // getter and setters
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}