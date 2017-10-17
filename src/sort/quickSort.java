package sort;

/**
 * @author alone95
 * @date 2017/10/17
 */
public class quickSort {
    /**
     * 快速排序
     *
     * 从数列中挑出一个元素，称为“基准”
     * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，
     * 该基准是它的最后位置。这个称为分割（partition）操作。
     * 递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。
     *
     */
    public static void main(String[] args) {
        int [] array =new int[]{5,9,1,9,5,3,7,6,1};
        quickSort(array,0,array.length-1);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void quickSort(int[]arrays,int begin,int end){
       if(begin<end){
           int key =arrays[begin];
           int i=begin;
           int j=end;
           while(i<j){
               while(i<j&&arrays[j]>key){
                   j--;
               }
               if(i<j){
                   arrays[i]=arrays[j];
                   i++;
               }
               while (i<j&&arrays[i]<key){
                   i++;
               }

               if(i<j){
                   arrays[j]=arrays[i];
                   j--;
               }
           }
           arrays[i]=key;
           quickSort(arrays,begin,i-1);
           quickSort(arrays,i+1,end);
       }
    }
}
