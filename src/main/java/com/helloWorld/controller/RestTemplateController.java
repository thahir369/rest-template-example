package com.helloWorld.controller;

import com.helloWorld.RestTemplateClient;
import com.helloWorld.dto.TopicDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RestTemplateController {

  @Autowired private RestTemplateClient restTemplateClient;

  @GetMapping("/topics/{id}")
  public TopicDto getTopic(@PathVariable Integer id) {
    return restTemplateClient.getTopicById(id);
  }
}
