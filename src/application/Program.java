 package application;

import java.util.Date;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDAO sellerDao = DAOFactory.createSellerDAO();
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	}	

}
