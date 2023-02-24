package com.halloWorld.controller;

import com.halloWorld.dto.TopicDto;
import com.halloWorld.restclient.RestTemplateClient;
import com.halloWorld.service.RestTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restTemplate")
public class RestTemplateController {

  private final RestTemplateClient restTemplateClient;

  private final RestTemplateService restTemplateService;

  @GetMapping("/home")
  public String getHomePage() {
    return restTemplateService.getHomePage();
  }

  @GetMapping("/topics")
  public List<TopicDto> getAllTopics() {
    return restTemplateService.getAllTopics();
  }

  @GetMapping("/topics/{id}")
  public TopicDto getTopic(@PathVariable String id) {
    TopicDto topicDto = restTemplateService.getTopic(id);
    return topicDto;
  }
}
