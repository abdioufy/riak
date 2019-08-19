package com.dieufdieul.riak;

import com.basho.riak.client.api.RiakClient;
import com.basho.riak.client.api.cap.Quorum;
import com.basho.riak.client.api.commands.kv.StoreValue;
import com.basho.riak.client.core.query.Location;
import com.basho.riak.client.core.query.Namespace;
import com.dieufdieul.riak.models.Offre;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

@Service
public class RiakService {

  ObjectMapper objectMapper = new ObjectMapper();

  public List<Offre> getDataFromJsonFile(String path) throws IOException {

    ObjectReader objectReader = objectMapper.reader().forType(new TypeReference<List<Offre>>(){});

    List<Offre> offres = objectReader.readValue(new File(path));

    return offres;
  }

  public void storeData(String path) throws IOException, ExecutionException, InterruptedException {

    RiakClient client = RiakClient.newClient("127.0.0.1");




    List<Offre> offres = getDataFromJsonFile(path);

    for (Offre offre : offres) {
      Location location = new Location(new Namespace("prince"), offre.getId());
      StoreValue sv = new StoreValue.Builder(offre).withLocation(location).build();
      client.execute(sv);
    }

    client.shutdown();
  }
}
