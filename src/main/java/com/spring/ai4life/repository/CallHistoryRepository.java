package com.spring.ai4life.repository;

import com.spring.ai4life.entity.CallHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CallHistoryRepository extends JpaRepository<CallHistory, UUID> {
    @Query("SELECT ca FROM CallHistory ca WHERE ca.typeStatus = 'NONE' ORDER BY ca.createdAt DESC")
    List<CallHistory> getLisUnmadeCalls();

}
