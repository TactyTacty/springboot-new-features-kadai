package com.example.samuraitravel.entity;

 import java.sql.Timestamp;
import java.time.LocalDate;

import com.example.kadai_002.entity.Store;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
 
 @Entity
 @Table(name = "reservations")
 @Data
public class Reservation {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private Integer id;
     
     @ManyToOne
     @JoinColumn(name = "house_id")
     private Houses house; 
     
     @ManyToOne
     @JoinColumn(name = "user_id")
     private User user;     
     
     @Column(name = "checkin_date")
     private LocalDate checkinDate;
     
     @Column(name = "checkout_date")
     private LocalDate checkoutDate;   
     
     @Column(name = "number_of_people")
     private Integer numberOfPeople; 
     
     @Column(name = "amount")
     private Integer amount;     
     
     @Column(name = "created_at", insertable = false, updatable = false)
     private Timestamp createdAt;
     
     @Column(name = "updated_at", insertable = false, updatable = false)
     private Timestamp updatedAt;

	public void setStore(Store store) {
		// TODO 自動生成されたメソッド・スタブ
		
	}    
}