package com.Elif.service;

import com.Elif.repository.SkorRepository;

public class SkorService {
    private final SkorRepository skorRepository;

    public SkorService() {
        this.skorRepository = new SkorRepository();
    }
}
