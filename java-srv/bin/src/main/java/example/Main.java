package example;

import example.model.Dog;

public class Main {

	public static void main(String[] args) {
		org.hibernate.Session session = HibernateUtils.getSessionFactory().openSession();

		Dog tbl = new Dog(session);

		try {
			tbl.insert(1L, "Am Bulldog", "White");
			tbl.insert(2L, "Blue Tick", "Grey");
			tbl.insert(3L, "Labrador", "Black");
			tbl.insert(4L, "Gr Shepard", "Brown");
		} catch (Exception e) {}

		tbl.selectAll();

		HibernateUtils.shutdown();
	}
}
