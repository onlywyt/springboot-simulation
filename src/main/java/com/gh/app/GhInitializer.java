package com.gh.app;

import com.gh.app.web.SpringServlet;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @HandlesTypes() 拿到的是接口下面所有的实现；定义一个自定义的 selvet 在配置文件中 配置自定义的类
 *  target/classes/META-INF/services/javax.servlet.ServletContainerInitializer
 *      com.gh.app.GhInitializer
 *      可以实现 servlet 的动态插拔，
 */

@HandlesTypes({TestI.class})
public class GhInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        //注册 servlet
        ServletRegistration.Dynamic registration = ctx
                .addServlet("xx", new SpringServlet());
        registration.addMapping("/");

        System.out.println(c);
    }
}
