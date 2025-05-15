package com.methum.dayjounral.repository;

import com.methum.dayjounral.model.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepo extends JpaRepository<Journal, Long> {
}
