package com.ocp.pooling.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleRouteBuilder extends SpringRouteBuilder {
	public void configure() {
		 from("timer:foo?period=1s")
		.transform()
		.simple("Heartbeat ${date:now:yyyy-MM-dd HH:mm:ss}")
		.to("stream:out");
	}
}
