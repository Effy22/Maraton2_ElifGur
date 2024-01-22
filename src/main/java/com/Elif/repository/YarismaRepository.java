package com.Elif.repository;

import com.Elif.entity.Yarisma;

public class YarismaRepository extends RepositoryManager<Yarisma,Long> {
    public YarismaRepository() {
        super(new Yarisma());
    }
}
