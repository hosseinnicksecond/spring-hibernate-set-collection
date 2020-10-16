package home.train.bootstrapt;

import home.train.model.Student;
import home.train.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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
        List<String> image=new ArrayList<>();
        image.add("image1");
        image.add("image2");
        image.add("image4");
        image.add("image3");
        image.add("image4");
        student.setImages(image);

        Student student1= new Student();
        student1.setFirstName("mary");
        student1.setLastName("Public");
        student1.setEmail("mary@email.com");
        List<String> image1=new ArrayList<>();
        image1.add("image1");
        image1.add("image2");
        image1.add("image4");
//        image.add("image3");
        image.add("image4");
        student1.setImages(image1);
        System.out.println(repository.save(student1));
        System.out.println(repository.save(student));
    }
}
