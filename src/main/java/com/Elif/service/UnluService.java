package com.Elif.service;

import com.Elif.repository.UnluRepository;

public class UnluService {
    private final UnluRepository unluRepository;
    public UnluService(){
        this.unluRepository=new UnluRepository();
    }
}
