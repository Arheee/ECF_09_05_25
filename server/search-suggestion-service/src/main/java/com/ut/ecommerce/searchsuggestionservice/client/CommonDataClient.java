package com.ut.ecommerce.searchsuggestionservice.client;

import com.ut.ecommerce.searchsuggestionservice.model.SearchSuggestionResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommonDataClient {

    private final String COMMON_DATA_URL = "http://localhost:8082/search-suggestion-list";

    private final RestTemplate restTemplate = new RestTemplate();

    public SearchSuggestionResponse fetchSuggestions() {
        return restTemplate.getForObject(COMMON_DATA_URL, SearchSuggestionResponse.class);
    }
}
