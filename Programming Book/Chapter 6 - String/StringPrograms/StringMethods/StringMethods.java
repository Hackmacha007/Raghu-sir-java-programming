package StringMethods;

public class StringMethods {
    //USED IN Q1, Q2,
    //To return the count of capital letters present in the string
    public static int countCapitalLetters(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z') {
                count++;
            }
        }

        return count;
    }


    //USED IN Q2, Q3, Q13
    //To return the count of small letters present in the string
    public static int countSmallLetters(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z') {
                count++;
            }
        }

        return count;
    }


    //USED IN Q4, Q6, Q8, Q11
    //To return the count of capital vowels present in the string
    public static int countCapitalVowels(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                count++;
            }
        }

        return count;
    }


    //USED IN Q8, Q10
    //To return the count of consonants present in the string
    public static int countCapitalConsonants(String str) {
        int count=0;
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
    
            if(ch>='A' && ch<='Z') {
                if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
                    count++;
                }
            }
        }
        
        return count;
    }


    //USED IN Q5, Q6, Q9, Q10
    //To return the count of small vowels present in the string
    public static int countSmallVowels(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }

        return count;
    }


    //USED IN Q9, Q11
    //To return the count of consonants present in the string
    public static int countSmallConsonants(String str) {
        int count=0;
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch>='a' && ch<='z') {
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                    count++;
                }
            }
        }
        
        return count;
    }


    //USED IN Q7
    //To return the count of vowels present in the string
    public static int countVowels(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                count++;
            }
        }

        return count;
    }

    
    //USED IN Q7
    //To return the count of vowels present in the string
    public static int countConsonants(String str) {
        int count=0;
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z') {
                if(ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
                    count++;
                }
            }
            else if(ch>='a' && ch<='z') {
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                    count++;
                }
            }
        }
        
        return count;
    }


    //USED IN Q12
    //To return the count of letters present in the string
    public static int countLetters(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z') {
                count++;
            }
        }

        return count;
    }


    //USED IN Q12
    //To return the count of special characters present in the string
    public static int countSpecialCharacters(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>=0 && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch<=96 || ch>=123 && ch<=127) {
                count++;
            }
        }

        return count;
    }

}


/////////////////////////////////////////////////////////////////////////////////////////
////                    DANGER ZONE - CODE BELOW THIS LINE                          /////
////            MAYBE DOESN'T WORK OR NOT NEEDED AT THE MOMENT                      /////
/////////////////////////////////////////////////////////////////////////////////////////


/*
Hi, Stranger! 
What are you doing here?
You are not supposed to be here.
This is a dangerous zone.
You may find code here that doesn't work or is not needed at the moment.

If you are here to help me or need my help, 
Contact me at: 
    Telegram: sandeep_patel07
*/