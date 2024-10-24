package br.com.gubee;

import java.sql.Timestamp;
import java.util.UUID;

public class PowerStats {
    private UUID id;
    private short strength;
    private short agility;
    private short dexterity;
    private short intelligence;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public PowerStats() {}

    public PowerStats(UUID id, short strength, short agility, short dexterity, short intelligence, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public PowerStats(short strength, short agility, short dexterity, short intelligence, Timestamp createdAt, Timestamp updatedAt) {
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public PowerStats(short strength, short agility, short dexterity, short intelligence) {
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public short getStrength() {
        return strength;
    }

    public void setStrength(short strength) {
        this.strength = strength;
    }

    public short getAgility() {
        return agility;
    }

    public void setAgility(short agility) {
        this.agility = agility;
    }

    public short getDexterity() {
        return dexterity;
    }

    public void setDexterity(short dexterity) {
        this.dexterity = dexterity;
    }

    public short getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(short intelligence) {
        this.intelligence = intelligence;
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
