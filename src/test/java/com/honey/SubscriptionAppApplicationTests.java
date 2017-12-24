package com.honey;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.honey.web.i18n.I18NService;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubscriptionAppApplicationTests {

	@Autowired
	public I18NService i18nservice;

	@SuppressWarnings("deprecation")
	@Test
	public void testMessageByLocalService() throws Exception {
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18nservice.getMessage(messageId);
		Assert.assertEquals("The actual and expected Strigs don't match", expectedResult, actual);
	}

}
