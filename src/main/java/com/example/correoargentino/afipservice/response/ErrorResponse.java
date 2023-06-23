package com.example.correoargentino.afipservice.response;

import java.time.LocalDateTime;

public record ErrorResponse(String code, String message, LocalDateTime timestamp) {
}
