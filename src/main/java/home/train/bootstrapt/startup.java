package home.train.bootstrapt;

import home.train.model.Student;
import home.train.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.SortedMap;

@Component
public class startup implements CommandLineRunner {

    private final StudentRepository repository;

    public startup(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

//        Student student=new Student();
//        student.setFirstName("john");
//        student.setLastName("Doe");
//        student.setEmail("Doe@eamil.com");
//        SortedMap<Integer,String> images=student.getImages();
//        images.put(1,"image1");
//        images.put(3,"image2");
//        images.put(2,"image2");
//
//        repository.save(student);
//
//        System.out.println("**************");
          Optional<Student> student=repository.findById(1);
        System.out.println(student.toString());

    }
}
