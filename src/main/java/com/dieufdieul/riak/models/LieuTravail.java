
package com.dieufdieul.riak.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "codePostal",
    "commune",
    "latitude",
    "libelle",
    "longitude"
})
public class LieuTravail {

    @JsonProperty("codePostal")
    private String codePostal;
    @JsonProperty("commune")
    private String commune;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("libelle")
    private String libelle;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("codePostal")
    public String getCodePostal() {
        return codePostal;
    }

    @JsonProperty("codePostal")
    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @JsonProperty("commune")
    public String getCommune() {
        return commune;
    }

    @JsonProperty("commune")
    public void setCommune(String commune) {
        this.commune = commune;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("libelle")
    public String getLibelle() {
        return libelle;
    }

    @JsonProperty("libelle")
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
