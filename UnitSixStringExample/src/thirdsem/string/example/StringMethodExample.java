package thirdsem.string.example;

public class StringMethodExample {
    public static void main(String[] args) {
        // String method example
        // 1. equals() and equalsIgnoreCase()
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hi";
        String s4 = "HELLO";
        
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
        
        /** 2. regionMatches()
        * two way of doing it.
        * 1. comparing string only
        * syntax one
        * boolean regionMatches(int startIndex, String str2, int str2StartIndex,
        * int numChars)
        * 2. comparing with ignore case
        * syntax two
        * boolean regionMatches(boolean ignoreCase, int startIndex, String str2,
        * int str2StartIndex, int numChars)
        */
        String case_one = "This is a case one";
        String case_two = "This is a CASE two";
        int startOneFrom = 10; // case one index number
        int startTwoFrom = 10; // case two index number
        int numChar = 4; // number of characters
        System.out.println("Case One: " + 
        case_one.regionMatches(startOneFrom, case_two, startTwoFrom, numChar));
        
        System.out.println("Case Two: " + 
        case_one.regionMatches(true, startOneFrom, case_two, startTwoFrom, numChar));
        
        
        /**
         * 3. startsWith() and endsWith()
         * startsWith() - returns true if any string starts with specified substring
         * endsWith() - returns true if any string ends with specified substring
         */
        String email = "info@dav.com.np";
        String yahoo = "dav.course@yahoo.com";
        
        System.out.println("Case One: " + email.startsWith("info"));
        System.out.println("Case Two: " + yahoo.endsWith("@yahoo.com"));
        
        /**
         * 4. compareTo()
         * returns int value
         */
        String message = "Happy International Labour Day";
        String msg_ss = "Happy International Labour Day";
        int status = message.compareTo(msg_ss);
        System.out.println("Result: " + status);
        
        /**
         * 5. indexOf() and lastIndexOf()
         * indexOf( ) -> searches for the first occurrence of a character or
         * substring.
         * lastIndexOf( ) -> searches for the last occurrence of a character or
         * substring
         * both method returns int value
         */
        String quote = "A friend need is a friend in deed";
        // will return first occurences of character and substring
        System.out.println(quote.indexOf("end"));
        System.out.println(quote.indexOf("ee"));
        System.out.println(quote.indexOf("i"));
        System.out.println(quote.indexOf(" "));
        
        // to get index of any character or substring after certain index
        System.out.println("index of ee after 15: " + quote.indexOf("ee", 15));
        System.out.println("index of i after 10: " + quote.indexOf("i", 10));
        // will return first occurences of character and substring from last index
        System.out.println("Last index of ee: " + quote.lastIndexOf("ee"));
        
        /**
         * 6. replace()
         * takes two parameter 1st old string and 2nd new string
         * replace old string with new string but with new string object
         */
        String character_name = "Dragon night";
        System.out.println("Actual String: " + character_name);
        System.out.println("Replaced String: " + 
                character_name.replace("night", "Knight"));
        System.out.println("After Replace Status of original String: " + 
                character_name);
        
        // 7. concat() - to combine two strings
        String order_code = "00-DAV-001";
        String customer = "Kiran Magar";
        System.out.println("Details: " + customer.concat(order_code));
        
        // 8. trim()
        // to remove white space before and after string
        String msg = "      Happy Birthday       ";
        System.out.println("Without Trim: " + msg);
        System.out.println("With Trim: " + msg.trim());
        
        // 9. toUpperCase() and toLowerCase()
        // toUpperCase() - converts all alphabetical characters to Capital letter
        // toLowerCase() - converts all alphabetical characters to Small letter
        String username = "DavAdmin";
        System.out.println("Upper Case: " + username.toUpperCase());
        System.out.println("Lower Case: " + username.toLowerCase());
        
        // checking username
        if(username.trim().toLowerCase().equals("davadmin")){
            System.out.println("Is available");
        }
        
        // 10. valueOf() - converts internal form into human readable form
        String dob = "2024-01-22";
        int check = 10; 
        System.out.println("Date of Birth: " + dob.valueOf(check));
        // by class reference
        System.out.println("Date of Birth: "+ String.valueOf(dob));
    }
}
