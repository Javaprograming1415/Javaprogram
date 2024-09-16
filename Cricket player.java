import java.io*;
import java.util.scanner;
class cricketplayer{ 
int pid;
string name;
int totalrun;
int inningsplayed;
int notouttimes;
double average;
cricketplayer1(inypid,string pname,inttotalRuns,intinningsplayef,int notoutTimes){
  this.pid=pid;
  this.pname=pname;
  this.Inningsplayed=inningsplayed;
  this.notoutTimes=notoutTimes;
  this.average=(double)totalRuns/(inningsplayed-notoutTimes);
}
}
public class cricketplayer{
  public static void main(string[]args){
    scanner scanner=newscanner(sytem.in);
    system.out.print("enter the number of cricketplayer:");
    int n=scanner.nextInt();
    cricketplayer1[]player=new cricketplayer1[n];
    for(int i=0;i<n;i++){
      system.out.print\n("\nenter details for player"+(i+1)+":"];
       system.out.print("playerID:");
      int pid=scanner.nextInt();
      scanner.nextLine();
      system.out.print("playerName:");
      string pname=scanner.nextLine();
      system.out.print("TotalRuns:");
      inttotalRuns= scanner.nextInt();
      system.out.print("Inningsplayed:");
      int inningsplayed=scanner.nextInt();
      system.out.print("Not out Times:);
      int notoutTimes=scanner.nextInt();
      players[i]=New cricketplayer2(pid,pname,totalRuns,inningplayed,notoutTimes)
                                    }
    double maxAverage=0;name
    int maxAverageIndex=0;
    for(int i=0;i<n;i++){
      if(players[i].average>maxAverage){
        maxAverageIndex=i;
      }
        }
    system.out.println("/n player with the maximum average:");
    system.out.println("playerID:"+players[maxAverage-Index]pid);
    system.out.println("playerName:"+ players[maxAverageIndex].pname);
    system.out.println("Average:"+players[maxAverageIndex].average); 
  scanner.close();
        }
}
