import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTester {

    /* 1st case: This is the example in the instructions PDF
    *  Ih helps in proving its functionality, note that there are 8 elements in the
    *  array, if test PASSED, it proves that the cycle of this sort algorithm is correct:
    *  right, right, left and left.*/
    @org.junit.jupiter.api.Test
    void sortOfSort1() {
        int arr[] = {2,7,1,3,0,9,6,5};

        SortOfSort a = new SortOfSort();

        a.sortOfSort(arr);

        int arr2[] = {6,5,1,0,2,3,7,9};

        assertArrayEquals(arr, arr2);
    }

    /*2nd case: There could be errors in an algorithm when you overlook
    * edge cases, like when the array only has one element and therefore
    * it is confusing to get its correct placement*/
    @org.junit.jupiter.api.Test
    void sortOfSort2() {
        int arr[] = {2};

        SortOfSort a = new SortOfSort();

        a.sortOfSort(arr);

        int arr2[] = {2};

        assertArrayEquals(arr, arr2);
    }

    /* 3rd: This test is an edge case, by having an empty array and
    *  therefore there are no elements to sort. */
    @org.junit.jupiter.api.Test
    void sortOfSort3() {
        int arr[] = {};

        SortOfSort a = new SortOfSort();

        a.sortOfSort(arr);

        int arr2[] = {};

        assertArrayEquals(arr, arr2);
    }

    /* 4th case: Another test case to help functionality. At the same time I was trying to look
    *  at the possibility when the array has an odd number of elements  */
    @org.junit.jupiter.api.Test
    void sortOfSort4() {
        int arr[] = {7,12,6,8,14,11,10};

        SortOfSort a = new SortOfSort();

        a.sortOfSort(arr);

        int arr2[] = {11,10,6,7,8,12,14};

        assertArrayEquals(arr, arr2);
    }

    /* 5th case: This case helps to assure the efficiency of the algorithm
    *  when the array has repeated elements. This could present problems when trying to
    *  search for the biggest element. Unfortunately the test was PASSED*/
    @org.junit.jupiter.api.Test
    void sortOfSort5() {
        int arr[] = {15,5,5};

        SortOfSort a = new SortOfSort();

        a.sortOfSort(arr);

        int arr2[] = {5,5,15};

        assertArrayEquals(arr, arr2);
    }

    /* 6th case: This case helps to assure the efficiency of the algorithm
     *  when the array has more than one repeated element. This could present problems when trying to
     *  search for the biggest element. Unfortunately the test was PASSED*/
    @org.junit.jupiter.api.Test
    void sortOfSort6() {
        int arr[] = {15,5,5,6,6,6,1};

        SortOfSort a = new SortOfSort();

        a.sortOfSort(arr);

        int arr2[] = {6,6,1,5,5,6,15};

        assertArrayEquals(arr, arr2);
    }
}
