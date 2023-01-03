/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.windo.penjualan.repository;

import com.windo.penjualan.entity.Penjualan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS
 */
public interface PenjualanRepository extends JpaRepository<Penjualan, Long>{
    public Penjualan findByPenjualanId(Long penjualanId);
    
}
