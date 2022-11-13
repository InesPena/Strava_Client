package client.remote;

import java.rmi.Naming;

public class ServiceLocator {
	
	//private IRemoteFacade service;
	
	public void setService(String ip, String port, String serviceName) {
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new SecurityManager());
		}
		
		try {		
			String URL = "//" + ip + ":" + port + "/" + serviceName;
			//this.service = (IRemoteFacade) Naming.lookup(URL);
		} catch (Exception ex) {
			System.err.println("# Error locating remote facade: " + ex);
		}	
	}
	
	/*public IRemoteFacade getService() {
		return this.service;
	}*/
}
