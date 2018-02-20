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
public class ChampionshipResult {
    private int score;    
    private int scoredGoals;
    private int notScoredGoals;
    private int wonGames;
    private int drawGames;
    private int lostGames;
    private int gamesAmount; //total: wonGames + drawGames + lostGames

    public ChampionshipResult(int score, int scoredGoals, int notScoredGoals, int wonGames, int drawGames, int lostGames) {
        this.score = score;
        this.scoredGoals = scoredGoals;
        this.notScoredGoals = notScoredGoals;
        this.wonGames = wonGames;
        this.drawGames = drawGames;
        this.lostGames = lostGames;
        countGamesAmount();        
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public int getNotScoredGoals() {
        return notScoredGoals;
    }

    public void setNotScoredGoals(int notScoredGoals) {
        this.notScoredGoals = notScoredGoals;
    }

    public int getWonGames() {
        return wonGames;
    }

    public void setWonGames(int wonGames) {
        this.wonGames = wonGames;
        countGamesAmount();
    }

    public int getDrawGames() {
        return drawGames;
    }

    public void setDrawGames(int drawGames) {
        this.drawGames = drawGames;
        countGamesAmount();
    }

    public int getLostGames() {
        return lostGames;
    }

    public void setLostGames(int lostGames) {
        this.lostGames = lostGames;
        countGamesAmount();
    }

    public int getGamesAmount() {
        return gamesAmount;
    }
    
    private void countGamesAmount() {
        this.gamesAmount = this.wonGames + this.drawGames + this.lostGames;
    } 

    @Override
    public String toString() {
        return "{О=" + score + ", З=" + scoredGoals + ", П=" + notScoredGoals + ", В=" + wonGames + ", Н=" + drawGames + ", П=" + lostGames + ", И=" + gamesAmount + '}';
    }
    
    
    
}
