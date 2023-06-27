import java.util.Arrays;

public class MergeSorted {

    //function that reverses a string
    public static int[] MergeSortedArrays(int[] array, int[] secondArray){
        //Brute Force Approach
        int l1 = array.length;
        int l2 = secondArray.length;
        int i = 0;
        int j = 0;
        int k = 0;
        
        int[] thirdArray = new int[l1+l2];
        
        //Adding elements from first array to the newly created third array
        
        while (i < l1){
            thirdArray[k] = array[i]; 
            k++;
            i++;
        }
        
        //Adding elements from second array to the third array
        while (j < l2){
            thirdArray[k] = secondArray[j];
            k++;
            j++;
        }
        
        //Sort the third Array
        Arrays.sort(thirdArray);
        
        return thirdArray;
        
      

        }
        
        public static void main(String[] args){
        int[] arr = MergeSortedArrays(new int[]{1,1,8,9,10}, new int[]{1,2,8,9,11,15,16});
        Arrays.stream(arr).forEach(System.out::println);
    }

    //Better Approach
    import java.util.Arrays;

public class MergeSorted {

    //function that reverses a string
    public static int[] MergeSortedArrays(int[] array, int[] secondArray){
        //Brute Force Approach
        int l1 = array.length;
        int l2 = secondArray.length;
        int i = 0;
        int j = 0;
        int k = 0;
        
        int[] thirdArray = new int[l1+l2];
        
        while (i < l1 && j < l2){
            if (array[i] < secondArray[j]){
                thirdArray[k] = array[i];
                i++;
                k++;
                
            if (array[i] > secondArray[j]){
                thirdArray[k] = secondArray[k];
                j++;
                k++;
            }
            
            
            }
            
            //Add remaining elements from first array into the third array
            
            while (i < l1){
                thirdArray[k++] = array[i++];
            }
            
            //Add remaining elements from second array into the third array
            
            while (j < l2){
                thirdArray[k++] = secondArray[j++];
            }
            
            
        
            
        }
        
        //Sort the third Array
        Arrays.sort(thirdArray);
        
        return thirdArray;
        
      

        }
        
        public static void main(String[] args){
        int[] arr = MergeSortedArrays(new int[]{1,1,8,9,10}, new int[]{1,2,8,9,11,15,16});
        Arrays.stream(arr).forEach(System.out::println);
    }



    }




    }
