package com.project.tradingev_batter.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "carts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cartsid")
    private long cartsid;

    @Column(name = "createdat")
    private Date createdat;

    @Column(name = "updatedat")
    private Date updatedat;

    @OneToOne
    @JoinColumn(name = "userid")
    private User users;

    @OneToMany(mappedBy = "carts")
    private List<cart_items>  cart_items = new ArrayList<>();
}
