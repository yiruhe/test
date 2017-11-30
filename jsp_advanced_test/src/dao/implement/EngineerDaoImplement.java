package dao.implement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import template.IResultSetHandle;
import template.JDBCTemplate;
import dao.IEngineerDirDao;
import domain.Engineer;

public class EngineerDaoImplement implements IEngineerDirDao{

	

	@Override
	public List<Engineer> query() {
		
		String sql = "SELECT * FROM classdir";
		
		return JDBCTemplate.query(sql,new EngineerResultSetHandleImplement());
	
	}
	
	@Override
	public Engineer get(int id) {
		
		String sql = "SELECT * FROM classdir WHERE id = ?";
		
		return JDBCTemplate.query(sql,new EngineerResultSetHandleImplement(),id).get(0);
	}


	public Engineer getEnginnerId(int id) {
		
		String sql = "SELECT * FROM classdir WHERE part_id = ?";
		
		System.out.println("---------------------------------------");
		
		return JDBCTemplate.query(sql,new EngineerResultSetHandleImplement(),id).get(0);
	}
	
	
	class EngineerResultSetHandleImplement implements IResultSetHandle<List<Engineer>>{

		@Override
		public List<Engineer> handle(ResultSet set) {
			
			List<Engineer> list = new ArrayList<Engineer>();
			
			try {
				while(set.next()){
					
					Integer id = set.getInt("id");
					String name = set.getString("part_name");
					Integer negineerId = set.getInt("part_id"); 
					
					Engineer engineer = new Engineer();
					
					engineer.setId(id);
					engineer.setEngineerId(negineerId);
					engineer.setEngineerName(name);
					
					list.add(engineer);
					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			return list;
		}
		
	
	}
	
	
}
