package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	System.out.println("TESTE findById");	
	SellerDao sellerDao = DaoFactory.createSellerDao();
	Seller seller = sellerDao.findById(2);
	System.out.println(seller);
	
	System.out.println("TESTE findByDepartment");
	Department dep = new Department(2,null);
	List<Seller> list = sellerDao.findByDepartment(dep);
	for(Seller obj : list) {
		System.out.println(obj);
	}
	System.out.println("TESTE findAll");
	 list = sellerDao.findAll();
	 for (Seller obj : list) {
			System.out.println(obj);
	}
	 System.out.println("teste inserSeller");
	 Seller newSeller = new Seller(null,"greg","greg@gmail.com",new Date(), 4000.0, dep);
	 sellerDao.insert(newSeller);
	 System.out.println("Seller ID = " + newSeller.getId());
}
}
	