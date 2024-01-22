package com.Elif.entity;

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
@Table(name = "tbl_skor")
public class Skor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "yarismaci_id")
    Long yarismaciId;
    @Column(name = "yarisma_id")
    Long yarismaId;
    Long toplampuan;
    Long toplamsure;
}
