package com.helloWorld;

import com.helloWorld.dto.TopicDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateClient {

  private final String url = "http://localhost:8080/topics";

  private final RestTemplate restTemplate;

  public RestTemplateClient(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }

  public TopicDto getTopicById(int id) {
    return restTemplate.getForObject(url + id, TopicDto.class);
  }
}
