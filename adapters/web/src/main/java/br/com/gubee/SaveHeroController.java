package br.com.gubee;

import br.com.gubee.dtos.request.SaveHeroRequestDTO;
import br.com.gubee.mapper.Mapper;
import br.com.gubee.ports.in.SaveHeroUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("api/v2/hero")
public class SaveHeroController {

    private final SaveHeroUseCase saveHeroUseCase;

    public SaveHeroController(SaveHeroUseCase saveHeroUseCase) {
        this.saveHeroUseCase = saveHeroUseCase;
    }

    @PostMapping
    public ResponseEntity saveHero(@RequestBody SaveHeroRequestDTO heroRequest) {
        return ResponseEntity.created(URI.create("")).body(this.saveHeroUseCase.save(Mapper.HeroDtoToHeroCommand(heroRequest)));
    }
}

