package com.sahin.spring_data_jpa_ex;

import com.sahin.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

        Student s1  = context.getBean(Student.class);
        Student s2  = context.getBean(Student.class);
        Student s3  = context.getBean(Student.class);
        Student s4  = context.getBean(Student.class);



        s1.setRollNo(101);
        s1.setName("Sahin");
        s1.setMarks(75);

        s2.setRollNo(102);
        s2.setName("Akash");
        s2.setMarks(85);

        s3.setRollNo(103);
        s3.setName("Rishita");
        s3.setMarks(95);

        s4.setRollNo(104);
        s4.setName("Tuhin");
        s4.setMarks(97);

      /*
        repo.save(s1);
        repo.save(s2);
        repo.save(s3);
        repo.save(s4);


 */
        //findAll is a method which will give you all the data that are present in the database!
//        System.out.println(repo.findAll());

        //findById is a special method which will give you a particular element based on Primary Key
//        System.out.println(repo.findById(101));

        //Optional because if the value is not present in that case it'll give null value,in that case optional will help to handle it properly!
        Optional<Student> s = repo.findById(106);
        System.out.println(s.orElse(new Student())); // if s is null it'll give a new student Object.
	}

}
