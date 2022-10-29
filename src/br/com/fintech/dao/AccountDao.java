package br.com.fintech.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.fintech.model.AccountModel;

public class AccountDao {
	
	public AccountModel findById(int id) {
		AccountModel accountModel = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "pf0954", "fiap");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM T_ACCOUNT WHERE ID = " + id);
			
			
			if ( rs.next() ) {
				accountModel = new AccountModel();
				accountModel.setAccountName(rs.getString("NAME"));
				accountModel.setAccountType(rs.getString("TYPE"));
				accountModel.setBankAccountName(rs.getString("BANK_NAME"));
				accountModel.setBankAccountType(rs.getString("BANK_TYPE"));
				accountModel.setUserId(rs.getInt("USER_ID"));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return accountModel;
	}
	
		public List<AccountModel> findAll() throws SQLException{
			List<AccountModel> listAccount = new ArrayList<AccountModel>();
			
			Connection conn = null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "pf0954", "fiap");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM T_ACCOUNT");
				
				while(rs.next() ) {
					AccountModel accountModel = new AccountModel();
					accountModel.setAccountName(rs.getString("NAME"));
					accountModel.setAccountType(rs.getString("TYPE"));
					accountModel.setBankAccountName(rs.getString("BANK_NAME"));
					accountModel.setBankAccountType(rs.getString("BANK_TYPE"));
					accountModel.setUserId(rs.getInt("USER_ID"));
					
					listAccount.add(accountModel);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
			
			return listAccount;
	}
		
		public void insert(AccountModel accountModel) throws SQLException{
			String SQL1 = 
					" INSERT INTO T_ACCOUNT(ID, NAME, TYPE, BANK_NAME, BANK_TYPE, USER_ID)"
					+ " VALUES (T_ACCOUNT_SEQ.nextval, ? , ? , ? , ? )";
							
			Connection conn = null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "pf0954", "fiap");
				PreparedStatement ptmt = conn.prepareStatement(SQL1);
				
				ptmt.setString(1, accountModel.getAccountName());
				ptmt.setString(2, accountModel.getAccountType());
				ptmt.setString(3, accountModel.getBankAccountName());
				ptmt.setString(4, accountModel.getBankAccountType());
				ptmt.setInt(5, accountModel.getUserId());
				
				ptmt.execute();
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
			
			public void update(AccountModel accountModel) throws SQLException {
				String SQL1 = 
						"UPDATE T_ACCOUNT SET NAME = ?, TYPE = ?, BANK_NAME = ?, BANK_TYPE = ?,  USER_ID = ? ";
						
				Connection conn = null;
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");

					conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "pf0954", "fiap");
					PreparedStatement ptmt = conn.prepareStatement(SQL1);
					
					ptmt.setString(1, accountModel.getAccountName());
					ptmt.setString(2, accountModel.getAccountType());
					ptmt.setString(3, accountModel.getBankAccountName());
					ptmt.setString(4, accountModel.getBankAccountType());
					ptmt.setInt(5, accountModel.getUserId());
					
					ptmt.execute();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} finally {
					conn = null;
				}
			
		}
			
			public void delete(int id) {
				
			}
		
}
