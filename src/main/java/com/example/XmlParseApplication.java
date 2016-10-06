package com.example;

import com.github.goober.coordinatetransformation.positions.RT90Position;
import com.github.goober.coordinatetransformation.positions.WGS84Position;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XmlParseApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlParseApplication.class, args);

		RT90Position rt90Position = new RT90Position(6582011, 1630064);
//		String output = rt90Position.toString();
		WGS84Position wgs84Position = rt90Position.toWGS84();
		String output = wgs84Position.toString();
		System.out.println(output);
	}
}
