import java.util.Scanner;

class ArrayDeleteElement{

    public static void delete(char ar[], int pos){
      for(int i=pos-1;i<ar.length-1;i++){
        ar[i]=ar[i+1];
      }
    }
    public static void main(String[] args){
        char arr[]=new char[6];
        arr[0]='a';
        arr[1]='b';
        arr[2]='y';
        arr[3]='c';
        arr[4]='d';
        arr[5]='e';

        System.out.println("Enter the position of the element that you want to delete:");
        Scanner sc=new Scanner(System.in);
        int pos=sc.nextInt();
        delete(arr,pos);

        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }


    }
}