package com.Elif.repository;

import com.Elif.entity.Unlu;

public class UnluRepository extends RepositoryManager<Unlu,Long> {
    public UnluRepository() {
        super(new Unlu());
    }
}
