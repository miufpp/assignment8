package org.miu.problem2;

public class Test {
    public static void main(String[] args) {
        CustomerAccount customer1=new CustomerAccount("John Edem Adamfo",0.00,"1122882");
        CustomerAccount customer2=new CustomerAccount("Davies Dwabuluka",300.00,"1122883");
        CustomerAccount customer3=new CustomerAccount("Jadon Yorm Adamfo",1000.900,"1122884");

        System.out.println(customer2.getBalance());
        System.out.println(customer1.deposit(50));
        System.out.println(customer3.withdraw(1000));
        System.out.println(customer3.getBalance());
    }
}
