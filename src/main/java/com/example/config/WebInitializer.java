package com.example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null; // nếu có cấu hình root (DataSource, Security) thì thêm ở đây
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class}; // chỉ định file cấu hình MVC
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; // mọi request sẽ đi qua DispatcherServlet
    }
}
