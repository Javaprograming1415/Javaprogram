import java.util.Scanner;

class CricketPlayer {
    int pid;
    String pname;
    int totalRuns;
    int inningsPlayed;
    int notOutTimes;

  
    public CricketPlayer(int pid, String pname, int totalRuns, int inningsPlayed, int notOutTimes) {
        this.pid = pid;
        this.pname = pname;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
        this.notOutTimes = notOutTimes;
    }


    public double getAverage() {
        if (inningsPlayed == 0) {
            return 0;
        }
        return (double) totalRuns / inningsPlayed;
    }

    
    public void displayDetails() {
        System.out.println("Player ID: " + pid);
        System.out.println("Player Name: " + pname);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Innings Played: " + inningsPlayed);
        System.out.println("Not Out Times: " + notOutTimes);
        System.out.println("Average Runs: " + getAverage());
    }
}

public class CricketPlayerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");
            System.out.print("Player ID: ");
            int pid = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Player Name: ");
            String pname = scanner.nextLine();

            System.out.print("Total Runs: ");
            int totalRuns = scanner.nextInt();

            System.out.print("Innings Played: ");
            int inningsPlayed = scanner.nextInt();

            System.out.print("Not Out Times: ");
            int notOutTimes = scanner.nextInt();
            scanner.nextLine();

            players[i] = new CricketPlayer(pid, pname, totalRuns, inningsPlayed, notOutTimes);
        }

        
        CricketPlayer maxAveragePlayer = players[0];
        for (int i = 1; i < n; i++) {
            if (players[i].getAverage() > maxAveragePlayer.getAverage()) {
                maxAveragePlayer = players[i];
            }
        }

        System.out.println("\nPlayer with the maximum average:");
        maxAveragePlayer.displayDetails();

        scanner.close();
    }
}
