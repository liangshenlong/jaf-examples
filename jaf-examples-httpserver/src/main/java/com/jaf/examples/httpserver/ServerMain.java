package com.jaf.examples.httpserver;

import com.jaf.examples.httpserver.server.SimpleHttpServer;
import com.jaf.examples.httpserver.simple.ThreadPoolHttpServer;

import java.io.IOException;

/**
 * TODO
 * 
 * @author liaozhicheng.cn@163.com
 * @date 2016年10月23日
 * @since 1.0
 */
public class ServerMain {
	
	public static void main(String[] args) throws IOException {
		HttpServer server = new ThreadPoolHttpServer();
		server.start();
	}
	
}
