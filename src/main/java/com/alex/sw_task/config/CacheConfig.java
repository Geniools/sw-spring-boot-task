package com.alex.sw_task.config;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.RedisConnectionFactory;

@Configuration
public class CacheConfig {
	@Bean
	@Profile("dev")
	public CacheManager simpleCacheManager() {
		// This is a simple cache manager for development purposes.
		return new org.springframework.cache.concurrent.ConcurrentMapCacheManager();
	}

	@Bean
	@Profile("prod")
	public CacheManager redisCacheManager(RedisConnectionFactory redisConnectionFactory) {
		// This is a placeholder for a Redis cache manager.
		// You would typically configure this with Redis connection details.
		return org.springframework.data.redis.cache.RedisCacheManager.create(redisConnectionFactory);
	}
}
