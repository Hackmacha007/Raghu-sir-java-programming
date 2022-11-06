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


    //USED IN Q29
    //To return after converting the first character of every word into small and remaining capital in string.
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


    //USED IN Q29
    //To return after converting the last character of every word into capital and remaining small in string.
    public static String convertEveryWordsLastCharacterToSmall(String str) { 
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

}