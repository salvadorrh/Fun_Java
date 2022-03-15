class MergeSort {
    void merge(int arr[], int l, int m, int r){
        int n1 = m - l + 1;   //Find size of subarray 1
        int n2 = r - m;       //Find size of subarray 2

        int L[] = new int[n1]; //First temp array
        int R[] = new int[n2]; //Second temp array

        for(int i = 0; i < n1; i++)  //Copy data to first temp array
            L[i] = arr[l + i];

        for(int j = 0; j < n2; j++)  //Copy data to second temp array
            R[j] = arr[m + 1 + j];

        //Merge the temp arrays (in sorting order, obviously)
        int i = 0, j = 0;   //Pointers of temp arrays
        int k = l;          //Index of merged subarray

        while (i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1){     //Copy remaining elements of temp array 1 (just  in case)
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2){     //Copy remaining elements of temp array 2 (just in case)
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    //Sorts arr[l..r] using merge()
    void sort(int arr[], int l, int r){
        if (l < r){
            int m = (l+r)/2;

            sort(arr, l, m);        //Sort first half
            sort(arr, m+1, r);   //Sort second half

            merge(arr, l, m, r);    //Merge the sorted halves
        }
    }
}
