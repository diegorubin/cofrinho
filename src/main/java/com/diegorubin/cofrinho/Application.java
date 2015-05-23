package com.diegorubin.cofrinho;

public class Application {

	public static void main(String... anArgs) throws Exception {
        new Application().start();
    }
	
	private WebServer server;
    
    public Application() {
        server = new WebServer(8000);        
    }
    
    public void start() throws Exception {
        server.start();        
        server.join();
    }
}
