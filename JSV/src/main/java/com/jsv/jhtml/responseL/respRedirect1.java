package com.jsv.jhtml.responseL;

import com.jsv.jhtml.RepsMethod.RespRedirectPage;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*-*- coding:utf-8 -*-
 * @Author  : lubu
 * @Time    : 10/20/21
 * @Software: IntelliJ IDEA
 */
@WebServlet("/respRedirect1")
public class respRedirect1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("-----respRedirect1----");
        RespRedirectPage respRedirectPage = new RespRedirectPage();
        respRedirectPage.RedirectTo(req, resp, "/respRedirect2");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-----respRedirect11----");

        //动态获取虚拟目录
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //简单的重定向方法
        resp.sendRedirect(contextPath + "/respRedirect2");
//        resp.sendRedirect("http://www.itcast.cn");//可以直接外部链接

        this.doPost(req, resp);//跳转
    }
}
