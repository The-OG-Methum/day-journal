package com.methum.dayjounral.dtos;

import java.time.LocalDateTime;

public record JournalResponseDto(

        String title,
        String content,
        String createdAtFormatted
) {
}
