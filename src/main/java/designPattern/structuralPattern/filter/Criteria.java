package designPattern.structuralPattern.filter;

import java.util.List;

public interface Criteria {

    List<Customer> meetCritiria(List<Customer>customers);
}
