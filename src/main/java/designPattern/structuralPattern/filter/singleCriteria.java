package designPattern.structuralPattern.filter;

import java.util.List;

public class singleCriteria implements Criteria{
    @Override
    public List<Customer> meetCritiria(List<Customer> customers) {
            List<Customer>singleCustomers=customers.stream().filter((customer -> customer.getStatus().equalsIgnoreCase("single"))).toList();
            return singleCustomers;

    }
}
