package com.lxc.intro.microboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import com.lxc.intro.microboot.redis.utils.RedisObjectSerializer;
import redis.clients.jedis.JedisPoolConfig;
@Configuration
public class RedisTwoConfig {

	/**
	 * 使用jdeisFactory构建连接工厂
	 * 
	 * @return
	 */
	private RedisConnectionFactory getRedisConnectionFactory(String host, int port, int database, int timeout,
			int maxActive, int maxIdle, int minIdle, int maxWait) {
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		jedisConnectionFactory.setHostName(host);
		jedisConnectionFactory.setPort(port);
		jedisConnectionFactory.setDatabase(database);
		jedisConnectionFactory.setTimeout(timeout);
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxTotal(maxActive);
		poolConfig.setMaxIdle(maxIdle);
		poolConfig.setMinIdle(minIdle);
		poolConfig.setMaxWaitMillis(maxWait);
		jedisConnectionFactory.setPoolConfig(poolConfig);// 配置连接池
		jedisConnectionFactory.afterPropertiesSet();
		return jedisConnectionFactory;
	}

	@Bean("redisTwo")
	public RedisTemplate<String, Object> getRedisTemplate(@Value("${spring.redis-two.host}") String host,
			@Value("${spring.redis-two.port}") int port, @Value("${spring.redis-two.database}") int database,
			@Value("${spring.redis-two.timeout}") int timeout,
			@Value("${spring.redis-two.pool.max-active}") int maxActive,
			@Value("${spring.redis-two.pool.max-idle}") int maxIdle,
			@Value("${spring.redis-two.pool.min-idle}") int minIdle,
			@Value("${spring.redis-two.pool.max-wait}") int maxWait) {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
		redisTemplate.setConnectionFactory(
				this.getRedisConnectionFactory(host, port, database, timeout, maxActive, maxIdle, minIdle, maxWait));// 设置自定义连接池
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new RedisObjectSerializer());
		return redisTemplate;
	}
}
