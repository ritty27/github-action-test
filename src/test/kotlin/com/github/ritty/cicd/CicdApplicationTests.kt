package com.github.ritty.cicd

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("staging")
class CicdApplicationTests {

	@Test
	fun contextLoads() {
	}

}
