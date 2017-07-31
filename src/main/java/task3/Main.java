package task3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Вениамин on 7/20/2017.
 */
public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor();//correct
        Doctor doctor2 = new MedicalStaff();//not correct
        Doctor doctor3 = new HeadDoctor();//correct
        Object object1 = new HeadDoctor();//correct
        HeadDoctor doctor5 = new Object();//not correct
        Nurse nurse = new Doctor();//not correct
        Object object2 = new Nurse();//correct
        List<Doctor> list1 = new ArrayList<Doctor>();//correct
        List<MedicalStaff> list2 = new ArrayList<Doctor>();//not correct
        List<Doctor> list3 = new ArrayList<MedicalStaff>();//not correct
        List<Object> list4 = new ArrayList<Doctor>();//not correct
        List<Object> list5 = new ArrayList<Object>();//correct

    }
}
