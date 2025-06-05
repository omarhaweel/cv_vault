package com.example.cv_vault;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;


@SpringBootTest
@TestPropertySource(properties = {
		"spring.datasource.url=jdbc:postgresql://localhost:5432/cv_dev",
		"spring.datasource.username=omarhaweel",
		"spring.datasource.password=omha"
})
@ActiveProfiles("dev")
class DemoApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("✅ Context loaded successfully!");
	}
}