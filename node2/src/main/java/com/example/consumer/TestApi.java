package com.example.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author: minton.zhang
 * @since: 2020/6/3 21:18
 */
@FeignClient(name = "node3")
public interface TestApi {

    @GetMapping("/node3")
    List<String> node3();
}
