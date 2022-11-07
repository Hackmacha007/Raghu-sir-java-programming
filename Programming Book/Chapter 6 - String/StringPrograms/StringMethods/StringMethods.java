package StringMethods;

public class StringMethods {
    //USED IN Q1, Q2, Q14, Q15
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


    //USED IN Q2, Q3, Q13, Q15
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


    //USED IN Q4, Q6, Q8, Q11, Q16, Q18
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


    //USED IN Q8, Q10, Q17, Q18
    //To return the count of capital consonants present in the string
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


    //USED IN Q5, Q6, Q9, Q10, Q17, Q19
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


    //USED IN Q9, Q11, Q16, Q19
    //To return the count of small consonants present in the string
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
    //To return the count of consonants present in the string
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


    //USED IN Q12, Q20
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


    //USED IN Q12, Q13, Q14, Q15, Q16, Q17, Q18, Q19
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


    //USED IN Q20
    //To return the count of digits present in the string
    public static int countDigits(String str) {
        int count=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='0' && ch<='9') {
                count++;
            }
        }

        return count;
    }


    //USED IN Q24, Q34
    //To convert and return the lowercased string
    public static String convertToLowercase(String str) {
        String string = "";
       
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z') {
                string = string + (char)(ch+32);
            }
            else {
                string = string + ch;
            }
        }

        return string;
    }


    //USED IN Q25, Q33
    //To convert and return the uppercased string
    public static String convertToUppercase(String str) {
        String string = "";
       
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z') {
                string = string + (char)(ch-32);
            }
            else {
                string = string + ch;
            }
        }
        
        return string;
    }


    //USED IN Q26
    //To return after the conversion of vowels to lowercase and remaining to capital from a string.
    public static String convertVowelsToSmallRemainingCapital(String str) {
        String string = "";
       
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                string = string + (char)(ch+32);
            }
            else {
                if((ch>='a' && ch<='z') && ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                    string = string + (char)(ch-32);
                }
                else {
                    string = string + ch;
                }
            }
        }
        
        return string;
    }


    //USED IN Q27
    //To return after the conversion of vowels to uppercase and remaining to small from a string.
    public static String convertVowelsToCapitalRemainingSmall(String str) {
        String string = "";
       
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                string = string + (char)(ch-32);
            }
            else {
                if((ch>='A' && ch<='Z') && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
                    string = string + (char)(ch+32);
                }
                else {
                    string = string + ch;
                }
            }
        }
        
        return string;
    }


    //USED IN Q28
    //To return after converting the first character of every word into capital and remaining small in string.
    public static String convertEveryWordsFirstCharacterToCapital(String str) { 
        char[] ch = str.toCharArray();
        
        for(int i=0; i<ch.length; i++) {
            if(i==0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1]==' ') {
                if(ch[i]>='a' && ch[i]<='z') {
                    ch[i] = (char) (ch[i]-32);
                }
                else if(ch[i]>='A' && ch[i]<='Z'){
                    ch[i] = (char) (ch[i]+32);                    
                }
            }
        }
        return new String(ch);
    }


    //USED IN Q29
    //To return after converting the first character of every word into small and remaining capital in string.
    public static String convertEveryWordsFirstCharacterToSmall(String str) {
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++) {
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
                if(ch[i]>='A' && ch[i]<='Z') {
                    ch[i] = (char) (ch[i]+32);
                }
            }
            else if(ch[i]>='a' && ch[i]<='z') {
                ch[i] = (char) (ch[i]-32);
            }
        }
        return new String(ch);
    }


    // USED IN Q30
    // TO return the string after converting every words last character small and remaining capital.
    public static String convertEveryWordsLastCharacterToSmall(String str) {
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++) {
            if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ') {
                if(ch[i]>='A' && ch[i]<='Z') {
                    ch[i] = (char) (ch[i]+32);
                }
            }
            else if(ch[i]>='a' && ch[i]<='z') {
                ch[i] = (char) (ch[i]-32);
            }
        }
        return new String(ch);
    }


    // USED IN Q31
    // TO return the string after converting every words last character capital and remaining small.
    public static String convertEveryWordsLastCharacterToCapital(String str) {
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++) {
            if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ') {
                if(ch[i]>='a' && ch[i]<='z') {
                    ch[i] = (char) (ch[i]-32);
                }
            }
            else if(ch[i]>='A' && ch[i]<='Z') {
                ch[i] = (char) (ch[i]+32);
            }
        }
        return new String(ch);
    }


    //USED IN Q32
    //To return the sum of digits present in the string.
    public static int sumOfDigitsOfString(String str) {
        int sum=0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='0' && ch<='9') {
                sum = sum + ch-48;
            }
        }

        return sum;
    }


    //USED IN Q35
    //To print the frequency of each character in given string
    public static void countFrequencyOfCharacters(String str) {
        int[] count = new int[26];

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z') {
                count[ch-65]++;
            }
            else if(ch>='a' && ch<='z') {
                count[ch-97]++;
            }
        }

        for(int i=0; i<count.length; i++) {
            if(count[i] != 0) {
                System.out.println((char)(i+65) + " --> " + count[i]);
            }
        }
    }


    //USED IN Q36
    //To return the reversed string.
    public static String reverseString(String str) {
        String revString = "";

        for(int i=str.length()-1; i>=0; i--) {
            char ch = str.charAt(i);
            revString = revString + ch;
        }

        return revString;
    }
  

    //USED IN Q37
    //To check if the string is palindrome or not
    public static boolean isStringPalindrome(String str) {
        int i=0, j=str.length()-1;

        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }


    //USED IN Q38
    //To return after swiping every words first character with the last character of same word in string
    public static String swipeWordsFirstCharWithLastChar(String str) {
        char[] ch = str.toCharArray();

        for(int i=0; i<str.length(); i++) {
            
        }

        return new String(ch);
    }
    



