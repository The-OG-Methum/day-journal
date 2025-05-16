package com.methum.dayjounral.mappers;

import com.methum.dayjounral.dtos.JournalRequestDto;
import com.methum.dayjounral.dtos.JournalResponseDto;
import com.methum.dayjounral.model.Journal;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
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

        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return time.format(formatter);

    }
}
