package Task6;

public class Fibonachi {
    public static void main(String[] args){
        int a=1,b=1,c=0;
        System.out.print(a+" "+b+" ");
        for(int i=3;i<=11;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}

