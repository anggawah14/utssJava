/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.app.uts.npm157.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table (name = "Payment")
public class Payment {
    @Id
    @Column (name = "paymentid")
    private String IdPayment;
    
    @Column (name = "tanggalpayment")
    private String TanggalPayment;
    
    @Column (name = "nomorpo")
    private String NomorPO;
    
    @Column (name = "supplier")
    private String Supplier;
    
    @Column (name = "totaltagihan")
    private String TotalTagihan;

    public Payment() {
    }

    public Payment(String IdPayment, String TanggalPayment, String NomorPO, String Supplier, String TotalTagihan) {
        this.IdPayment = IdPayment;
        this.TanggalPayment = TanggalPayment;
        this.NomorPO = NomorPO;
        this.Supplier = Supplier;
        this.TotalTagihan = TotalTagihan;
    }

    public String getIdPayment() {
        return IdPayment;
    }

    public void setIdPayment(String IdPayment) {
        this.IdPayment = IdPayment;
    }

    public String getTanggalPayment() {
        return TanggalPayment;
    }

    public void setTanggalPayment(String TanggalPayment) {
        this.TanggalPayment = TanggalPayment;
    }

    public String getNomorPO() {
        return NomorPO;
    }

    public void setNomorPO(String NomorPO) {
        this.NomorPO = NomorPO;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    public String getTotalTagihan() {
        return TotalTagihan;
    }

    public void setTotalTagihan(String TotalTagihan) {
        this.TotalTagihan = TotalTagihan;
    }
    
}
