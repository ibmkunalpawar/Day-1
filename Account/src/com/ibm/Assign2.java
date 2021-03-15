package com.ibm;

import java.util.ArrayList;
import java.util.List;

public class Assign2 {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		for (int i = 0; i < accounts.length; i++) {
			Account account = new Account("Raj"+i,100*i);
			accounts[i]=account;
			
		}
		System.out.println(accounts.length);
		List<Account> account1 = new ArrayList<Account>();
		for(Account iter:accounts) {
			account1.add(iter);
		}
		System.out.println(account1);
	}
}
