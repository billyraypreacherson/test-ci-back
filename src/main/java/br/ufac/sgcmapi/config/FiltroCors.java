package br.ufac.sgcmapi.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class FiltroCors {

    @Bean
    public CorsFilter corsFilter() {

        CorsConfiguration configCors = new CorsConfiguration();
        configCors.setAllowCredentials(true);
        configCors.setAllowedOrigins(Arrays.asList(
            "https://localhost:4200",
            "https://sgcmappteste.herokuapp.com/"
        ));
        configCors.setAllowedMethods(Arrays.asList("*"));
        configCors.setAllowedHeaders(Arrays.asList("*"));

        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", configCors);

        return new CorsFilter(configSource);

    }
    
}
