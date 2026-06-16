package dsa01_Warmup;


//Time complexity-O(1)
//Space complexity-O(1)

public class W04_TimeConversion {

    public static int[] secondsToHMS(int totalSeconds) {
        int hours,minutes,seconds;
        int[] time=new int[3];
        int temp=0;
        hours=totalSeconds/3600;
        temp=totalSeconds-hours*3600;
        minutes=temp/60;
        temp=temp-minutes*60;
        seconds=temp;

        //alternative logic
        // int hours = totalSeconds / 3600;
        // int remaining = totalSeconds % 3600;
        // int minutes = remaining / 60;
        // int seconds = remaining % 60;

        time[0]=hours;
        time[1]=minutes;
        time[2]=seconds;

        return time;
    }

    public static void main(String args[])
    {
        int totalSeconds=3661;
        if(totalSeconds>=0)
        {
        int[] result=secondsToHMS(totalSeconds);
        System.out.println("["+result[0]+","+result[1]+","+result[2]+"]");
        }
        else
        {
            System.out.println("Enter a non negative value");
        }

    }

    
}
