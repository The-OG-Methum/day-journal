package com.methum.dayjounral.service;

import com.methum.dayjounral.dtos.JournalRequestDto;
import com.methum.dayjounral.model.Journal;
import com.methum.dayjounral.repository.JournalRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class JournalServiceImpl implements  JournalService{

    private final JournalRepo repo;

    public JournalServiceImpl(JournalRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Journal> getAllJournals() {


        return repo.findAll().stream()
                .filter(journal -> !journal.isDeleted())
                .toList();
    }

    @Override
    public Journal createJournals(Journal journal) {
        if (journal != null) {

            return repo.save(journal);
        }

        return null;
    }

    @Override
    public Journal updateJournals(Journal journal) {
        if (journal != null){
            return repo.save(journal);
        }

        return null;
    }

    @Override
    public Journal findJournalById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteJournal(Long id) {

        // soft delete

    }


}
