package designPattern.structuralPattern.filter;

import java.util.List;

public class AndCriteria implements Criteria{

    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria firstCriteria,Criteria secondCriteria){
                this.firstCriteria=firstCriteria;
                this.secondCriteria=secondCriteria;
    }
    @Override
    public List<Customer> meetCritiria(List<Customer> customers) {
            List<Customer>customres=firstCriteria.meetCritiria(customers);
            return secondCriteria.meetCritiria(customres);
    }
}
