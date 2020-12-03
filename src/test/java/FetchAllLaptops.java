import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dao.LaptopDAO;
import model.Laptop;

public class FetchAllLaptops {

	@Test
	public void test() {
		LaptopDAO dao = new LaptopDAO();
		List<Laptop> list =dao.fetchAllLaptops();
		for(Laptop laptop : list) {
			System.out.println(laptop);
		}
	}

}
