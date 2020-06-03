import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.jh.test.mapper.StudentMapper;
import org.jh.test.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@SpringBootTest
@RunWith(SpringRunner.class)
@Log4j2
class ApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void createStudent(){
        String code = "S202005261234";
        String name = "Son";
        Student student = studentMapper.getStudentByCode(code);

        int check = 0;

        if(student == null){
            student = new Student(name, code);
            check = studentMapper.insertStudent(student);
        }else{
            student.setSaveDate(LocalDateTime.now());
            check = studentMapper.updateStudent(student);
        }
        log.info("Result : {}",check);

    }

    @Test
    void printStudentS(){
        studentMapper.getStudents().forEach(data -> log.info("Student : ", data.toString()));
    }
}
