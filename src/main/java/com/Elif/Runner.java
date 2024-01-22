package com.Elif;

import com.Elif.entity.Yarismaci;
import com.Elif.repository.YarismaciRepository;
import com.Elif.service.YarismaciService;
import com.Elif.utility.Enums.CreateRepoImpl;


public class Runner {
    public static void main(String[] args) {
    // new CreateRepoImpl().createDemoData(); // Default verileri böyle ekledim
        new YarismaciService().puaniEnYuksekVeEnDusukSuresiOlanYarismaciyiBul();
    }

}
