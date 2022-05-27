package com.chaitanya.springJDBC.f1.sr_001;

import com.chaitanya.springJDBC.f1.sr_001.dao.StudentDao;
import com.chaitanya.springJDBC.f1.sr_001.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        //we would not create jdbc template object here using new operator.
        // we will use dependency injection
        //jetbrains://idea/navigate/reference?project=SpringJDBC&path=config.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        //insert query
//        String query = "insert into student(id,name,city) values (?,?,?)";

        //fire query
//        int result  = template.update(query,450,"Chaitanys","Nagpur");
//        System.out.println("No of records Inserted.." + result);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        Student student = new Student(5678,"Rakesh", "Gurgoan");
//        int result = studentDao.insert(student);
//        System.out.println("No Of records Inserted.." + result);

//          Student student = new Student();
//          student.setId(450);
//          student.setName("Zen");
//          student.setCity("Gwalior");
//          int result = studentDao.change(student);
//          System.out.println("Data changed" + result);

//          //Delete
//          result = studentDao.delete(5678);
//          System.out.println("Deleted" + result);

          //rowMapper
//          Student student1 = studentDao.getStudent(2229);
//          System.out.println(student1);

          List<Student> students =studentDao.getAllStudents();
          for(Student s: students){
              System.out.println(s);
          }
    }
}
