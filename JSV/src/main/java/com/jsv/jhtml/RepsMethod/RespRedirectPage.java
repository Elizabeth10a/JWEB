package com.jsv.jhtml.RepsMethod;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RespRedirectPage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
/*
*
* 重定向的特点
    1．地址栏发生变化
    2．重定向可以访问其他站点(服务器)的资源
    3．重定向是两次请求l
转发的特点︰
    1．转发地址栏路径不变
    2．转发只能访问当前服务器下的资源
    3．转发是一次请求

* */
    public void RedirectTo(HttpServletRequest req, HttpServletResponse resp, String target) {
        resp.setStatus(302);//状态码表示重定向
        resp.setHeader("location", target);// 响应头
    }
}