/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.footbalrating;

/**
 *
 * @author Julia
 */
public class FootballTeam {
    private String name;
    private ChampionshipResult result;

    public FootballTeam(String name, ChampionshipResult result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChampionshipResult getResult() {
        return result;
    }

    public void setResult(ChampionshipResult result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return name + ":\t " + result;
    }
    
    
    
    
}
