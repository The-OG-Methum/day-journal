package com.methum.dayjounral.service;

import com.methum.dayjounral.dtos.JournalRequestDto;
import com.methum.dayjounral.model.Journal;
import com.methum.dayjounral.repository.JournalRepo;

import java.util.List;

public class JournalServiceImpl implements  JournalService{

    private final JournalRepo repo;

    public JournalServiceImpl(JournalRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Journal> getAllJournals() {
        return repo.findAll() ;
    }

    @Override
    public Journal createJournals(Journal journal) {
        if (journal != null) {

            return repo.save(journal);
        }

        return null;
    }


}
