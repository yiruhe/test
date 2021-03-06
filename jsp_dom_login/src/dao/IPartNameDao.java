package dao;

import java.util.List;

import domain.DepartmentName;


public interface IPartNameDao {

public abstract int save(DepartmentName obj);
	
	/**
	 * 
	 * 
	 * 
	 */
	public abstract int delete(Integer id);
	
	
	/**
	 * 
	 * 
	 * 
	 */
	public abstract DepartmentName get(int id);
	
	/**
	 * 
	 * 
	 * 
	 */
	public abstract List<DepartmentName> query();
	
	/**
	 * 
	 */
	public abstract int update(DepartmentName obj);

}
