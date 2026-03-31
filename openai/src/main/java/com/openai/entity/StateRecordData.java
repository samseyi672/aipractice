package com.openai.entity;

public record StateRecordData(
        String stateName,
        String capitalCity,
        int areaInSquareMiles,
        int population,
        String famousFor
) {}