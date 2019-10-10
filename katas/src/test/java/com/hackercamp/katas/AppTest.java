package com.hackercamp.katas;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;

import org.junit.jupiter.api.*;
import org.mockito.*;

class AppTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void getMessageTest() {
		// given
		App app = new App();

		// when
		String message = app.getMessage();

		// then
		assertEquals("Hello World!", message);
	}

}
