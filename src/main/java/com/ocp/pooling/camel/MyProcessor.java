package com.ocp.pooling.camel;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class MyProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		exchange.getIn().setBody("HeartBeat " + new Date());
	}
}
