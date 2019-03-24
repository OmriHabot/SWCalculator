import chn.util.*;
public class Main
{
    public static void main(String[] args)
    {
        ConsoleIO keyboard = new ConsoleIO();
        SWCalculator calc;
        int input = 1;
        double time = 0;
        int star = 0;
        int level = 1;
        int energy = 1;
        double monXP = 0;
        int rounds = 0, totalRounds = 0;
        double xp = 1;
        int totalEnergy = 0;
        
        System.out.print("XP earned per round: ");
        xp = keyboard.readDouble();
        System.out.print("Energy used per round: ");
        energy = keyboard.readInt();
        System.out.print("Time for completion per round in minutes: ");
        time = keyboard.readDouble() + 0.083;
        System.out.println();
        
        calc = new SWCalculator(xp, energy, time);
        
        while(input == 1)
        {
            System.out.print("Star rating of your monster: ");
            star = keyboard.readInt();
            while(star < 1 || star > 6)
            {
                System.out.print("Invalid number. Enter an integer between 1 and 6: ");
                star = keyboard.readInt();
            }
            
            System.out.print("Enter the current level of your monster: ");
            level = keyboard.readInt();
            while(level < 1 || level > (10 + (5 * star)))
            {
                System.out.print("Invalid number. Enter an integer between 1 and " + (10 + (5 * star)) + ": ");
                level = keyboard.readInt();
            }
            System.out.print("Current monster XP: ");
            monXP = keyboard.readInt();
            
            rounds = (int)Math.ceil((calc.maxLevel(star, level, monXP))/xp);
            totalRounds += rounds;
            totalEnergy += rounds*energy;
            System.out.println("\nYou need to play " + rounds + " more rounds (" + (rounds*energy) + 
                               " energy) to get your monster to MAX level.");
            System.out.print("\nContinue? (1) Yes, (2) No: ");
            input = keyboard.readInt();
            System.out.println();
        }
        
        System.out.print("Total rounds: " + totalRounds + "\nTotal energy needed: " + totalEnergy + "\nEstimated time of completion: " +
                         (int)(time*totalRounds) + " minutes and " + (int)(((time*totalRounds)%1)*60) + " seconds.");
    }
}
