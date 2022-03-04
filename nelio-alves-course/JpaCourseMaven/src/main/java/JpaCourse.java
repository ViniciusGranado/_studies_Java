import entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaCourse {
  public static void main(String[] args) {
    Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
    Person p2 = new Person(null, "Joaquim Torres", "joaquim@gmail.com");
    Person p3 = new Person(null, "Ana Maria", "ana@gmail.com");

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("course-jpa");
    EntityManager em = emf.createEntityManager();

    Person p = em.find(Person.class, 2);
    System.out.println(p);

    System.out.println("Done!");

    em.close();
    emf.close();
  }
}
