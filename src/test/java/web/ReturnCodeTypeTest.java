package web;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnCodeTypeTest {

    @Test
    public void parse() {
        ReturnCodeType returnCodeOfCode = ReturnCodeType.parse(404);
        assertEquals(ReturnCodeType.NOT_FOUND, returnCodeOfCode);
        ReturnCodeType returnCodeOfCNDes = ReturnCodeType.parse("服务未找到");
        assertEquals(ReturnCodeType.NOT_FOUND, returnCodeOfCNDes);
        ReturnCodeType returnCodeOfENDes = ReturnCodeType.parse("Not found");
        assertEquals(ReturnCodeType.NOT_FOUND, returnCodeOfENDes);
    }

    @Test
    public void getDesc() {
        assertEquals(ReturnCodeType.NOT_FOUND.getDesc(), ReturnCodeType.NOT_FOUND.getDes_CN());
    }
}