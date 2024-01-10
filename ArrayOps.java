public class ArrayOps {
    public static void main(String[] args) 
    {
    int [] arr1 = {2, 2, 5, 7, 8, 8};
    //int [] arr2 = {2, 5};
    //System.out.println(findMissingInt(arr)); 
    //System.out.println(secondMaxValue(arr)); 
   //System.out.println(containsTheSameElements(arr1, arr2));  
   System.out.println(isSorted(arr1));
    }
    
    public static int findMissingInt (int [] array) 
    {
        int[] new_array = new int[array.length + 1];
       int missingInt = 0;
        for (int i = 0; i < new_array.length; i++)
        {
           new_array[i] = i;
        }
        for (int i = 0; i < new_array.length; i++)
        {
            boolean is_found = false;
            for (int j = 0; j < array.length; j++)
            {
                if (new_array[i] == array[j])
                {
                    is_found = true;
                }
                
            }
            if (is_found == false)
            {
                    missingInt = new_array[i];
                    break;
            }
        }
        return missingInt;
    }

    public static int secondMaxValue(int [] array) 
    {
        int max = array[0];
        int second_max = 0;
            for (int i = 1; i < array.length; i++)
            {
                if (array[i] > max) 
                {
                    max = array[i];
                }
            }
            for (int j = 0; j < array.length; j++)
            {
                if (array[j] > second_max && array[j] < max)
                {
                    second_max = array[j];
                }
            }


        return second_max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) 
    {
        boolean is_similar = false;
        boolean final_similar = true;
        if (array1.length > array2.length)
        {
            for (int i = 0; i < array1.length; i++)
            {
                for (int j = 0; j < array2.length; j++)
                {
                    is_similar = false;
                    if (array1[i] == array2[j])
                    {
                        is_similar = true;
                        break;  
                    }
                }
                if (is_similar == false)
                {
                    final_similar = false;
                    break;
                }
                
            }
        }
        else 
        {
          for (int i = 0; i < array2.length; i++)
            {
                for (int j = 0; j < array1.length; j++)
                {
                    is_similar = false;
                    if (array2[i] == array1[j])
                    {
                        is_similar = true;
                        break;  
                    }
                }
                if (is_similar == false)
                {
                    final_similar = false;
                    break;
                }  
            }
        }
        return final_similar;
    }

    public static boolean isSorted(int [] array) 
    {
        boolean is_sorted = false;
        boolean decreasing = true;
        boolean increasing = true;
        for (int i = 0; i < array.length - 1; i++)
        {
            
            if (array[i] < array[i +1])
            {
                increasing = false;
                break;
            }
        }
       
        for (int i = 0; i < array.length - 1; i++)
        {

            if (array[i] > array[i +1]) 
            {
                decreasing = false;
                break;
            }
    
        }
        if (increasing || decreasing)
        {
            is_sorted = true;
        }

        return is_sorted;
    }

}
