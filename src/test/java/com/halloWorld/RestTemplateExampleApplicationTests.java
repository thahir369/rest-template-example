package com.halloWorld;

import com.halloWorld.dto.TopicDto;
import com.halloWorld.restclient.RestTemplateClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class RestTemplateExampleApplicationTests {

  @Autowired
  RestTemplateClient restTemplateClient;

//  @Test
//  void getTopic() {
//    TopicDto topicDto = restTemplateClient.getTopicById(1);
//    assertNotNull(topicDto);
//  }
}
