public class Calcii{
    int Addition(int a,int b){
     return(a+b);
    }
    int Subtract(int a,int b ){
        return(a-b);
    }
    int Multi(int a, int b){
        return(a*b);
    }
    int division(int a, int b){
        return(a/b);
    }
    public static void main(String args[]){
        Calcii c=new Calcii();
        int r=c.Addition(10,20);
        int r2=c.Subtract(20,1);
        int r3=c.Multi(10,2);
        int r4=c.division(10,2);
        System.out.println(r);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}