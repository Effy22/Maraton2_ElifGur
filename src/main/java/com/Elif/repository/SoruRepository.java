package com.Elif.repository;

import com.Elif.entity.Soru;

public class SoruRepository extends RepositoryManager<Soru,Long> {
    public SoruRepository() {
        super(new Soru());
    }
}
