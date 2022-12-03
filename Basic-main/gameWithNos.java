// class Complete{
    
   
//     // Function for finding maximum and value pair
//     public static int[] game_with_number (int arr[], int n) {
//         // Complete the function
//         int[] arr1=new int[n];
//         arr1[n-1]=arr[n-1];
//         for(int i=0;i<n-1;i++){
//             arr1[i]=arr[i]^arr[i+1];
//         }
//         return arr1;
//     }
    
// }





class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i]^arr[i+1];
        }
        return arr;
    }
    
}

