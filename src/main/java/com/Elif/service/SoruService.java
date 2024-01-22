package com.Elif.service;

import com.Elif.repository.SoruRepository;

public class SoruService {
    private final SoruRepository soruRepository;
    public SoruService(){

        this.soruRepository = new SoruRepository();
    }
}
