package designPattern.structuralPattern.filter;

import java.util.List;

public class CriteriaFemale implements Criteria{
    @Override
    public List<Customer> meetCritiria(List<Customer> customers) {
                List<Customer>females=customers.
                        stream().
                        filter((customer -> customer.getGender().equalsIgnoreCase("female"))).
                        toList();
                return females;
    }
}
