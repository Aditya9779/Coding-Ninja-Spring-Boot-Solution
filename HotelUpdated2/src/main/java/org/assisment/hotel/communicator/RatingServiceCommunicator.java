package org.assisment.hotel.communicator;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RatingServiceCommunicator {
    //First create the metho for the restTemplate
    private final RestTemplate restTemplate;

    //Make the constructor for the making the restTemplate builder
    public RatingServiceCommunicator(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    // Get the id form the rating project fecting the data through the url
    public long getIdRating(String id) {
        String url = "http://localhost:8081/rating/id/";


        //It has the path variable so we add the id coming in the url in down (id)
        //Which is coming from the (String id) inside method
       /* ResponseEntity<Long> response = restTemplate.getForEntity(url + id, long.class);
        return response.getBody();*/

        //Second method Its has the object return value
        Long responce = restTemplate.getForObject(url + id, long.class);
        return responce;

    }
}
