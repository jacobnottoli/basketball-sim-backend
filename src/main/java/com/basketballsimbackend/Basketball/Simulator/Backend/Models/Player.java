package com.basketballsimbackend.Basketball.Simulator.Backend.Models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@ToString

public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id;
    @Column
    private int team_id;
    @Column
    private String name;
    @Column
    private int minutes;
    @Column
    private double twoptfgp;
    @Column
    private double threeptfgp;
    @Column
    private double ftp;
    @Column
    private double rebp;
    @Column
    private double astp;
    @Column
    private double twoptusg;
    @Column
    private double threeptusg;


}
