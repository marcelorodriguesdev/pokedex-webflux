package com.pokedex.reactiveweb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Pokemon {
    @Id
    private String id;
    private String name;
    private String category;
    private String skills;
    private Double weight;

    public Pokemon() {
        super();
    }

    public Pokemon(String id, String name, String category, String skills, Double weight) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.skills = skills;
        this.weight = weight;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id='" + id + '\'' +
                ", nome='" + name + '\'' +
                ", categoria='" + category + '\'' +
                ", habilidades='" + skills + '\'' +
                ", peso=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pokemon)) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(id, pokemon.id) &&
                Objects.equals(name, pokemon.name) &&
                Objects.equals(category, pokemon.category) &&
                Objects.equals(skills, pokemon.skills) &&
                Objects.equals(weight, pokemon.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, skills, weight);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

}
