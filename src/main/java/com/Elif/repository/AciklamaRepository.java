package com.Elif.repository;

import com.Elif.entity.Aciklama;

public class AciklamaRepository extends RepositoryManager<Aciklama,Long> {
    public AciklamaRepository() {
        super(new Aciklama());
    }
}
