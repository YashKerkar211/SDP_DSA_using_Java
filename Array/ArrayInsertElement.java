public class ArrayInsertElement{
    public static void insert(String ar[], int pos, String val){
             for(int i=ar.length-1;i>=pos;i--){
                ar[i]=ar[i-1];
             }
             ar[pos-1]=val;
    }
    public static void main(String[] args){
        String arr[]=new String[6];
        arr[0]="Anish";
        arr[1]="Bhavesh";
        arr[2]="Chavan";
        arr[3]="Dinesh";
        arr[4]="Yash";

        insert(arr,3,"Mihir");
           //or
        //ArrayInsert.insert(arr,3,"Mihir");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}