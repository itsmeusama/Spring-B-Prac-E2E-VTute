package com.usama.newstudentdal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.usama.newstudentdal.entities.Student;
import com.usama.newstudentdal.repo.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewstudentdalApplicationTests {
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		
		Student student = new Student();
		student.setName("Raj");
		student.setCourse("Java EE");
		student.setFee(30d);
		
		studentRepository.save(student);
	}
		
		/*@Test
		public void testFindStudentById()
		{
			Student student = studentRepository.findById(1l);

			System.out.println(student);
		}
	*/

}
		/*@Test
		public void testUpdateStudent()
		{
			Student student = studentRepository.findById(1l);

			student.setFee(40d);
			studentRepository.save(student);
		}*/

		/* public void testDeleteStudent()
		{
			studentRepository.deleteById(1l);
		}
		*/
