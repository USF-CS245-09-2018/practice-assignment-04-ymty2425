public class SelectionSort implements SortingAlgorithm{
    
    public void sort(int[] a){
        for(int i =0; i<a.length-1;i++){
            swap(i,find_min(i,a), a );
        }
    }
    public void swap(int b, int c, int [] a){
        int temp = a[b];
        a[b] =a[c];
        a[c] = temp;
    }

    public int find_min(int from, int[] a){
        int min = from;
        for(int i = from+1; i<a.length; i++){
            if(a[i]<a[min]) {
                min = i;
            }
        }
        return min;
    }
}