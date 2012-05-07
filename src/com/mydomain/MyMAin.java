package com.mydomain;

import com.mydomain.data.SimpleExample;
import com.mydomain.domain.Account;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: parvez
 * Date: 5/7/12
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyMAin {

    public static void main(String [] args)
    {
        try {
          List<Account> list= SimpleExample.selectAllAccounts();
            for(Account account:list)
            {
                System.out.println(account.getEmailAddress());
            }
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
