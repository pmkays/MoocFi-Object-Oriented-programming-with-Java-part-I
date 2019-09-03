
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) 
    {
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        NHLStatistics.searchByPlayer("Sidney Crosby");
        NHLStatistics.teamStatistics("PHI");
        
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
        
//        Print the top ten players based on goals
//Print the top 25 players based on penalty amounts
//Print the statistics for Sidney Crosby
//Print the statistics for Philadelphia Flyers (abbreviation: PHI). Note in which order the players are printed in and why that might be!
//Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
    }
}
