package com.ut.ecommerce.searchsuggestionservice.controller;

import com.ut.ecommerce.searchsuggestionservice.client.CommonDataClient;
import com.ut.ecommerce.searchsuggestionservice.model.KeywordDto;
import com.ut.ecommerce.searchsuggestionservice.model.SearchSuggestionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@RestController
public class SearchSuggestionController {

   @Autowired
    private CommonDataClient commonDataClient;

    @GetMapping("/search-suggestion-list")
    public List<KeywordDto> getSuggestions(@RequestParam("query") String query) {
        SearchSuggestionResponse response = commonDataClient.fetchSuggestions();

        if (response == null || response.getProductKeywords() == null) {
            return List.of(); 
        }

        return response.getProductKeywords().stream()
                .filter(keyword -> keyword.toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT)))
                .map(keyword -> new KeywordDto(keyword, "/products?q=" + keyword)) 
                .collect(Collectors.toList());
    }
}
