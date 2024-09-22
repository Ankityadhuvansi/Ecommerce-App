package com.Ankit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ankit.model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem,Long> {

}
