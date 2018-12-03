package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule()
	{
//		return new RandomRule();// Ribbon默认是轮询，我自定义为随机
		return new RandomRule_LF();// 自定义为每台机器服务调用5次
	}
	
}
