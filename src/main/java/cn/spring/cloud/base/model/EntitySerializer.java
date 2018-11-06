package cn.spring.cloud.base.model;

import com.alibaba.fastjson.JSON;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class EntitySerializer implements Serializer<Entity> {
    @Override
    public void configure(Map<String, ?> map, boolean b) {

    }

    @Override
    public byte[] serialize(String s, Entity entity) {
        String str = JSON.toJSONString(entity);
        return str.getBytes();
    }

    @Override
    public void close() {

    }
}
