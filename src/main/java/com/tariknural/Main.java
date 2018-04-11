package com.tariknural;

import com.caucho.hessian.client.HessianProxyFactory;
import com.tariknural.service.HelloService;

public class Main {
	 
	// url com.tariknural.servlet.HelloServlet class'ına map edilmiş durumda.
    String url = "http://localhost:8081/HessExample/HelloServlet";
    HessianProxyFactory factory = new HessianProxyFactory();
 
    public Main() {
    }
 
    private void doTest() {
        try {
        	
        	
        	// Servlet'e map edilmiş class'ın metodunu burdaki interface'e atıyoruz.
        	// interface üzerinden map edilen class'ın metodlarına erişiyoruz.
            HelloService hello = (HelloService) factory.create(HelloService.class, url);
            System.out.println(hello.sayHelloTo("Tarik"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        Main main = new Main();
        main.doTest();
    }
}