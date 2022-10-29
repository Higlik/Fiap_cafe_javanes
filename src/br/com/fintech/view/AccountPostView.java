package br.com.fintech.view;

import java.sql.SQLException;

import br.com.fintech.dao.AccountDao;
import br.com.fintech.model.AccountModel;

public class AccountPostView {

	public static void main(String[] args)  throws SQLException {
		
		AccountModel model = new AccountModel();
		model.setAccountName("Conta Casa");
		model.setAccountType("Conta corrente");
		model.setBankAccountName("Next");
		model.setBankAccountType("Digital");
		model.setUserId(0);
		
		AccountDao dao = new AccountDao();	
		dao.insert(model);
	}
	
	
}
