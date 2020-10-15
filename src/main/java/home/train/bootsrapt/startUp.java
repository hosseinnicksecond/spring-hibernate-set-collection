package home.train.bootsrapt;

import home.train.model.Student;
import home.train.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class startUp implements CommandLineRunner {

    private final StudentRepository repository;

    public startUp(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Student student=new Student();
        student.setFirstName("john");
        student.setLastName("Doe");
        student.setEmail("john@email.com");

        Set<String> imageName= new HashSet<>();
        imageName.add("image1.jpg");
        imageName.add("image2.jpg");

        student.setImages(imageName);

        System.out.println(repository.save(student));

    }
}
