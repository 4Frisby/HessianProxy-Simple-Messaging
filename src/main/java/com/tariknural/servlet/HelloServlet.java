package com.tariknural.servlet;

import com.caucho.hessian.server.HessianServlet;
import com.tariknural.service.HelloService;

public class HelloServlet extends HessianServlet implements HelloService {
	 
    public String sayHelloTo(String target) {
        return "hello "+target+", have a nice day";
    }
     
}