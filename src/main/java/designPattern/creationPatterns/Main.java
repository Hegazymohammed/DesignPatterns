package designPattern.creationPatterns;

import designPattern.creationPatterns.factory.NotificationFActory;
import designPattern.structuralPattern.filter.Criteria;
import designPattern.structuralPattern.filter.Customer;
import designPattern.structuralPattern.filter.singleCriteria;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer customer=new Customer("mohammed","Ali","single","male");
        Customer customer1=new Customer("Ali","samy","single","male");
        Customer customer2=new Customer("samy","Ali","married","male");
        Criteria criteria=new singleCriteria();
        List<Customer>customers= List.of(customer1,customer2,customer);
        customers= criteria.meetCritiria(customers) ;

    }
}