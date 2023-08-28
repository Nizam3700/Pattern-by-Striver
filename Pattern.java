import java.util.*;

class Pattern1{
    public static void pattern1(int n, int m){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern2{
    public static void pattern2(int n, int m){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern3{
    public static void pattern3(int n, int m){
        for (int i = 1; i <n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class Pattern4{
    public static void pattern4(int n, int m){
        for (int i = 1; i <n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class Pattern5{
    public static void pattern5(int n, int m){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern6{
    public static void pattern6(int n, int m){
        for (int i = 1; i <n; i++) {
            for (int j = 1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class Pattern7{
    public static void pattern7(int n, int m){
        for (int i = 0; i <n; i++) 
        {
            // space loop
            for (int j = 0; j<=n-i-1; j++) 
            {
                System.out.print(" ");
            }
            // star loop 
            for(int j = 0; j<=2*i+1; j++) 
            {
                System.out.print("*");
            }
            // Space loop 
            for (int j = 0; j <n-i-1; j++) 
            {
               System.out.print(" "); 
            }
            System.out.println();
        }
    }
}

class Pattern8{
    public static void pattern8(int n, int m){
        // System.out.println("Now we printing pattern8 :");
        for (int i = 0; i <n; i++) 
        {
            // space loop
            for (int j = 0; j<=i; j++) 
            {
                System.out.print(" ");
            }
            // star loop 
            for(int j = 0; j<=2*n-(2*i+1); j++) 
            {
                System.out.print("*");
            }
            // Space loop 
            for (int j = 0; j <i; j++) 
            {
               System.out.print(" "); 
            }
            System.out.println();
        }
    }
}

// Pattern9 is merge of pattern7 and pattern8
class Pattern9{
    public static void pattern9(int n,int m){
        Pattern7 obj7 = new Pattern7();
            obj7.pattern7(7, 5);
        
        Pattern8 obj8 = new Pattern8();
            obj8.pattern8(7, 5);
    }
} 

class Pattern10{
    public static void pattern10(int n, int m){
        // System.out.println("Now we printing pattern8 :");
        for (int i = 0; i <2*n-1; i++) 
        {   
            int stars =i;
            if(i >n) stars = 2*n - i;
            // star loop 
            for(int j = 0; j<=stars; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern11{
    public static void pattern11(int n,int m){
        int start = 1;
        for(int i=0;i<n;i++){
            if(i %2 == 0) start =1;
            else start = 0;
            for (int j=0;j<=i;j++){
                System.out.print(start);
                start = 1- start;
            }
            System.out.println();
        }
    }
}

class Pattern12{
    public static void pattern12(int n,int m){
        int space =  2 * (n - 1);
        for(int i=1;i<=n;i++){
            // numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // space 
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            // Number 
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println(space -= 2); 
        }
    }
}

class Pattern13{
    public static void pattern13(int n,int m){
        int num = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                num = num + 1;
                System.out.print(num + " " );
            }
            System.out.println();
        }
    }
}

class Pattern14{
    public static void pattern14(int n,int m){
        // String name = "A";
        for(int i=0;i<n;i++){
            for(char ch ='A';ch <='A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class Pattern15{
    public static void pattern15(int n, int m){
        for(int i=0; i<=n; i++){
            for(char ch='A'; ch<='A' + (n-i-1); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class Pattern16{
    public static void pattern16(int n, int m){
         for(int i=0; i<=n; i++){
            for(char ch='A'; ch<='A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class Pattern17{
    public static void pattern17(int n, int m){
        for(int i=0; i<n; i++){
            // Space 
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            // Charaters 
            char ch = 'A';
            int bp = (2*i+1)/2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j <= bp) ch++;
                else ch--;
            }   

            // Space 
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Pattern18{ 
    public static void pattern18(int n){
        for(int i=0; i<=n; i++){
            for(char ch= 'E'; ch<='E'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class Pattern19{
    public static void pattern19(int n, int m){
        int iniS =0;
        for(int i=0; i<n; i++){
            // stars
            for(int j=0; j<=n-i; j++){
                System.out.print("*");
            }

            // Space 
            for(int j=0; j<iniS; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j=0; j<=n-i; j++){
            System.out.print("*");
            }
            iniS += 2;  
            System.out.println();
        }

        iniS = 10;
        for(int i=0; i<n; i++){
             for(int j=0; j<=i; j++){
                System.out.print("*");
            }

            // Space 
            for(int j=0; j<iniS; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j=0; j<=i; j++){
            System.out.print("*");
            }
            iniS -= 2;  
            System.out.println();
        }
    }
}

class Pattern20{
    public static void pattern20(int n,int m){
        int spaces = 2*n - 2;
        for(int i=1; i<=2*n-1; i++){
            int stars = i;
            if(i > n) stars = 2*n - i;
            // stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            // spaces 
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // stars 
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i < n)spaces -= 2;
            else spaces += 2;

        }
    //     int iniS = 2*n -2;
    //     for(int i=0; i<=n; i++){
    //         for(int j=0; j<=i; j++){
    //             System.out.println("*");
    //         }
    //         for(int j=0; j<=iniS; j++){
    //             System.out.println("");
    //         }
    //         for(int j=0; j<=i; j++){
    //     }

    // }
    }
}

class Pattern21{
    public static void pattern21(int n, int m){
        for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){ 
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class Pattern22{
    public static void pattern22(int n, int m){
        for(int i=0; i<2*n - 1; i++){
            for(int j=0; j<2*n-1; j++){
                int top = i;
                int left = j;
                int right = (2*n -2);
                int down = (2*n -2);
                // System.out.print(n - min((top, down), min(left, right)));
            }
            System.out.println();
        }
    }
}

class Pattern {
    public static void main(String[] args) {

        // Pattern1 obj1 = new Pattern1();
        // obj1.pattern1(7, 5);

        // Pattern2 obj2 = new Pattern2();
        // obj2.pattern2(7, 5);

        // Pattern3 obj3 = new Pattern3();
        // obj3.pattern3(7, 5);

        // Pattern4 obj4 = new Pattern4();
        // obj4.pattern4(7, 5);

        // Pattern5 obj5 = new Pattern5();
        // obj5.pattern5(7, 5);

        // Pattern6 obj6 = new Pattern6();
        // obj6.pattern6(7, 5);

        // Pattern7 obj7 = new Pattern7();
        // obj7.pattern7(7, 5);

        // Pattern8 obj8 = new Pattern8();
        // obj8.pattern8(7, 5);

        // Pattern9 obj9 = new Pattern9();
        // obj9.pattern9(7, 5);

        // Pattern10 obj10 = new Pattern10();
        // obj10.pattern10(3, 5);

        // Pattern12 obj12 = new Pattern12();
        // obj12.pattern12(4, 5);

        // Pattern13 obj13 = new Pattern13();
        // obj13.pattern13(5, 5);

        // Pattern14 obj14 = new Pattern14();
        // obj14.pattern14(5, 5);

        // Pattern15 obj15 = new Pattern15();
        // obj15.pattern15(5, 5);

        // Pattern16 obj16 = new Pattern16();
        // obj16.pattern16(4, 4);

        // Pattern17 obj17 = new Pattern17();
        // obj17.pattern17(5, 5);

        // Pattern18 obj18 = new Pattern18();
        // obj18.pattern18(5);

        // Pattern19 obj19 = new Pattern19();
        // obj19.pattern19(5,5);

        // Pattern20 obj20 = new Pattern20();
        // obj20.pattern20(5,5);

        Pattern21 obj21 = new Pattern21();
        obj21.pattern21(7,7);

        // Pattern22 obj22 = new Pattern22();
        // obj22.pattern22(7,7);





    }
}