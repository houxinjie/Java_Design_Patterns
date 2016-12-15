package Criteria;
import java.util.List;

/**
 * Created by houxinjie on 2016/12/15.
 */
public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }
    @Override
    public List<Person> meetCriteria(List<Person> persons){
        List<Person> firstCriterItems = criteria.meetCriteria(persons);
        List<Person> otherCriterItems = otherCriteria.meetCriteria(persons);
        for(Person person : otherCriterItems){
            if(!firstCriterItems.contains(person)){
                firstCriterItems.add(person);
            }
        }
        return firstCriterItems;
    }
}
