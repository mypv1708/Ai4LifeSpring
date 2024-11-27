package com.spring.ai4life.repository;

import com.spring.ai4life.entity.ReviewCall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ReviewCallRepository extends JpaRepository<ReviewCall, UUID> {
}
