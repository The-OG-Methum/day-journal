package com.methum.dayjounral.mappers;

import com.methum.dayjounral.dtos.JournalRequestDto;
import com.methum.dayjounral.dtos.JournalResponseDto;
import com.methum.dayjounral.model.Journal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JournalMapperImpl implements JournalMapper{

    @Override
    public JournalResponseDto toResponse(Journal journal) {

        String formattedCreatedAt = journal.getCreatedAt() != null
                ? formattedDate(journal.getCreatedAt())
                : null;

        return new JournalResponseDto(
                journal.getTitle(),
                journal.getContent(),
                formattedCreatedAt
        );
    }

    @Override
    public Journal toEntity(JournalRequestDto requestDto) {

        return new Journal(
                null,
                requestDto.title(),
                requestDto.content(),
                null,
                null,
                null,
                false

        );

    }


    public String formattedDate(LocalDateTime time){

        return  DateTimeFormatter.ISO_DATE_TIME.format(time);

    }
}
