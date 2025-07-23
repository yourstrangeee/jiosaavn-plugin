package com.github.appujet.plugin;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "plugins.jiosaavn")
public class JioSaavnConfig {
    private String apiURL = null; // default value for API URL
    private int playlistTrackLimit = 50; // default value for playlist track limit
    private int recommendationsTrackLimit = 10; // default value for recommendations
    public String getApiURL() {
        return apiURL;
    }
    public void setApiURL(String apiURL) {
        this.apiURL = apiURL; // setter for API URL
    }
    public int getPlaylistTrackLimit() {
        return playlistTrackLimit; // getter for playlist track limit
    }

    public void setPlaylistTrackLimit(int playlistTrackLimit) {
        this.playlistTrackLimit = playlistTrackLimit; // setter for playlist track limit
    }

    public int getRecommendationsTrackLimit() {
        return recommendationsTrackLimit;
    }

    public void setRecommendationsTrackLimit(int recommendationsTrackLimit) {
        this.recommendationsTrackLimit = recommendationsTrackLimit;
    }

}