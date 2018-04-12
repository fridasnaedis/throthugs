import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class PersonController {

    public static void main(String[] args) {
        Configuration con = new Configuration().configure().addAnnotatedClass(Person.class);

        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        SessionFactory sf = con.buildSessionFactory(reg);

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();


        Person sara = new Person();

        sara.setEmail("sbm5@hi.is");
        sara.setFirstName("Sara");
        sara.setLastName("Másdóttir");


        session.save(sara);
        tx.commit();
        session.close();

    }
}
