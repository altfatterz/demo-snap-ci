package demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.types.RedisClientInfo;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class MyBean {

    private StringRedisTemplate template;

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBean.class);

    @Autowired
    public MyBean(StringRedisTemplate template) {
        this.template = template;
    }

    @PostConstruct
    public void init() {
        List<RedisClientInfo> clientList = template.getClientList();
        for (RedisClientInfo redisClientInfo : clientList) {
            LOGGER.info("redis client info:" + redisClientInfo.get("addr"));
        }

    }
}