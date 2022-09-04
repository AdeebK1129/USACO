import java.util.Scanner;
class basketballoneonone{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String gameLog = sc.nextLine();
        char winner = gameLog.charAt(gameLog.length()-2);
        System.out.println(winner);
    }
}