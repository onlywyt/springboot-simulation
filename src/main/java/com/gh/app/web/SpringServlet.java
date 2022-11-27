package com.gh.app.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;

public class SpringServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //运行时 index.html是在哪儿？？？
        //在 classpath 中
        //得到 classpath的路径
        String basePath = SpringServlet.class.getResource("/").getPath();
        String fileName = request.getRequestURI();
        String path = basePath + fileName;

        File file = new File(path);

        FileUtils.writeFile(file,response.getOutputStream());

        System.out.println();

    }

}
