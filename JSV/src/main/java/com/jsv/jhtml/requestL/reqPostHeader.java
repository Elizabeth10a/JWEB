package com.jsv.jhtml.requestL;
/*-*- coding:utf-8 -*-
 * @Author  : lubu
 * @Time    : 10/20/21
 * @Software: IntelliJ IDEA
 */

import com.jsv.jhtml.ReqMethod.ReqBody;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

//获取请求体信息
@WebServlet(name = "postHeader", value = "/postHeader")
public class reqPostHeader extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-doPost--");
        ReqBody reqBody = new ReqBody();
        //只能用一个
        reqBody.postReaderRequestBody(req, resp);
//        reqBody.postInputStreamRequestBody(req, resp);


    }


}
