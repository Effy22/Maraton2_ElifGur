package com.Elif.entity;

import com.Elif.utility.Enums.Cinsiyet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_aciklama")
public class Aciklama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String boy;
    @Enumerated(EnumType.STRING)
    Cinsiyet cinsiyet;
    String yas;
    String meslek;
    String kilo;
    String dogumYeri;
    String ilgincOzellik;
    @Column(name = "unlu_id")
    Long unluId;
}
