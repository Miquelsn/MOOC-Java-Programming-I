import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    public static int smallest(int[] array){
        // write your code here
        int min=array[0];
        for (int num : array) {
            if(min>num){
                min=num;
            }
        }
        return min;
    }
    public static int indexOfSmallest(int[] array){
        // write your code here
        int min=array[0];
        int index=0;
        int i=0;
        for (int num : array) {
            if(min>num){
                min=num;
                index=i;
            }
            i++;
        }
        return index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int min=table[startIndex];
        int index = startIndex;
        for(int i = startIndex; i<table.length; i++){
            if(table[i]<min){
                min=table[i];
                index=i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int aux = array[index1];
        array[index1]=array[index2];
        array[index2]=aux;
    }
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for(int i = 0; i<array.length; i++){
            swap(array, i, indexOfSmallestFrom(array,i));
            System.out.println(Arrays.toString(array));
        }


    }

}
