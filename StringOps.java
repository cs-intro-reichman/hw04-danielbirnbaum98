public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String s = "    hello     world   ";
        char c = 'l';
        //System.out.println(allIndexOf(s, c));
        //System.out.println(capVowelsLowRest(s));
        System.out.println(camelCase(s));
    }

    public static String capVowelsLowRest (String string) 
    {
        String new_string = "";
        String vowels = "aeiouAEIOU";
        
        for (int i = 0; i < string.length(); i++)
        {
            Character c = string.charAt(i);
            if (vowels.indexOf(c) == -1 && (string.charAt(i) >= 'A') && (string.charAt(i) <= 'Z'))
            {
                c = (char)(c + 32);
            }
            else 
            {
                if ((vowels.indexOf(c) != -1)  && string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
                {
                    c = (char)(c - 32);
                }
            }
            new_string = new_string + c;
        }
        return new_string;
    }

    public static String camelCase (String string) 
    {
        String mod_string = "";
        String final_string = "";
        Character c;
       for (int i = 0; i < string.length(); i++)
       {
            c = string.charAt(i);
            if (c >= 'A' && c <= 'Z')
            {
            c = (char)(c - 32); 
            }
            mod_string = mod_string + c;
       }   
        while (mod_string.charAt(0) == 32 || string.charAt(mod_string.length() - 1) == 32)
        {
            if (mod_string.charAt(0) == 32)
            {
                mod_string = mod_string.substring(1);
            }
            if (mod_string.charAt(mod_string.length() - 1) == 32)
            {
               mod_string = mod_string.substring(0, mod_string.length() - 1);
            }
        }
        for (int i = 0; i < mod_string.length(); i++)
        {
            if (mod_string.charAt(i) == 32)
            {
                if (mod_string.charAt(i + 1) >= 'a' && mod_string.charAt(i + 1) <= 'z')
                {
                    final_string = final_string + " " +(char)(mod_string.charAt(i + 1) - 32);
                    i ++;
                }
            }
            else if (mod_string.charAt(i) >= 'a' && mod_string.charAt(i) <= 'z')
            {
                final_string = final_string + mod_string.charAt(i);
            } 
        }
        return final_string;
    }

    public static int[] allIndexOf (String string, char chr) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == chr)
            {
                counter ++;
            }
        }
        int[] indexes = new int[counter];
        int current_index = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == chr)
            {
                indexes[current_index] = i;
                current_index ++;
            }
        }
        return indexes;
    }
}
