class Calculator{
        public int add(int a,int b){
            return a+b;
        }
        public double add(double a,double b){
            return a+b;  
        }
        public int add(int a,int b,int c){
            return a+b+c;
        }

}
public class T1{
    public static void main(String[] args){
        Calculator calculator=new Calculator();
        int sum1=calculator.add(10, 20);
        double sum2=calculator.add(10,20);
        int sum3=calculator.add(10,20,30);
        System.out.println("sum of two interger:"+sum1);
        System.out.println("sum of two doubles:"+sum2);
        System.out.println("sum of three integers:"+sum3);
        
        
    }
    
}
