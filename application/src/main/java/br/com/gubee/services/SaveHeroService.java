package br.com.gubee.services;

import br.com.gubee.Hero;
import br.com.gubee.PowerStats;
import br.com.gubee.commands.HeroRequestCommand;
import br.com.gubee.ports.in.SaveHeroUseCase;
import br.com.gubee.ports.out.SaveHeroPort;

import java.util.UUID;

public class SaveHeroService implements SaveHeroUseCase {

    private final SaveHeroPort saveHeroPort;

    public SaveHeroService(SaveHeroPort saveHeroPort) {
        this.saveHeroPort = saveHeroPort;
    }

    @Override
    public UUID save(HeroRequestCommand hero) {

        Hero heroToSave = new Hero(hero.name(), hero.race(), new PowerStats(hero.strength(), hero.agility(), hero.dexterity(), hero.intelligence()), hero.enabled());

        return this.saveHeroPort.save(heroToSave).getId();
    }
}
