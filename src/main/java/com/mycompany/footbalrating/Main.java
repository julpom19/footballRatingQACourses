/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.footbalrating;

import comparators.DrawGamesComparator;
import comparators.LostGamesComparator;
import comparators.NotScoredGoalsComparator;
import comparators.ScoreComparator;
import comparators.ScoredGoalsComparator;
import comparators.WonGamesComparator;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Julia
 */
public class Main {
    public static void main(String... args) {
        ArrayList<FootballTeam> footballTeamsList = new ArrayList<>();
        
        footballTeamsList.add(new FootballTeam("Легия", new ChampionshipResult(44, 35, 24, 14, 2, 7)));
        footballTeamsList.add(new FootballTeam("Ягеллония", new ChampionshipResult(42, 32, 24, 12, 6, 5)));
        footballTeamsList.add(new FootballTeam("Лех", new ChampionshipResult(40, 32, 16, 10, 10, 3)));
        footballTeamsList.add(new FootballTeam("TEST", new ChampionshipResult(39, 45, 36, 11, 10, 9)));
        footballTeamsList.add(new FootballTeam("Гурник", new ChampionshipResult(39, 45, 36, 11, 6, 6)));
        footballTeamsList.add(new FootballTeam("Висла П", new ChampionshipResult(36, 32, 29, 11, 3, 9)));
        footballTeamsList.add(new FootballTeam("Корона", new ChampionshipResult(35, 38, 31, 9, 8, 6)));
        footballTeamsList.add(new FootballTeam("Висла К", new ChampionshipResult(35, 34, 29, 10, 5, 8)));        
        footballTeamsList.add(new FootballTeam("Арка", new ChampionshipResult(32, 28, 23, 8, 8, 7)));
        footballTeamsList.add(new FootballTeam("Заглембе", new ChampionshipResult(32, 33, 29, 8, 8, 7)));
        footballTeamsList.add(new FootballTeam("Шленск", new ChampionshipResult(27, 28, 37, 7, 6, 10)));
        footballTeamsList.add(new FootballTeam("Лехия", new ChampionshipResult(26, 31, 36, 6, 8, 9)));
        footballTeamsList.add(new FootballTeam("Краковия", new ChampionshipResult(25, 30, 34, 6, 7, 10)));
        footballTeamsList.add(new FootballTeam("Пьяст", new ChampionshipResult(23, 24, 33, 5, 8, 10)));
        footballTeamsList.add(new FootballTeam("Сандецья", new ChampionshipResult(22, 24, 37, 4, 10, 9)));
        footballTeamsList.add(new FootballTeam("Термалика", new ChampionshipResult(21, 23, 39, 5, 6, 12)));
        footballTeamsList.add(new FootballTeam("Погонь", new ChampionshipResult(20, 25, 37, 5, 5, 13)));
        
        System.out.println("Games amount comparator");
        Comparator<FootballTeam> gamesComparator = new WonGamesComparator()
                                                .thenComparing(new DrawGamesComparator())
                                                .thenComparing(new LostGamesComparator().reversed());
        sortAndPrint(footballTeamsList, gamesComparator);
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Goals amount comparator");
        Comparator<FootballTeam> goalsComparator = new ScoredGoalsComparator()
                                                .thenComparing(new NotScoredGoalsComparator().reversed());        
        sortAndPrint(footballTeamsList, goalsComparator);
        
        
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("Scores comparator");
        Comparator<FootballTeam> scoreComparator = new ScoreComparator();
        sortAndPrint(footballTeamsList, scoreComparator);
        
        
        
    }
    
    public static void sortAndPrint(ArrayList<FootballTeam> footballTeamsList, Comparator<FootballTeam> comparator) {
        ArrayList<FootballTeam> list = new ArrayList<>(footballTeamsList);
        list.sort(comparator);
        
        for(FootballTeam team: list) {
            System.out.printf("%10s: %s \n", team.getName(), team.getResult());            
        }
    }
}
