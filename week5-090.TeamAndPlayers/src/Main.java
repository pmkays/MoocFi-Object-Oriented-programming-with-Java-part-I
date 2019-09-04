public class Main 
{
    public static void main(String[] args) 
    {
//        Team barcelona = new Team("FC Barcelona");
//
//        Player brian = new Player("Brian");
//        Player pekka = new Player("Pekka", 39);
//        barcelona.addPlayer(brian);
//        barcelona.addPlayer(pekka);
//        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above
//
//        System.out.println("Total goals: " + barcelona.goals());
        
        Team j = new Team("SaPKo"); 
        Player p = new Player("Sasf"); 
        Player a = new Player ("gds");
        Player s = new Player ("asjkdh");
        j.addPlayer(p);
        j.addPlayer(a);
        j.addPlayer(s);
        
//        System.out.println("array size: " + j.getArraySize());
        
        j.printPlayers();
    }
}
