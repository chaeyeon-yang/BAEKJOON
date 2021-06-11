package Sort;

public class Insertion {
    public static void sort(Comparable[] a){
        int N=a.length;
        for (int i=1; i<N; i++){
            for (int j=i; j>0; j--){
                if (isLess(a[j],a[j-1]))
                    swap(a,j,j-1);
                else break;
            }
        }
        print(a);
    }
    public static void print(Comparable[] a){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    private static boolean isLess(Comparable i, Comparable j){
        return (i.compareTo(j)<0);
    }
    private static void swap(Comparable[] a, int i, int j){
        Comparable temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
