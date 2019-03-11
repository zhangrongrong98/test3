package aaa;
import java.util.Scanner;
public class aaaa {

	    static int number=10;                        
	    static int[] arr = new int[number];                           
	    public static void main(String[] args){                       
	    
	        System.out.println("请输入T1序列：");
	        Scanner in_t1 = new Scanner(System.in);
	        for(int i=0;i<number;i++)
	        {
	            arr[i]=in_t1.nextInt();
	        }
	        
	        System.out.println("T1数组：");
	        for(int i=0;i<number;i++)
	        {             
	           System.out.print("["+arr[i]+"]");
	         }

	    }
	    }	    