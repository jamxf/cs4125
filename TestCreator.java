public class TestCreator{
    public static void main(String [] args){
        Order o = new Order(1234, "Brendan");
        Order o1 = new Order(1235, "Ian");
        System.out.println(o);
        o.newPC();
        o1.newPC();
        PC p = o.getOrderPC();
        System.out.println(p);

        PC p1 = o1.getOrderPC();
        System.out.println(o1);
        System.out.println(p1);

    }
}