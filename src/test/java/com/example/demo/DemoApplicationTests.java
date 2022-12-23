package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.config.AspectConfig;
import com.example.demo.service.ItemService;
import com.example.demo.domain.Item;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {
	
	@Autowired
	private ItemService demoItemService;

	@Autowired
	private Item demoItem;

	@Test
	public void TestLogAspect() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectConfig.class);
        // demoItemService = context.getBean(ItemService.class);
		// Item demoItem = context.getBean(Item.class);
		demoItem.setId((long)10);
		demoItem.setName("Test Phone");
		demoItem.setPrice((float)1200.0);
		demoItem.setVendor("This is for test");

		try {
			demoItemService.save(demoItem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
 
        System.out.println("=======================================");
        demoItemService.findOne((long) 10);
 
        context.close();
	}
	public static void main(String[] args)
    {
    }

}
