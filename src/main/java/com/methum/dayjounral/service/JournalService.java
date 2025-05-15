package com.methum.dayjounral.service;

import com.methum.dayjounral.dtos.JournalRequestDto;
import com.methum.dayjounral.model.Journal;
import org.springframework.stereotype.Service;

import java.util.List;


public interface JournalService {


    List<Journal> getAllJournals();

    Journal createJournals(Journal journal);
}
