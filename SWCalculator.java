import java.applet.*;

public class SWCalculator extends Applet
{
    private int[] star1 = {0,460,516,579,650,728,818,918,1029,1155,1296,1455,1631,1831,2054}; //holds all XP values for 1 star mons
    private int[] star2 = {0,552,619,695,779,875,981,1102,1235,1386,1555,1745,1958,2197,2465,2765,3103,3481,3906,4423}; //holds all XP values for 2 star mons
    private int[] star3 = {0,662,743,834,936,1049,1178,1321,1483,1663,1866,2094,2350,2636,2957,3319,3723,4178,4687,5307,6009,6802,7703,8720,9962}; //holds all XP values for 3 star mons
    private int[] star4 = {0,796,892,1002,1124,1261,1415,1587,1781,1998,2243,2515,2823,3167,3553,3987,4473,5019,5631,6376,7219,8172,9254,10476,11969,13673,15619,17844,20386,23495}; //holds all XP values for 4 star mons
    private int[] star5 = {0,952,1068,1199,1344,1509,1693,1899,2131,2392,2682,3010,3378,3789,4252,4770,5352,6006,6738,7628,8638,9779,11072,12535,14321,16360,18690,21350,24392,28113,32404,37348,43048,49617,57188}; //holds all XP values for 5 star mons
    private int[] star6 = {0,1150,1290,1447,1624,1823,2044,2294,2574,2888,3240,3635,4079,4576,5135,5762,6464,7252,8138,9214,10431,11811,13371,15140,17296,19758,22572,25786,29458,33954,39134,45107,51990,59924,69068,76085,83816,92332,101712,112046}; //holds all XP values for 6 star mons
    private double time = 0;
    private int star = 0;
    private int level = 1;
    private int energy = 1;
    private int monXP = 0;
    private int rounds = 0, totalRounds = 0;
    private double xp = 1;
    private int totalEnergy = 0;
    
    public SWCalculator(double myXp, int myEnergy, double myTime)
    {
        xp = myXp;
        energy = myEnergy;
        time = myTime;
    }
    
    public int maxLevel(int star, int level)
    {
        int xp = 0;
        if(star < 1 || star > 6)
            throw(new IllegalArgumentException("Star value is not between 1 and 6"));
            
        switch(star)
        {
            case 1:
                for(int i = level; i < star1.length; i++)
                    xp+=star1[i];
                break;
            case 2:
                for(int i = level; i < star2.length; i++)
                        xp+=star2[i];
                break;
            case 3:
                for(int i = level; i < star3.length; i++)
                    xp+=star3[i];
                break;
            case 4:
                for(int i = level; i < star4.length; i++)
                    xp+=star4[i];
                break;
            case 5:
                for(int i = level; i < star5.length; i++)
                    xp+=star5[i];
                break;
            case 6:
                for(int i = level; i < star6.length; i++)
                    xp+=star6[i];
                break;
        }
        
        return xp;
    }
    
    
}
