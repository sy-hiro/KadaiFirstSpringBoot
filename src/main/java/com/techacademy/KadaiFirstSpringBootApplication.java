package com.techacademy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KadaiFirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(KadaiFirstSpringBootApplication.class, args);
	}

}
//@GetMapping("/dayofweek/{val1}")
//public String calcPlus(@PathVariable int val1) {
//  int res = 0;
//  res = val1;
//  return "計算結果：" + res;
//}