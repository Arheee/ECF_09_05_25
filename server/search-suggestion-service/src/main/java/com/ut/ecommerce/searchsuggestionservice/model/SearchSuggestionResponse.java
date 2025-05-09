package com.ut.ecommerce.searchsuggestionservice.model;

import lombok.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SearchSuggestionResponse {
    private List<String> productKeywords;
}
