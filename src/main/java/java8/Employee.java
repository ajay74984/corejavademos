package java8;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Employee {
    private  int id;
    private  String name;
    private  String lastName;
    private double salary;


    public void idChange(int value){
        id = id + value;
    }
}
