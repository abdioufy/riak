
package com.dieufdieul.riak.models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "origine",
    "partenaires",
    "urlOrigine"
})
public class OrigineOffre {

    @JsonProperty("origine")
    private String origine;
    @JsonProperty("partenaires")
    private List<Partenaire> partenaires = null;
    @JsonProperty("urlOrigine")
    private String urlOrigine;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("origine")
    public String getOrigine() {
        return origine;
    }

    @JsonProperty("origine")
    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @JsonProperty("partenaires")
    public List<Partenaire> getPartenaires() {
        return partenaires;
    }

    @JsonProperty("partenaires")
    public void setPartenaires(List<Partenaire> partenaires) {
        this.partenaires = partenaires;
    }

    @JsonProperty("urlOrigine")
    public String getUrlOrigine() {
        return urlOrigine;
    }

    @JsonProperty("urlOrigine")
    public void setUrlOrigine(String urlOrigine) {
        this.urlOrigine = urlOrigine;
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
