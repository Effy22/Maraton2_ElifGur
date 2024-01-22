package com.Elif.service;

import com.Elif.repository.AciklamaRepository;

public class AciklamaService {
    private final AciklamaRepository aciklamaRepository;

    public AciklamaService() {
        this.aciklamaRepository=new AciklamaRepository();
    }
}
