package com.example.todo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class todoApplication implements CommandLineRunner {
    //	@Autowired
//	private DataSource dataSource;
    public static void main(String[] args) {
        SpringApplication.run(todoApplication.class, args);
    }
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
    @Override
    public void run(String... args) throws Exception {
//		Connection conn = dataSource.getConnection();
//		if(conn != null){
//			System.out.println("conn is ok!!");
//		}
//		conn.close();
    }
}