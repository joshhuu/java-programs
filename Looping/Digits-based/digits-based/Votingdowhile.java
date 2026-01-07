import java.util.*;

public class Votingdowhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vote;
        int dmkcount = 0, admkcount = 0, tvkcount = 0, bjpcount = 0;

        do {
            System.out.println("\n1.DMK\n2.ADMK\n3.TVK\n4.BJP\nEnter -1 to stop voting");
            vote = sc.nextInt();

            switch (vote) {
                case 1:
                    dmkcount++;
                    break;
                case 2:
                    admkcount++;
                    break;
                case 3:
                    tvkcount++;
                    break;
                case 4:
                    bjpcount++;
                    break;
                case -1:
                    break;
                default:
                    System.out.println("Invalid vote");
            }

        } while (vote != -1);

        // Final results
        System.out.println("\n--- Voting Results ---");
        System.out.println("DMK Votes  : " + dmkcount);
        System.out.println("ADMK Votes : " + admkcount);
        System.out.println("TVK Votes  : " + tvkcount);
        System.out.println("BJP Votes  : " + bjpcount);

    }
}
