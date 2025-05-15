package com.methum.dayjounral.mappers;

import com.methum.dayjounral.dtos.JournalRequestDto;
import com.methum.dayjounral.dtos.JournalResponseDto;
import com.methum.dayjounral.model.Journal;

public class JournalMapperImpl implements JournalMapper{

    @Override
    public JournalResponseDto toResponse(Journal journal) {
        return null;
    }

    @Override
    public Journal toEntity(JournalRequestDto requestDto) {
        return null;
    }
}
