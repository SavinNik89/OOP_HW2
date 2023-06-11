package HW_3;

import java.util.Comparator;

public class ComparatorSalary implements Comparator <Emploee> {


    @Override
    public int compare(Emploee o1, Emploee o2) {
        int res1 = Double.compare(o1.calculateMonthlySalary(), o2.calculateMonthlySalary());
        if (res1 != 0){return res1;}
        else {
            int res2 = o1.surname.compareTo(o2.surname);
            if (res2 != 0) {return res2;}
            else{
                int res3 = o1.name.compareTo(o2.name);
                if (res3 != 0) {return res3;}
                else{
                    return Integer.compare(o1.age, o2.age);
                }
            }
        }


    }
}
