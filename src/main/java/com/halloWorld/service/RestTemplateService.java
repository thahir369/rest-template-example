package com.halloWorld.service;

import com.halloWorld.dto.TopicDto;
import com.halloWorld.restclient.RestTemplateClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RestTemplateService {

  private final RestTemplateClient restTemplateClient;

  public String getHomePage() {
    return restTemplateClient.getHomePage().getBody();
  }

  public List<TopicDto> getAllTopics() {
    return Arrays.stream(Objects.requireNonNull(restTemplateClient.getAllTopics().getBody())).collect(Collectors.toList());
  }

  public TopicDto getTopic(String id) {
    return restTemplateClient.getTopicById(id);
  }
}
