package br.com.gubee.dtos.request;

import br.com.gubee.enums.Race;

public record SaveHeroRequestDTO(
        String name,
        Race race,
        boolean enabled,
        short intelligence,
        short agility,
        short dexterity,
        short strength
) {
    public SaveHeroRequestDTO {
        if (name == null) {
            throw new RuntimeException("Nome não pode ser nulo");
        }
    }
}
