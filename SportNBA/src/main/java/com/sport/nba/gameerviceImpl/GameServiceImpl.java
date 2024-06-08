package com.sport.nba.gameerviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sport.nba.dto.TeamsData;

@Service
public class GameServiceImpl {

	@Autowired
    private RestTemplate restTemplate;

	public TeamsData getTeams() {
        String url = "https://api.balldontlie.io/v1/teams";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "9eec6563-edf6-4154-9850-cee0a093127d");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<TeamsData> response = restTemplate.exchange(url, HttpMethod.GET, entity, TeamsData.class);
        return response.getBody();
    }
}
