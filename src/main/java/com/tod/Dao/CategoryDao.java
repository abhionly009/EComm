package com.tod.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.tod.entities.Category;
import com.tod.helper.FactoryProvider;

public class CategoryDao {

	private FactoryProvider factoryProvider;

	public CategoryDao(FactoryProvider factoryProvider) {
		super();
		this.factoryProvider = factoryProvider;
	}

	public long addCategory(Category category) {

		Session session = factoryProvider.getFactory().openSession();

		Transaction tx = session.beginTransaction();

		long catId = (Long) session.save(category);

		tx.commit();
		session.close();

		return catId;
	}

	public List<Category> getCategoryList() {

		Session s = factoryProvider.getFactory().openSession();

		Query q = s.createQuery("from Category");
		List<Category> cateList = q.list();
		return cateList;

	}
}
