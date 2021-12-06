package service.base;

import db.DB;

public abstract class BaseService {
	
	private DB db = new DB();
	
	public DB getDB() {
		return db;
	}
}
