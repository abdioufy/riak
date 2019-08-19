package com.dieufdieul.riak;

import com.dieufdieul.riak.models.Offre;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RiakApplicationTests {

  @Autowired
  RiakService riakService;
	@Test
	public void contextLoads() {
	}

	@Test
  public void getDataFromJsonFile() throws IOException {
    // Given
    String path = "src/test/resources/offresV2.json";

    List<Offre> offres = riakService.getDataFromJsonFile(path);

    //Then
    Assert.assertTrue(!offres.isEmpty());
  }


  @Test
  public void load() throws InterruptedException, ExecutionException, IOException {
	  // Given
    String path = "src/test/resources/offresV2.json";
    riakService.storeData(path);

  }
}
