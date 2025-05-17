package com.methum.dayjounral.dtos;

import java.time.LocalDateTime;

public record JournalResponseDto(
        long id,
        String title,
        String content,
        String createdAtFormatted
) {
}
