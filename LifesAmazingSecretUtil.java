import java.util.Scanner;
class LifesAmazingSecretUtil{

public static void main(String a[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Author");
String author=sc.nextLine();
System.out.println("Enter the Novelid");
int novelid=sc.nextInt();
System.out.println("noOfPages");
int noOfPages=sc.nextInt();
sc.close();
System.out.println(novelid);
LifesAmazingSecret lifes=new LifesAmazingSecret();
lifes.novelid=novelid;
lifes.author=author;
lifes.noOfPages=noOfPages;
System.out.println(lifes.novelid+" "+lifes.author+" "+lifes.noOfPages);
}

}
