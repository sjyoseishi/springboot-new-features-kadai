package com.example.samuraitravel.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.entity.Review;
import com.example.samuraitravel.entity.User;

public interface ReviewRepository extends JpaRepository<Review, Integer> {


	public Page<Review>findByHouseOrderByCreatedAtDesc(House house, Pageable pageable);

    // 特定の民宿IDに基づいたレビューリストを取得するためのメソッド
	public List<Review> findTop6ByHouseOrderByCreatedAtDesc(House house); /*最新の6件を取得*/

	public Review findByHouseAndUser(House house, User user);

	long countByHouse(House house);


}
