package com.Elif.utility.Enums;

import com.Elif.entity.*;
import com.Elif.repository.*;

import java.util.List;

public class CreateRepoImpl {
    private final AciklamaRepository aciklamaRepository;
    private final SkorRepository skorRepository;
    private final SoruRepository soruRepository;
    private final UnluRepository unluRepository;
    private final YarismaciRepository yarismaciRepository;
    private final YarismaRepository yarismaRepository;
    public CreateRepoImpl(){
        this.aciklamaRepository=new AciklamaRepository();
        this.skorRepository=new SkorRepository();
        this.soruRepository=new SoruRepository();
        this.unluRepository=new UnluRepository();
        this.yarismaciRepository=new YarismaciRepository();
        this.yarismaRepository=new YarismaRepository();
    }

    public void createDemoData(){
        //UNLU
        unluRepository.save(Unlu.builder()

                .ad("Brad Pitt")
                .resimUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .ad("John Doe")
                .resimUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .ad("Alex Johnson")
                .resimUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .ad("Ally Brown")
                .resimUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .ad("Emma Smith")
                .resimUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .ad("Emma Smith")
                .resimUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .ad("Emma Smith")
                .resimUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .ad("Emma Smith")
                .resimUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .ad("Emma Smith")
                .resimUrl("https://...")
                .build());
        unluRepository.save(Unlu.builder()

                .ad("Emma Smith")
                .resimUrl("https://...")
                .build());
        //AÇIKLAMA;
        aciklamaRepository.save(Aciklama.builder()

                .cinsiyet(Cinsiyet.ERKEK)
                .boy("190")
                .yas("55")
                .kilo("78")
                .dogumYeri("Chicago")
                .meslek("Oyuncu")
                .ilgincOzellik("Angelina Jolie ile evli kalıp boşanmıştır.")
                .unluId(1L)
                .build());
        aciklamaRepository.save(Aciklama.builder()

                .cinsiyet(Cinsiyet.ERKEK)
                .boy("180")
                .yas("25")
                .kilo("75")
                .dogumYeri("Los Angeles")
                .meslek("Yazılım Geliştirici")
                .ilgincOzellik("Müzik dinlemeyi sever.")
                .unluId(2L)
                .build());
        aciklamaRepository.save(Aciklama.builder()

                .cinsiyet(Cinsiyet.KADIN)
                .boy("165")
                .yas("28")
                .kilo("55")
                .dogumYeri("San Francisco")
                .meslek("Grafik Tasarımcı")
                .ilgincOzellik("Resim çizmeyi çok sever.")
                .unluId(3L)
                .build());
        aciklamaRepository.save(Aciklama.builder()

                .cinsiyet(Cinsiyet.ERKEK)
                .boy("175")
                .yas("32")
                .kilo("80")
                .dogumYeri("Chicago")
                .meslek("Doktor")
                .ilgincOzellik("Kitap okumayı sever.")
                .unluId(4L)
                .build());
        aciklamaRepository.save(Aciklama.builder()

                .cinsiyet(Cinsiyet.KADIN)
                .boy("160")
                .yas("28")
                .kilo("60")
                .dogumYeri("İstanbul")
                .meslek("Mühendis")
                .ilgincOzellik("Resim yapmayı sever.")
                .unluId(5L)
                .build());

        aciklamaRepository.save(Aciklama.builder()

                .cinsiyet(Cinsiyet.ERKEK)
                .boy("183")
                .yas("45")
                .kilo("90")
                .dogumYeri("Ankara")
                .meslek("Avukat")
                .ilgincOzellik("Seyahat etmeyi sever.")
                .unluId(6L)
                .build());
        aciklamaRepository.save(Aciklama.builder()

                .cinsiyet(Cinsiyet.KADIN)
                .boy("160")
                .yas("28")
                .kilo("60")
                .dogumYeri("İstanbul")
                .meslek("Mühendis")
                .ilgincOzellik("Resim yapmayı sever.")
                .unluId(7L)
                .build());
        aciklamaRepository.save(Aciklama.builder()

                .cinsiyet(Cinsiyet.KADIN)
                .boy("183")
                .yas("45")
                .kilo("90")
                .dogumYeri("Ankara")
                .meslek("Avukat")
                .ilgincOzellik("Tenis oynar hep türkiyenin gündemindedir.")
                .unluId(8L)
                .build());
        aciklamaRepository.save(Aciklama.builder()

                .cinsiyet(Cinsiyet.ERKEK)
                .boy("160")
                .yas("13")
                .kilo("45")
                .dogumYeri("Hindistan")
                .meslek("Oyuncu")
                .ilgincOzellik("Uçurtma Avcısı filminde oynamıştı.")
                .unluId(9L)
                .build());
        aciklamaRepository.save(Aciklama.builder()

                .cinsiyet(Cinsiyet.ERKEK)
                .boy("165")
                .yas("60")
                .kilo("60")
                .dogumYeri("İstanbul")
                .meslek("Mühendis")
                .ilgincOzellik("Amerikanın ilk nobel ödülü sahibidir")
                .unluId(10L)
                .build());

        //SORULAR;
        Soru soru1=new Soru();

        soru1.setAciklamaId(1L);
        soru1.setPuan("100");
        soru1.setSure("15dk");
        Soru soru2=new Soru();

        soru2.setAciklamaId(2L);
        soru2.setPuan("190");
        soru2.setSure("15dk");
        Soru soru3=new Soru();

        soru3.setAciklamaId(3L);
        soru3.setPuan("140");
        soru3.setSure("15dk");
        Soru soru4=new Soru();

        soru4.setAciklamaId(4L);
        soru4.setPuan("350");
        soru4.setSure("15dk");
        Soru soru5=new Soru();

        soru5.setAciklamaId(5L);
        soru5.setPuan("120");
        soru5.setSure("15dk");
        Soru soru6=new Soru();

        soru6.setAciklamaId(6L);
        soru6.setPuan("20");
        soru6.setSure("15dk");
        Soru soru7=new Soru();

        soru7.setAciklamaId(7L);
        soru7.setPuan("50");
        soru7.setSure("15dk");
        Soru soru8=new Soru();

        soru8.setAciklamaId(8L);
        soru8.setPuan("250");
        soru8.setSure("15dk");
        Soru soru9=new Soru();

        soru9.setAciklamaId(9L);
        soru9.setPuan("200");
        soru9.setSure("15dk");
        Soru soru10=new Soru();

        soru10.setAciklamaId(10L);
        soru10.setPuan("300");
        soru10.setSure("15dk");


        //yarişmacı;
        Yarismaci yarismaci1 = new Yarismaci();

        yarismaci1.setAd("Ahmet Gültekin");
        yarismaci1.setAdres("Ankara");
        yarismaci1.setEmail("ahmet453@gmail.com");
        yarismaci1.setUsername("ahmo");

        Yarismaci yarismaci2 = new Yarismaci();

        yarismaci2.setAd("Ayşe Yılmaz");
        yarismaci2.setAdres("İstanbul");
        yarismaci2.setEmail("ayse123@gmail.com");
        yarismaci2.setUsername("ayseli");

        Yarismaci yarismaci3 = new Yarismaci();

        yarismaci3.setAd("Mehmet Yılmaz");
        yarismaci3.setAdres("İzmir");
        yarismaci3.setEmail("mehmet545@gmail.com");
        yarismaci3.setUsername("mehmo");

        Yarismaci yarismaci4 = new Yarismaci();

        yarismaci4.setAd("Fatma Çelik");
        yarismaci4.setAdres("Bursa");
        yarismaci4.setEmail("fatma34@gmail.com");
        yarismaci4.setUsername("fatmacik");

        //yarışma; 1 yarışmada farklı kişilere random sorular sorulcak
       Yarisma yarisma =Yarisma.builder()
               .ad("Karışık Yarışma")
                 .soruListesi(List.of(soru1,soru2,soru3,soru4,soru5,soru6,soru7,soru8,soru9,soru10))
                 .yarismaciListesi(List.of(yarismaci1,yarismaci2,yarismaci3,yarismaci4))
                 .baslangicTarihi(System.currentTimeMillis())
                 .build();

        soru1.setYarisma(yarisma);
        soru2.setYarisma(yarisma);
        soru3.setYarisma(yarisma);
        soru4.setYarisma(yarisma);
        soru5.setYarisma(yarisma);
        soru6.setYarisma(yarisma);
        soru7.setYarisma(yarisma);
        soru8.setYarisma(yarisma);
        soru9.setYarisma(yarisma);
        soru10.setYarisma(yarisma);
        yarismaci1.setYarisma(yarisma);
        yarismaci2.setYarisma(yarisma);
        yarismaci3.setYarisma(yarisma);
        yarismaci4.setYarisma(yarisma);
        yarismaRepository.save(yarisma);

        //Skorlar;
        skorRepository.save(Skor.builder()
                .yarismaciId(1L)
                .yarismaId(1L)
                .toplamsure(1000L)
                .toplampuan(100L)
                .build());
        skorRepository.save(Skor.builder()
                .yarismaciId(2L)
                .yarismaId(1L)
                .toplamsure(2000L)
                .toplampuan(200L)
                .build());
        skorRepository.save(Skor.builder()
                .yarismaciId(3L)
                .yarismaId(1L)
                .toplamsure(1000L)
                .toplampuan(700L)
                .build());
        skorRepository.save(Skor.builder()
                .yarismaciId(4L)
                .yarismaId(1L)
                .toplamsure(2000L)
                .toplampuan(600L)
                .build());
        skorRepository.save(Skor.builder()
                .yarismaciId(5L)
                .yarismaId(1L)
                .toplamsure(300L)
                .toplampuan(800L)
                .build());

    }










}
