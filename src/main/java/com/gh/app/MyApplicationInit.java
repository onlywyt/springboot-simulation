package com.gh.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;


public class MyApplicationInit implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
//        AnnotationConfigWebApplicationContext context =
//                new AnnotationConfigWebApplicationContext();
//        context.register(Appconfig.class);
//        context.refresh();
//        //添加 spring servlet  web.xml
//        //@WebServlet("")
//        //自己弄一个 new
//        //new servlet
//        DispatcherServlet servlet = new DispatcherServlet(context);
//        //怎么把自己 new 的 servlet 给容器 ——> ServletRegistration -> 注册器
//        ServletRegistration.Dynamic registration = servletContext.addServlet("xx", servlet);
//        //这是地址
//        registration.addMapping("*.jsp");
//        //设定执行顺序，启动就要执行
//        registration.setLoadOnStartup(1);




        System.out.println("--------初始化------------");
    }
}
