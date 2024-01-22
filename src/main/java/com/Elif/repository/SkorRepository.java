package com.Elif.repository;

import com.Elif.entity.Skor;

public class SkorRepository extends RepositoryManager<Skor,Long> {
    public SkorRepository() {
        super(new Skor());
    }
}
