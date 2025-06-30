package org.music.classical.api.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Classical Music API",
        version = "1.0.0",
        description = "API for managing classical music artists, compositions, and performances."
    )
)
public class SwaggerConfig {
}
