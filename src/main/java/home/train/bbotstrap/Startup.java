package home.train.bbotstrap;

import home.train.model.Student;
import home.train.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;

import java.util.Set;

public class Startup implements CommandLineRunner {

    private final StudentRepository repository;

    public Startup(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {

        Student student= new Student();
        student.setFirstName("Mary");
        student.setLastName("public");
        student.setEmail("mary@email.com");
        Set<String> imageName=student.getImages();
        imageName.add("image1");
        imageName.add("image3");
        imageName.add("image2");

        System.out.println(repository.save(student));

    }
}
