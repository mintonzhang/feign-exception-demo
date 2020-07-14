package com.example.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: minton.zhang
 * @since: 2020/6/3 21:18
 */
@RestController
@Slf4j
public class TestController {


	@Autowired
	private TestApi testApi;

	@GetMapping("/node2")
	public List<String> node3() {
		return testApi.node3();
	}
}
