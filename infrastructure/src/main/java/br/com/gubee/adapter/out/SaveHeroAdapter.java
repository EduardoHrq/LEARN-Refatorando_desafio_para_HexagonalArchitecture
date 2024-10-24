package br.com.gubee.adapter.out;

import br.com.gubee.Hero;
import br.com.gubee.ports.out.SaveHeroPort;
import br.com.gubee.repository.hero.SaveHeroRepository;
import org.springframework.stereotype.Component;

@Component
public class SaveHeroAdapter implements SaveHeroPort {

    private final SaveHeroRepository saveHeroRepository;

    public SaveHeroAdapter(SaveHeroRepository saveHeroRepository) {
        this.saveHeroRepository = saveHeroRepository;
    }

    @Override

    public Hero save(Hero hero) {
        return this.saveHeroRepository.save(hero);
    }

}
