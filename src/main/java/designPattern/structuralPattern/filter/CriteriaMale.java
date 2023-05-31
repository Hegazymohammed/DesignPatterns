package designPattern.structuralPattern.filter;

import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Customer> meetCritiria(List<Customer> customers) {

            List<Customer> males =customers.stream().filter((customer)->customer.getGender().equalsIgnoreCase("male")).toList();
            return males;
        }
}
