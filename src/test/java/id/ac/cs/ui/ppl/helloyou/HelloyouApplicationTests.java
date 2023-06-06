package id.ac.cs.ui.ppl.helloyou;

import id.ac.cs.ui.ppl.helloyou.controller.HelloyouController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class HelloyouApplicationTests {

	@Autowired
	private HelloyouController controller;

	@Test
	void contextLoads() {
	}

	@Test
	void applicationStartTest() {
		HelloyouApplication.main(new String[] {});
		assertThat(controller).isNotNull();
	}

}
