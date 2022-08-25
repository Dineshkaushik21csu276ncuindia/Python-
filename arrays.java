import java.util.Scanner;

public class arrays {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value u want to check");
    int a = sc.nextInt();
    int count = 0;
    int arr[] = {1,2,3,4,5,6,7,8,9,0};
    for(int i = 0; i<arr.length;i++){
        if(a == arr[i]){
count+=1;
        }
    }
    if(count >=1){
        System.out.println("The value is present");
    }
    else{
        System.out.println("The value is not present");
    }
}
}