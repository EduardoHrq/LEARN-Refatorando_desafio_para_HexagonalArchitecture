package br.com.gubee.commands;

import br.com.gubee.enums.Race;

public record HeroRequestCommand (
        String name,
        Race race,
        boolean enabled,
        short intelligence,
        short agility,
        short dexterity,
        short strength
) {
    public HeroRequestCommand {
        if (name == null) {
            throw new RuntimeException("Nome não pode ser nulo");
        }
    }
}
