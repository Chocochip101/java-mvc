package com.interface21.webmvc.servlet;

import java.io.FileNotFoundException;

public interface HandlerMapping {

    void initialize(String basePackage) throws ReflectiveOperationException, FileNotFoundException;

    RequestHandler getHandler(final String requestMethod, final String requestURI);
}
