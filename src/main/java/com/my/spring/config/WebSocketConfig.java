package com.my.spring.config;

import java.util.logging.SocketHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.my.spring.chart.handler.ChartHandler;
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer{

	
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(new ChartHandler(), "/chart").setAllowedOriginPatterns("*").withSockJS();
	}
	
	
}
