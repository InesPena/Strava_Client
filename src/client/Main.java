package client;

import client.controller.LoginController;
import client.remote.ServiceLocator;

public class Main {
	
	public static void main(String[] args) {
		ServiceLocator serviceLocator = new ServiceLocator();
		serviceLocator.setService(args[0], args[1], args[2]);
		
		//LoginController loginController = new LoginController(serviceLocator);
	}

}
