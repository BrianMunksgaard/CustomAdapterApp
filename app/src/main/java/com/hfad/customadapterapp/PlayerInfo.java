package com.hfad.customadapterapp;

/**
 * Created by brianmunksgaard on 15/02/2018.
 */

public class PlayerInfo {

    private String name;

    private int age;

    private String countryCode;

    public PlayerInfo(String name, int age, String countryCode) {
        this.name = name;
        this.age = age;
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
