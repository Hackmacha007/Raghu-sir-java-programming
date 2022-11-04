package StringMethods;

public class StringMethods {
    //USED IN Q1, Q2
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


    //USED IN Q2, Q3
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


    //USED IN Q4, Q6
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


    //USED IN Q5, Q6, Q7
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


    //USED IN Q7
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


    //USED IN Q8
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


}


/////////////////////////////////////////////////////////////////////////////////////////
////    DANGER ZONE - MAYBE THIS CODE DOESN'T WORK OR NOT NEEDED AT THE MOMENT      /////
/////////////////////////////////////////////////////////////////////////////////////////

// //USED IN Q8
// //To return the count of vowels present in the string
// public static int countVowels(String str) {
//     int count=0;

//     for(int i=0; i<str.length(); i++) {
//         char ch = str.charAt(i);
//         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
//             count++;
//         }
//     }

//     return count;
// }