package com.ut.ecommerce.searchsuggestionservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.ut.ecommerce.searchsuggestionservice.model.SearchSuggestionResponse;

@FeignClient(name = "common-data-service", url = "http://common-data-service:8082")
public interface CommonDataClient {

    @GetMapping("/search-suggestion-list")
    SearchSuggestionResponse fetchSuggestions();
}