/////////////////////////////////////////////////////////////////////////////////////////
////                    DANGER ZONE - CODE BELOW THIS LINE                          /////
////            MAYBE DOESN'T WORK OR NOT NEEDED AT THE MOMENT                      /////
/////////////////////////////////////////////////////////////////////////////////////////


/*
Hi, Stranger! 
What are you doing here?
You are not supposed to be here.
You may find code here that doesn't work or is not needed at the moment.
*/











//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~//

/////////////////////////////////////////////////////////////////////////////////////////
////                                2ND METHODS                                     /////
////                      CAN BE USED INSTEAD OF CURRENT ONE                        /////
/////////////////////////////////////////////////////////////////////////////////////////

/*
CAN BE USED IN Q28 - LINE NO: 286
To return after converting the first character of every word into capital and remaining small in string.
public static String convertEveryWordsFirstCharacterToCapital(String str) { 
    String string = "";
    int count=0;

    for(int i=0; i<str.length(); i++) {
        char ch = str.charAt(i);

        if(count==0) {
            if(ch>='a' && ch<='z') {
                string = string + (char)(ch-32);
            }
            else {
                string = string + ch;
            }
            count++;
        }
        else {
            if(ch==' ') {
                string = string + ch;
                count=0;
            }
            else {
                if(ch>='A' && ch<='Z') {
                    string = string + (char)(ch+32);
                }
                else {
                    string = string + ch;
                }
            }
        }
    }

    return string;
}


CAN BE USED IN Q29 - LINE NO: 305
To return after converting the first character of every word into small and remaining capital in string.
public static String convertEveryWordsFirstCharacterToSmall(String str) { 
    String string = "";
    int count=0;

    for(int i=0; i<str.length(); i++) {
        char ch = str.charAt(i);

        if(count==0) {
            if(ch>='A' && ch<='Z') {
                string = string + (char)(ch+32);
            }
            else {
                string = string + ch;
            }
            count++;
        }
        else {
            if(ch==' ') {
                string = string + ch;
                count=0;
            }
            else {
                if(ch>='a' && ch<='z') {
                    string = string + (char)(ch-32);
                }
                else {
                    string = string + ch;
                }
            }
        }
    }

    return string;
}



*/

}