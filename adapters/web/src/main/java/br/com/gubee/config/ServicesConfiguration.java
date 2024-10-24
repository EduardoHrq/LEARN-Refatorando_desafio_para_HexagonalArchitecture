package br.com.gubee.config;

import br.com.gubee.ports.in.SaveHeroUseCase;
import br.com.gubee.ports.out.SaveHeroPort;
import br.com.gubee.services.SaveHeroService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfiguration {

    private final SaveHeroPort saveHeroPort;

    public ServicesConfiguration(SaveHeroPort saveHeroPort) {
        this.saveHeroPort = saveHeroPort;
    }

    @Bean
    SaveHeroUseCase saveHeroUseCase() {
        return new SaveHeroService(saveHeroPort);
    }
}
