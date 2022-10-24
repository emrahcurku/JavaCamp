package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        if (course.getUnitPrice()<0)
        {
           throw new Exception("Kurs ücreti 0'dan düşük olamaz");
        }
        for (Course course1: courses) {
            if (course1.getCourseName()== course.getCourseName())
            {
                throw new Exception("Bu isimde kurs vardır!");
            }
        }
        courseDao.add(course);
        courses.add(course);

        for (Logger logger: loggers) {
            logger.log(course.getCourseName());
        }
    }


}
