package com.lxc.intro.microboot.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import com.lxc.intro.microboot.redis.utils.RedisObjectSerializer;
@Configuration
public class RedisConfig {
	@Bean(name="redisOne")
	public RedisTemplate<String, Object> getRedisTemplate(RedisConnectionFactory connectionFactory) {
		RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
		redisTemplate.setConnectionFactory(connectionFactory);
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		redisTemplate.setValueSerializer(new RedisObjectSerializer());
		return redisTemplate;
	}
}
