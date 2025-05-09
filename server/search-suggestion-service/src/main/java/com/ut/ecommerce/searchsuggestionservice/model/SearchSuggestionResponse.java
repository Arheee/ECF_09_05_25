package com.ut.ecommerce.searchsuggestionservice.model;


import java.util.List;


public class SearchSuggestionResponse {
    private List<String> productKeywords;

    public List<String> getProductKeywords() {
        return productKeywords;
    }

    public void setProductKeywords(List<String> productKeywords) {
        this.productKeywords = productKeywords;
    }
}
