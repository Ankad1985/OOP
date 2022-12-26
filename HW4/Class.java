package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class Class extends Student implements Iterable<Student> {
    LinkedList<Student> students = new LinkedList<>();
    public void addStudents(Student student){
        students.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            int index;
            @Override
            public boolean hasNext() {
                index+=1;
                return index<=students.size();

            }

            @Override
            public Student next() {

                    return students.get(index-1);



            }
        };
    }
}
