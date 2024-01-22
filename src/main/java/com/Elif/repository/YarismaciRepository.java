package com.Elif.repository;

import com.Elif.entity.Yarismaci;

public class YarismaciRepository extends RepositoryManager<Yarismaci,Long> {
    public YarismaciRepository() {
        super(new Yarismaci());
    }
}
