package com.gh.app;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import javax.servlet.ServletException;
import java.io.File;

public class SpringApplicationWangyingta {

    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = { "classpath:/META-INF/resources/",
            "classpath:/resources/", "classpath:/static/", "classpath:/public/" };

    public static void run() {
        //启动 tomcat  new
        /**
         * 需要指定自己的 class 文件
         */
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9080);

        String path = SpringApplicationWangyingta.class.getResource("/").getPath();

        try {
            //告诉 tomcat自己的源码在哪儿
            Context context = tomcat.addWebapp("/",
                    //这里指定的目录是父项目的
                    new File("src/main/webapp").getAbsolutePath());
            WebResourceRoot resourceRoot = new StandardRoot(context);
            resourceRoot.addPreResources(new DirResourceSet(resourceRoot,
                    "/WEB-INF/classes",
                    path,
                    "/"));
            tomcat.start();
            tomcat.getServer().await();//相当于阻塞， 等待连接???
        } catch (LifecycleException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }
}
