package com.example.samuraitravel.entity;

 import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

 //クラスに@Entityアノテーションをつけることで、そのクラスがエンティティとして機能するようになります。
 @Entity
 //クラスに@Tableアノテーションをつけ、対応づけるテーブル名を指定する
 @Table(name = "houses")
 //クラスに@Dataアノテーションをつけ、ゲッターやセッターなどを自動生成する
 @Data
public class House {
	 
	 //エンティティのフィールドに@Idアノテーションをつけることで、そのフィールドを主キーに指定できます。
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     
     //各フィールドに@Columnアノテーションをつけ、対応づけるカラム名を指定する
     @Column(name = "id")
     private Integer id;
 
     @Column(name = "name")
     private String name;
 
     @Column(name = "image_name")
     private String imageName;
 
     @Column(name = "description")
     private String description;
 
     @Column(name = "price")
     private Integer price;
 
     @Column(name = "capacity")
     private Integer capacity;
 
     @Column(name = "postal_code")
     private String postalCode;
 
     @Column(name = "address")
     private String address;
 
     @Column(name = "phone_number")
     private String phoneNumber;
 
     @Column(name = "created_at", insertable = false, updatable = false)
     private Timestamp createdAt;
 
     @Column(name = "updated_at", insertable = false, updatable = false)
     private Timestamp updatedAt;
}
