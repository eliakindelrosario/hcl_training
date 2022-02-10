package com.hcl.training.exercise7;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

public class StudentManager {

	// TODO - ADD ERROR HANDLING
	public void addStudent(String fname, String lname, String email) {
		EntityManager entityManager = JPAHelper.getEntityManagerFactory().createEntityManager();

		// Get transaction and start
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Student student = new Student(fname, lname, email);

		// Save Student Object
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void getAllStudents() {
		EntityManager entityManager = JPAHelper.getEntityManagerFactory().createEntityManager();
		String strQuery = "SELECT s FROM Student s WHERE s.id IS NOT NULL"; // s in this case references the student object
		TypedQuery<Student> tq = entityManager.createQuery(strQuery, Student.class);
		
		List<Student> students;
		students = tq.getResultList();
		System.out.println("Student Data");
		students.forEach(student->System.out.println(student.toString()));
		
		entityManager.close();
	}

	public void getStudent(int id) {
		EntityManager entityManager = JPAHelper.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		
		Student student = entityManager.find(Student.class, id);
		System.out.println("Student Data");
		System.out.println(student.toString());
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void updateFirstName(int id, String name) {
		EntityManager entityManager = JPAHelper.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		Student student = entityManager.find(Student.class, id);
		System.out.println("Student Data");
		System.out.println(student.toString());

		student.setFirstName(name);
		
		System.out.println("\nNew Student Data");
		System.out.println(student.toString());
		
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void deleteStudent(int id) {
		EntityManager entityManager = JPAHelper.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		Student student = entityManager.find(Student.class, id);
		
		entityManager.remove(student);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
