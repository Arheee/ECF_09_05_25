package com.ut.ecommerce.searchsuggestionservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class KeywordDto {
    private String keyword;
    private String link;

    public KeywordDto() {
    }

    public KeywordDto(String keyword, String link) {
        this.keyword = keyword;
        this.link = link;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
