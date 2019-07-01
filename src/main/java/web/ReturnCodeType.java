package web;

import config.PropertiesLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.Strings;

import java.util.Properties;

public enum ReturnCodeType {
    UNKNOWN(-999, "未知", "Unknown"),
    OPERATION_SUCCEED(0, "操作成功", "Operation Succeed"),
    OPERATION_FAILED(-1, "操作失败", "Operation Failed"),

    // Http status code
    SERVER_ERROR(-5, "服务器错误", "Server error"),
    SUCCESS(200, "请求成功", "Success"),
    BAD_REQUEST(400, "错误的请求", "Bad request"),
    NOT_FOUND(404, "服务未找到", "Not found"),
    INTERNAL_SERVER_ERROR(500, "内部服务器错误", "Internal server error"),
    TIMED_OUT(504, "网关超时", "Timed out");

    private static Logger logger = LoggerFactory.getLogger(ReturnCodeType.class);

    // return code
    private Integer code;
    // CN operation result description
    private String des_CN;
    // EN operation result description
    private String des_US;

    // default constructor
    ReturnCodeType(){}

    // constructor with full params
    ReturnCodeType(int code, String des_CN, String dec_US) {
        this.code = code;
        this.des_CN = des_CN;
        this.des_US = dec_US;
    }

    // return corresponding return code according to value given
    public static ReturnCodeType parse(Object value){
        ReturnCodeType unknownReturnCodeType = ReturnCodeType.UNKNOWN;

        try {
            if (value != null){
                ReturnCodeType[] collections = ReturnCodeType.values();
                for (ReturnCodeType e: collections){
                    if (Strings.isDigit(value.toString())){
                        if (e.getCode() == Integer.parseInt(value.toString())){
                            return e;
                        }
                    }else {
                        if (e.getDes_CN().equals(value.toString())){
                            return e;
                        }else if (e.getDes_US().equals(value.toString())){
                            return e;
                        }
                    }
                }
            }
        }catch (IllegalArgumentException e){
            logger.warn(e.toString());
        }

        return unknownReturnCodeType;
    }

    // get the description using language configured in the .properties file
    public String getDesc() {
        try {
            PropertiesLoader propertiesLoader = new PropertiesLoader("src/main/resources/config.properties");
            return propertiesLoader.getProperties().getProperty("config.lang.use").equals("CN")? getDes_CN(): getDes_US();
        }catch (Exception e){
            logger.warn(e.getMessage());
        }
        return "failed getting description";
    }

    // getter and setters
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDes_CN() {
        return des_CN;
    }

    public void setDes_CN(String des_CN) {
        this.des_CN = des_CN;
    }

    public String getDes_US() {
        return des_US;
    }

    public void setDes_US(String des_US) {
        this.des_US = des_US;
    }
}
