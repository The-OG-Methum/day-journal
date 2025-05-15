package com.methum.dayjounral.controller;


import com.methum.dayjounral.dtos.JournalRequestDto;
import com.methum.dayjounral.dtos.JournalResponseDto;
import com.methum.dayjounral.mappers.JournalMapper;
import com.methum.dayjounral.model.Journal;
import com.methum.dayjounral.service.JournalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JournalController {

    private final JournalService journalService;

    private final JournalMapper journalMapper;

    public JournalController(JournalService journalService, JournalMapper journalMapper) {
        this.journalService = journalService;
        this.journalMapper = journalMapper;
    }


    @GetMapping("/journals")
    public ResponseEntity<List<JournalResponseDto>> getAllJournals() {
        List<Journal> journalList = journalService.getAllJournals();

        if (journalList != null && !journalList.isEmpty()) {
            List<JournalResponseDto> responseList = journalList.stream()
                    .map(journalMapper::toResponse)
                    .toList();
            return new ResponseEntity<>(responseList, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PostMapping("/journals")
    public ResponseEntity<String> createJournal(@RequestBody JournalRequestDto requestDto){

        if (requestDto!=null){

            Journal createdJournal = journalService.createJournals(journalMapper.toEntity(requestDto));

            return new ResponseEntity<>("Journal Created Successfully",HttpStatus.CREATED);


        }

        return new ResponseEntity<>("Failed to create!",HttpStatus.BAD_REQUEST);

    }
}
