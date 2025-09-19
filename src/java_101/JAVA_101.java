
package java_101;



public class JAVA_101 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] ages={1,2,3};
        int[] Ages =new int[3];
        double tax=0.2,total;
        Customer c1= new Customer();
        final int NUMBER_MONTHS=12; //CONSTANT 
        c1.name="Bobo";
        System.out.println(c1.name);
        Clothing m1=new Clothing();
        m1.descriptcion="Blue Jacket";
        m1.price=20.9;
        Clothing m2=new Clothing();
        m2.descriptcion="Orange T-Shirt";
        m2.price=10.5;
        m2.size="S";
        total=(m1.price+2*m2.price)*(1+tax);
        System.out.println("Total to pay: "+total);
    }
}
