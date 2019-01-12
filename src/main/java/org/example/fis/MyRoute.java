package org.example.fis;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
    public void configure() throws Exception {
        from("timer://foo?period=5000")
            .setBody().constant("Hello World")
            .log(">>> ${body}");
    }
	
}
