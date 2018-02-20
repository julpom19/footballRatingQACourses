/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparators;

import com.mycompany.footbalrating.FootballTeam;
import java.util.Comparator;

/**
 *
 * @author Julia
 */
public class GamesComparator implements Comparator<FootballTeam>{

    @Override
    public int compare(FootballTeam o1, FootballTeam o2) {
        return o1.getResult().getGamesAmount() - o2.getResult().getGamesAmount();
    }
    
}


