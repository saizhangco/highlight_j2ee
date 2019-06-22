package rmi_demo.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServerMain {

	public static void main(String[] args) throws Exception {
		// Create Service
		HelloService helloService = new HelloServiceImpl();
		// Registry Service
		LocateRegistry.createRegistry(8801);
		Naming.bind("rmi://localhost:8801/helloService", helloService);
		System.out.println("ServerMain provide RPC service now.");
	}
}
