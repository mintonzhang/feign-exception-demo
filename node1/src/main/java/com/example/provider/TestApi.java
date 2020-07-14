package com.example.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author: minton.zhang
 * @since: 2020/6/3 21:18
 */
@FeignClient(name = "node2")
public interface TestApi {

	@GetMapping("/node2")
	List<String> node2();
}
