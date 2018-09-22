public class BubbleSort implements  SortingAlgorithm {
    
    public void sort(int[] a) {
        
        for(int j =0; j<a.length -1; j++) {
            for(int i = 0; i<a.length-1-j;i++) {
                if(a[i]>a[i+1]) {
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }

    }
}