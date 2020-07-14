package com.example.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: minton.zhang
 * @since: 2020/6/3 21:14
 */
@RestController
public class TestController {

	@Autowired
	private TestApi testApi;

	@GetMapping("/node1")
	public List<String> data1() {
		return testApi.node2();
	}
}
