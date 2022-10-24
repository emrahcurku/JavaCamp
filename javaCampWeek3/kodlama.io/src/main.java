import business.CatagoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.CategoryDao;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateInstructorDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(),new MailLogger(),new FileLogger()};

        List<Course> courses = new ArrayList<>();
        List<Category> categories = new ArrayList<>();

        Category category = new Category(1,"Yazılım");
        Category category1 = new Category(2,"İngilizce");
        Category category2 = new Category(1,"Yazılım");
        CatagoryManager catagoryManager = new CatagoryManager(new HibernateCategoryDao(),loggers,categories);
        catagoryManager.add(category);
        catagoryManager.add(category1);
        catagoryManager.add(category2);

        Course course = new Course(1,"Java",59.99);
        Course course1 = new Course(1,"Java",59.99);
        Course course2 = new Course(2,"C#",69.99);
        Course course3 = new Course(3,"JavaScript",-79.99);
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers,courses);
        courseManager.add(course);
        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);

        Instructor instructor = new Instructor(1,"Engin","Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor);







    }
}
