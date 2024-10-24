package br.com.gubee;

import br.com.gubee.enums.Race;

import java.sql.Timestamp;
import java.util.UUID;

public class Hero {
    private UUID id;
    private String name;
    private Race race;
    private PowerStats powerStats;
    private boolean enabled;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Hero() {}

    public Hero(UUID id, String name, Race race, PowerStats powerStats, boolean enabled, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.powerStats = powerStats;
        this.enabled = enabled;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Hero(String name, Race race, PowerStats powerStats, boolean enabled, Timestamp createdAt, Timestamp updatedAt) {
        this.name = name;
        this.race = race;
        this.powerStats = powerStats;
        this.enabled = enabled;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Hero(String name, Race race, PowerStats powerStats, boolean enabled) {
        this.name = name;
        this.race = race;
        this.powerStats = powerStats;
        this.enabled = enabled;
    }

    public Hero(UUID id, String name, Race race, PowerStats powerStats, boolean enabled) {
        this.id = id;
        this.name = name;
        this.race = race;
        this.powerStats = powerStats;
        this.enabled = enabled;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public PowerStats getPowerStats() {
        return powerStats;
    }

    public void setPowerStats(PowerStats powerStats) {
        this.powerStats = powerStats;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
