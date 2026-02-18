package CollegeAssignments.Ass1;

import java.util.Scanner;

public class prblm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance(in meters)");
        int dist= sc.nextInt();
        System.out.println("Enter The Time Taken :");
        System.out.println("Hours: ");
        int h= sc.nextInt();
        System.out.println("Minutes: ");
        int m=sc.nextInt();
        System.out.println("Seconds: ");
        int s= sc.nextInt();
        // Convert total time into seconds
        int totalSeconds = (h * 3600) + (m * 60) + s;

        if (totalSeconds == 0) {
            System.out.println("Time cannot be zero.");
            return;
        }

        // Speed in meters per second
        double speedMps = dist / totalSeconds;

        // Speed in km per hour
        double speedKmph = speedMps * 3.6;

        // Speed in miles per hour
        double speedMph = speedMps * 2.23694;

        System.out.println("Speed in m/s: " + speedMps);
        System.out.println("Speed in km/h: " + speedKmph);
        System.out.println("Speed in mph: " + speedMph);

        sc.close();
    }
}















