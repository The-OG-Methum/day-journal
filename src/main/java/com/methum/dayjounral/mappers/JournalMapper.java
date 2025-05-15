package com.methum.dayjounral.mappers;

import com.methum.dayjounral.dtos.JournalRequestDto;
import com.methum.dayjounral.dtos.JournalResponseDto;
import com.methum.dayjounral.model.Journal;
import org.springframework.stereotype.Component;


public interface JournalMapper {

    public JournalResponseDto toResponse(Journal journal);

    public Journal toEntity(JournalRequestDto requestDto);
}
