package com.msbank.loans.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "loans")
public class LoansContactInfoDto{
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}