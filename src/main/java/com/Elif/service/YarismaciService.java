package com.Elif.service;

import com.Elif.entity.Skor;
import com.Elif.entity.Yarisma;
import com.Elif.entity.Yarismaci;
import com.Elif.repository.SkorRepository;
import com.Elif.repository.YarismaRepository;
import com.Elif.repository.YarismaciRepository;

import java.util.*;
import java.util.stream.Collectors;

public class YarismaciService {
    private final YarismaciRepository yarismaciRepository;
    private final SkorRepository skorRepository;
    private final YarismaRepository yarismaRepository;
    public YarismaciService(){
        yarismaciRepository = new YarismaciRepository();
        skorRepository = new SkorRepository();
        yarismaRepository = new YarismaRepository();
    }


    public void puaniEnYuksekVeEnDusukSuresiOlanYarismaciyiBul() {
        System.out.println("Lütfen skorerini bulmak istediğiniz yarışmanın id'sini yazınız...:");
        Long yarismaId = new Scanner(System.in).nextLong();

        List<Skor> skorList = skorRepository.findAll().stream()
                .filter(s -> s.getYarismaId().equals(yarismaId))
                .collect(Collectors.toList());

        if (!skorList.isEmpty()) {
            // En yüksek puan ve en düşük süreye sahip yarışmacıyı buluyoruz;
            Skor enYuksekPuanEnDusukSure = skorList.stream()
                    .min(Comparator.comparing(Skor::getToplampuan).reversed()
                            .thenComparing(Comparator.comparing(Skor::getToplamsure)))
                    .orElse(null);

            if (enYuksekPuanEnDusukSure != null) {
                Long yarismaciId = enYuksekPuanEnDusukSure.getYarismaciId();

                Optional<Yarismaci> yarismaciOptional = yarismaciRepository.findById(yarismaciId);
                if (yarismaciOptional.isPresent()) {
                    Yarismaci yarismaci = yarismaciOptional.get();

                    System.out.println("En Yüksek Puan ve En Düşük Süreli Yarışmacı Bilgileri:");
                    System.out.println("Yarışmacı ID: " + yarismaci.getId());
                    System.out.println("Ad: " + yarismaci.getAd());
                    System.out.println("Adres: " + yarismaci.getAdres());
                    System.out.println("Email: " + yarismaci.getEmail());
                    System.out.println("Username: " + yarismaci.getUsername());
                    System.out.println("Toplam Puan: " + enYuksekPuanEnDusukSure.getToplampuan());
                    System.out.println("Toplam Süre: " + enYuksekPuanEnDusukSure.getToplamsure());
                } else {
                    System.out.println("Yarışmacı bulunamadı.");
                }
            } else {
                System.out.println("Belirtilen yarışma için skor bulunamadı.");
            }
        } else {
            System.out.println("Belirtilen yarışma için skor bulunamadı.");
        }
    }

}
