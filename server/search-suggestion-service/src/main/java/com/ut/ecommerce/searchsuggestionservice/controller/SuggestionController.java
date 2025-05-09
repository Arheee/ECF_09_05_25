package com.ut.ecommerce.searchsuggestionservice.controller;

import com.ut.ecommerce.searchsuggestionservice.client.CommonDataClient;
import com.ut.ecommerce.searchsuggestionservice.model.SearchSuggestionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
public class SuggestionController {

    @Autowired
    private CommonDataClient commonDataClient;

    @GetMapping("/suggestions")
    public List<String> getSuggestions(@RequestParam("q") String query) {
        SearchSuggestionResponse response = commonDataClient.fetchSuggestions();

        if (response == null || response.getProductKeywords() == null) {
            return List.of(); // ou retour 204 No Content selon choix
        }

        return response.getProductKeywords().stream()
                .filter(keyword -> keyword.toLowerCase(Locale.ROOT).contains(query.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }
}
