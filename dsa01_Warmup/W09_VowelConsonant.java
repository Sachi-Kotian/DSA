package dsa01_Warmup;

//Time complexity-O(1)
//Space complexity-O(1)

public class W09_VowelConsonant {
    
    public static  String vowelOrConsonant(char ch) {

        char alpha=Character.toLowerCase(ch);
        if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o'  || alpha =='u' )
            return "Vowel";
        else
            return "Consonant";
        
    }

    public static void main(String args[])
    {
        System.out.println(vowelOrConsonant('z'));
    }

    

    
}
