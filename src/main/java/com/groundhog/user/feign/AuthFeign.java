package com.groundhog.user.feign;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: guotianyu
 * @description:
 * @create: 2021/09/16 10:11
 */
public interface AuthFeign {

    /**
     * 校验token
     *
     * @param token
     * @return
     */
    @PostMapping("/oauth/check_token")
    Object checkToken(@RequestParam String token);
}
