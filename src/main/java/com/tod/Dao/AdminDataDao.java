package com.tod.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tod.entities.Category;
import com.tod.entities.Product;
import com.tod.entities.UserInfo;
import com.tod.helper.FactoryProvider;

public class AdminDataDao {

	private FactoryProvider factoryProvider;

	public AdminDataDao(FactoryProvider factoryProvider) {
		super();
		this.factoryProvider = factoryProvider;
	}

	public int getUserCount() {

		Session session = factoryProvider.getFactory().openSession();

		Query query = session.createQuery("from UserInfo");

		List<UserInfo> userList = (List<UserInfo>) query.list();

		return userList.size();

	}
	
	
	public int getProductCount() {

		Session session = factoryProvider.getFactory().openSession();

		Query query = session.createQuery("from Product");

		List<Product> userList = (List<Product>) query.list();

		return userList.size();

	}
	
	
	public int getCategoryCount() {

		Session session = factoryProvider.getFactory().openSession();

		Query query = session.createQuery("from Category");

		List<Category> userList = (List<Category>) query.list();

		return userList.size();

	}

}
