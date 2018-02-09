/*==============================================================================
Zachary Hadjah                      February 9th, 2018
Junior Year                         Side Project

Description:
This program will take two array, one original and one array that will be compared 
to the original. The isRotated function will check to see if the length are both 
the same size for the elements. It will then check whether the array has been
rotated by checking the elements of the original from the first element to the 
last, while the other array will be checked from the last element up until the 
first.
==============================================================================*/
package isarrayrotated;
public class IsArrayRotated 
{

    public static void main(String[] args) 
    {
        int[] original = {0,1,2,3,4,5,6,7,8,9};
        int[] notRotated = {9,7,5,3,1,8,6,4,2,0};
        int[] rotatedArray = {9,8,7,6,5,4,3,2,1,0}; 
        boolean rotation;
        
        System.out.println("This program takes two arrays, compares them, and "
                + "determines whether the original array has been rotated and put "
                + "into another array. \nWatch what happens when the original "
                + "array = [0,1,2,3,4,5,6,7,8,9] is compared to an array  with contents: \n"
                + "[9,7,5,3,1,8,6,4,2,0]");
        
        rotation = isRotated(original, rotatedArray);
        if(rotation == true)
        {
        System.out.println("The original array has been rotated!");
        }else{
            System.out.println("The original array has not been rotated");
        }
        
        System.out.println("\n Watch what happens when the original array is ocmpared to an array"
                         + "with contents \n [9,8,7,6,5,4,3,2,1,0]");
        
        rotation = isRotated(original, rotatedArray);
        if(rotation == true)
        {
        System.out.println("The original array has been rotated!");
        }else{
            System.out.println("The original array has not been rotated");
        }
    }
    
    public static boolean isRotated(int[] original, int[] tempArray)
    {
        boolean isRotated = true;
        int inc = 1;
        
        while((original.length == tempArray.length) && (isRotated == true))
        {
            //loop to find all elements of original
            for(int i= 0; i<original.length;i++)
            {
                if(original[i] != tempArray[tempArray.length - inc])
                {
                    isRotated = false;
                }
                inc++;
            }
            break;
        }
        return isRotated;
    }
}
