package com.ChinoMarket.pe.proyecto_crud.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info=@Info(
                title = "proyecto CRUD",version = "1.0.0",description = "this is a CRUD from management company"
        )
)
public class OpenApiConfig {
}
