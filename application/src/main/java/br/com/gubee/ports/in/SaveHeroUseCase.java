package br.com.gubee.ports.in;

import br.com.gubee.commands.HeroRequestCommand;

import java.util.UUID;

public interface SaveHeroUseCase {
    UUID save(HeroRequestCommand hero);
}
