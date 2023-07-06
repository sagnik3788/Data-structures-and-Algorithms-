//Brute force approach
    public static  int secondLargest(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        for (int i =0;i<arr.length;i++){
            if(largest!=arr[i]){
                secondLargest=Math.max(secondLargest,arr[i]);
            }
        }
        
        return secondLargest;
    }
//Efficient approach
 public static  int secondLargest(int arr[]){
        if(arr.length==0){
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
