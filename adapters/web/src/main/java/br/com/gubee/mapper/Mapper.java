package br.com.gubee.mapper;

import br.com.gubee.commands.HeroRequestCommand;
import br.com.gubee.dtos.request.SaveHeroRequestDTO;

public class Mapper {

    public static HeroRequestCommand HeroDtoToHeroCommand(SaveHeroRequestDTO heroRequestDTO) {
        return new HeroRequestCommand(heroRequestDTO.name(), heroRequestDTO.race(), heroRequestDTO.enabled(),
                heroRequestDTO.intelligence(), heroRequestDTO.agility(), heroRequestDTO.dexterity(), heroRequestDTO.strength());
    }
}
