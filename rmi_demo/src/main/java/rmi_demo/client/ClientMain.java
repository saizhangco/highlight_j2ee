package rmi_demo.client;

import java.rmi.Naming;

import rmi_demo.server.HelloService;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		// Include service
		HelloService helloService = (HelloService)Naming.lookup("rmi://localhost:8801/helloService");
		// Invoke remote method
		System.out.println("RMI Server return result is : " + helloService.sayHello("saizhang"));
	}
}
