package com.example.concurrencycontrolproject.config;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;

@TestConfiguration
public class TestConfig {

	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		return new RedisTemplate<>();
	}

	@Bean
	public DefaultRedisScript<Long> redisScript() {
		return new DefaultRedisScript<>();
	}
}
