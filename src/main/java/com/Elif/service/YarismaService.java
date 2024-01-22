package com.Elif.service;

import com.Elif.repository.YarismaRepository;

public class YarismaService {
    private final YarismaRepository yarismaciRepository;

    public YarismaService() {
        this.yarismaciRepository = new YarismaRepository();
    }
}
