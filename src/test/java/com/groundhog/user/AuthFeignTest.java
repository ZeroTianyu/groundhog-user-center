package com.groundhog.user;

import com.alibaba.fastjson.JSON;
import com.groundhog.user.feign.AuthFeign;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/09/16 10:26
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthFeignTest {

    @Resource
    private AuthFeign authFeign;


    @Test
    void checkToken() {
        Object token = authFeign.checkToken("f57ce129-2d4d-4bd7-1111-f31ccc69d4d1");
        System.out.println(JSON.toJSONString(token));
    }
}
