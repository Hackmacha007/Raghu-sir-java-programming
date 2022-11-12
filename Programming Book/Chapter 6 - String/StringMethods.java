import java.util.Scanner;

public class StringMethods {
    public static final Scanner sc = new Scanner(System.in);
    /*


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
            else if((ch>='a' && ch<='z') && ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') {
                string = string + (char)(ch-32);
            }
            else {
                string = string + ch;
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
            else if((ch>='A' && ch<='Z') && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U') {
                string = string + (char)(ch+32);
            }
            else {
                string = string + ch;
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
        char[] ch = str.toCharArray();

        for(int i=0; i<=ch.length/2; i++) {
            char temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }

        return new String(ch);
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
        int t=0;

        for(int i=0; i<str.length(); i++) {
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
                t=i;
            }    
            else if(i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ') {
                char temp = ch[i];
                ch[i] = ch[t];
                ch[t] = temp;
            }
        }

        return new String(ch);
    }


    //USED IN Q39
    //To return the count of words present in the string
    public static int countWords(String str) {
        char[] ch = str.toCharArray();
        int count=0;

        for(int i=0; i<ch.length; i++) {
            if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ') {
                count++;
            }
        }

        return count;
    }


    //USED IN Q40
    //To return the frequency of each character in given string
    public static int[] countFrequencyOfChars(String str) {
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

        return count;
    }
    //To check if the string is Anagram or not - USED IN Q40
    public static boolean isStringAnagram(String str1, String str2) {
        int[] countStr1 = countFrequencyOfChars(str1);
        int[] countStr2 = countFrequencyOfChars(str2);

        for(int i=0; i<26; i++) {
            if(countStr1[i] != countStr2[i]) {
                return false;
            }
        }

        return true;
    }
    

    //USED IN Q41
    //To return after reversing the word in the sentence
    public static String reverseTheWordsOfString(String str) {
        char[] ch = str.toCharArray();
        String revString = "";

        for(int i=0; i<ch.length; i++) {
            int k=i;
            while(i<ch.length && ch[i]!=' ') {
                i++;
            }

            int j=i-1;
            while(j>=k) {
                revString = revString + ch[j];
                j--;
            }

            if(i<ch.length) {
                revString = revString + ch[i];
            }
        }

        return revString;
    }


    //USED IN Q42
    //To return the string after reversing the sentence
    public static String reverseSentenceOfString(String str) {
        String revString = "";
        char[] ch = str.toCharArray();

        for(int i=ch.length-1; i>=0; i--) {
            int k=i;

            while(i>=0 && ch[i]!=' ') {
                i--;
            }

            int j=i+1;
            while(j<=k) {
                revString = revString + ch[j];
                j++;
            }

            if(i>=0) {
                revString = revString + ch[i];
            }
        }

        return revString;
    }


    //USED IN Q43
    //To print the count of characters present in the each word
    public static void countCharsPresentInTheWord(String str) {
        char[] ch = str.toCharArray();
        
        for(int i=0; i<ch.length; i++){
            String st = "";
            int count=0;

            while(true) {
                if(ch[i]==' ') {
                    break;
                }
                else if(i==ch.length-1) {
                    st = st + ch[i];
                    i++;
                    count++;
                    break;
                }
                else {
                    st = st + ch[i];
                    i++;
                    count++;
                }
            }

            System.out.println(st + " --> " + count);
        }
    }


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
