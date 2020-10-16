package home.train.bootstrap;

import home.train.model.Student;
import home.train.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class startup implements CommandLineRunner {

    private final StudentRepository repository;

    public startup(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        Student student= new Student();
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setEmail("john@email.com");
        Map<Integer,String> images= new HashMap<>();
        images.put(1,"image2");
        images.put(2,"image1");
        images.put(3,"image3");
        student.setImages(images);

        System.out.println(repository.save(student));
    }
}
