// Tourist

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int w = scan.nextInt();
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();
        int a2 = scan.nextInt();
        int b2 = scan.nextInt();
        int a3 = scan.nextInt();
        int b3 = scan.nextInt();

        if((a1<=w && b1>=k) || (a2<=w && b2 >=k) || (a3<=w && b3>=k) || ((a1+a2)<=w && (b1+b2)>=k) || (
                (a1+a3)<=w && (b1+b3)>=k) || ((a3+a2)<=w && (b3+b2)>=k) || ((a1+a2+a3)<=w && (b1+b2+b3)>=k))
            System.out.println("YES");
        else System.out.println("NO");

    }
}


// Exchange

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t, k;
        t =scan.nextInt();
        String[] arr = {"GCV", "VGC", "CVG"};
        while(t>0){
            k = scan.nextInt();
            System.out.println(arr[k%3]);
            t--;
        }
    }
}



// The level of educational achievements


import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] arr = {"Initial", "Average", "Sufficient", "High"};

        int k = scan.nextInt();
        System.out.println(arr[(k-1)/3]);
    }
}


// First or last?

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        if(k/100 > k%10) System.out.println(k/100);
        else if(k%10 > k/100) System.out.println(k%10);
        else System.out.println("=");
    }
}


// Season

import java.util.Scanner;

public class Learning {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        if(k<3 || k==12) System.out.println("Winter");
        else if(k<6) System.out.println("Spring");
        else if(k<9) System.out.println("Summer");
        else System.out.println("Autumn");
    }
}


// Wardrobe

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Learning {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++)arr[i] = scan.nextInt();
        sort(arr);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int t;

        if(x>y){
            t=x; x=y; y=t;
        }
        if(arr[0]<=x && arr[1]<=y) System.out.println("YES");
        else System.out.println("NO");


    }

}


// Even and odd numbers

import java.util.Scanner;

public class Learning {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        if(x%2==0 && (y%2!=0 || z%2!=0)) System.out.println("YES");
        else if(x%2!=0 && (y%2==0 || z%2==0)) System.out.println("YES");
        else System.out.println("NO");


    }

}


// IP-address

// Sum of odd numbers

// New Sergey's game