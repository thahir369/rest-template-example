package com.helloWorld;

import com.helloWorld.dto.TopicDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class RestTemplateDemoHbkApplicationTests {

  @Autowired RestTemplateClient restTemplateClient;

  @Test
  void getTopic() {
    TopicDto topicDto = restTemplateClient.getTopicById(1);
    assertNotNull(topicDto);
  }
}
