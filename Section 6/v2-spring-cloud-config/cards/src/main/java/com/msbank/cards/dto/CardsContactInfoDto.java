package com.msbank.cards.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@ConfigurationProperties(prefix = "cards")
public class CardsContactInfoDto{
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}