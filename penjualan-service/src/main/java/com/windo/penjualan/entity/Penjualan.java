/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.windo.penjualan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ASUS
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Penjualan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long penjualanId;
    private Long kodeBarang;
    private String namaBarang;
    private Double harga;
    private Double jumlah;
    private Double diskonPersen;
    private Double total;
    private Double tDiskon;
    private Double totalBayar;
    
    public Double getTotal(){
        total = harga * jumlah;
        return total;
    }
    
    public Double getTDiskon(){
        tDiskon = diskonPersen * total;
        return tDiskon;
    }

    public String getPelangganId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
