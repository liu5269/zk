package junit;

import org.apache.curator.test.TestingServer;

public class zkServer {

	public static void main(String[] args) {
		
		
        try {
        	TestingServer server = new TestingServer(2181);
			server.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
