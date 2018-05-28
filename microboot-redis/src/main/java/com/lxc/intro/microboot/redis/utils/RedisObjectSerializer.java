package com.lxc.intro.microboot.redis.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * redis 实现对象序列化的操作类
 * @author L
 */
public class RedisObjectSerializer implements RedisSerializer<Object> {
	// 定义两个序列化对象
	private Converter<Object, byte[]> serializingConverter = new SerializingConverter();// 序列化对象
	private Converter<byte[], Object> deSerializingConverter = new DeserializingConverter();// 反序列化对象
	/**
	 * 反序列化
	 */
	@Override
	public Object deserialize(byte[] data) throws SerializationException {
		if (data == null || data.length == 0) {// 无数据不做操作
			return null;
		}
		return deSerializingConverter.convert(data);
	}
	/**
	 * 序列化
	 */
	@Override
	public byte[] serialize(Object object) throws SerializationException {
		if (object == null) {
			return new byte[0];
		}
		return serializingConverter.convert(object);
	}
}
