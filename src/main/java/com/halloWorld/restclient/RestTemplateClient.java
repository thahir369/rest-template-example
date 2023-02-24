package com.halloWorld.restclient;

import com.halloWorld.dto.TopicDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateClient {

  private String url = "http://localhost:8080";

  private final RestTemplate restTemplate;

  public RestTemplateClient(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }

  public ResponseEntity<String> getHomePage() {
    return restTemplate.getForEntity(url + "/home", String.class);
  }

  public ResponseEntity<TopicDto[]> getAllTopics() {
    return restTemplate.getForEntity(url + "/topics", TopicDto[].class);
  }

  public TopicDto getTopicById(String id) {
    TopicDto topicDto = restTemplate.getForObject(url + "/topics/" + id, TopicDto.class);
    return topicDto;
  }
}
