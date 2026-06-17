package dsa01_Warmup;

//Time complexity-O(1)
//Space complexity-O(1)


public class W10_CollinearPoints {
    
    public static boolean areCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        if (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)==0)
            return true;
        else 
            return false;
        
    }

    public static void main(String args[]){
        boolean decision=areCollinear(1,1,2,2,3,3);
        if(decision==true)
            System.out.println("Are Collinear");
        else
            System.out.println("Not Collinear");

        
    }


    
}
