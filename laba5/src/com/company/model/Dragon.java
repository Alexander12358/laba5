package com.company.model;

import com.company.Main;

import java.time.LocalDateTime;
import java.util.Objects;

public class Dragon implements Comparable<Dragon>{

    private Long id;
    private String name;
    private Coordinates coordinates;
    private LocalDateTime creationDate;
    private Integer age;
    private Float weight;
    private boolean speaking;
    private DragonHead head;
    private DragonType type;

    public Dragon(String name, Coordinates coordinates, Integer age, Float weight, boolean speaking, DragonHead head, DragonType type) {
        this.id = Main.IdCount;
        Main.IdCount++;
        creationDate = LocalDateTime.now();
        this.name = name;
        this.coordinates = coordinates;
        this.age = age;
        this.weight = weight;
        this.speaking = speaking;
        this.head = head;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (getClass() != o.getClass()){
            if(o.getClass() == Integer.class){
                return id == (int)o;
            }
            return false;
        }
        else {
            Dragon dragon = (Dragon) o;
            return speaking == dragon.speaking && Objects.equals(id, dragon.id) && Objects.equals(name, dragon.name) && Objects.equals(coordinates, dragon.coordinates) && Objects.equals(creationDate, dragon.creationDate) && Objects.equals(age, dragon.age) && Objects.equals(weight, dragon.weight) && Objects.equals(head, dragon.head) && type == dragon.type;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public boolean isSpeaking() {
        return speaking;
    }

    public void setSpeaking(boolean speaking) {
        this.speaking = speaking;
    }

    public DragonHead getHead() {
        return head;
    }

    public void setHead(DragonHead head) {
        this.head = head;
    }

    public DragonType getType() {
        return type;
    }

    public void setType(DragonType type) {
        this.type = type;
    }

    @Override
    public int compareTo(Dragon o) {
        return name.compareTo(o.name);
    }

    public Dragon(Long id, String name, Coordinates coordinates, LocalDateTime creationDate, Integer age, Float weight, boolean speaking, DragonHead head, DragonType type) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.age = age;
        this.weight = weight;
        this.speaking = speaking;
        this.head = head;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", age=" + age +
                ", weight=" + weight +
                ", speaking=" + speaking +
                ", head=" + head +
                ", type=" + type +
                '}';
    }
}
