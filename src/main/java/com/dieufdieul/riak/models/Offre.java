
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
    "alternance",
    "appellationlibelle",
    "competences",
    "dateActualisation",
    "dateCreation",
    "description",
    "experienceExige",
    "experienceLibelle",
    "formations",
    "id",
    "intitule",
    "langues",
    "lieuTravail",
    "natureContrat",
    "nombrePostes",
    "origineOffre",
    "qualificationCode",
    "romeCode",
    "romeLibelle",
    "typeContrat",
    "typeContratLibelle"
})
public class Offre {

    @JsonProperty("alternance")
    private Boolean alternance;
    @JsonProperty("appellationlibelle")
    private String appellationlibelle;
    @JsonProperty("competences")
    private List<Object> competences = null;
    @JsonProperty("dateActualisation")
    private String dateActualisation;
    @JsonProperty("dateCreation")
    private String dateCreation;
    @JsonProperty("description")
    private String description;
    @JsonProperty("experienceExige")
    private String experienceExige;
    @JsonProperty("experienceLibelle")
    private String experienceLibelle;
    @JsonProperty("formations")
    private List<Object> formations = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("intitule")
    private String intitule;
    @JsonProperty("langues")
    private List<Object> langues = null;
    @JsonProperty("lieuTravail")
    private LieuTravail lieuTravail;
    @JsonProperty("natureContrat")
    private String natureContrat;
    @JsonProperty("nombrePostes")
    private Integer nombrePostes;
    @JsonProperty("origineOffre")
    private OrigineOffre origineOffre;
    @JsonProperty("qualificationCode")
    private String qualificationCode;
    @JsonProperty("romeCode")
    private String romeCode;
    @JsonProperty("romeLibelle")
    private String romeLibelle;
    @JsonProperty("typeContrat")
    private String typeContrat;
    @JsonProperty("typeContratLibelle")
    private String typeContratLibelle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("alternance")
    public Boolean getAlternance() {
        return alternance;
    }

    @JsonProperty("alternance")
    public void setAlternance(Boolean alternance) {
        this.alternance = alternance;
    }

    @JsonProperty("appellationlibelle")
    public String getAppellationlibelle() {
        return appellationlibelle;
    }

    @JsonProperty("appellationlibelle")
    public void setAppellationlibelle(String appellationlibelle) {
        this.appellationlibelle = appellationlibelle;
    }

    @JsonProperty("competences")
    public List<Object> getCompetences() {
        return competences;
    }

    @JsonProperty("competences")
    public void setCompetences(List<Object> competences) {
        this.competences = competences;
    }

    @JsonProperty("dateActualisation")
    public String getDateActualisation() {
        return dateActualisation;
    }

    @JsonProperty("dateActualisation")
    public void setDateActualisation(String dateActualisation) {
        this.dateActualisation = dateActualisation;
    }

    @JsonProperty("dateCreation")
    public String getDateCreation() {
        return dateCreation;
    }

    @JsonProperty("dateCreation")
    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("experienceExige")
    public String getExperienceExige() {
        return experienceExige;
    }

    @JsonProperty("experienceExige")
    public void setExperienceExige(String experienceExige) {
        this.experienceExige = experienceExige;
    }

    @JsonProperty("experienceLibelle")
    public String getExperienceLibelle() {
        return experienceLibelle;
    }

    @JsonProperty("experienceLibelle")
    public void setExperienceLibelle(String experienceLibelle) {
        this.experienceLibelle = experienceLibelle;
    }

    @JsonProperty("formations")
    public List<Object> getFormations() {
        return formations;
    }

    @JsonProperty("formations")
    public void setFormations(List<Object> formations) {
        this.formations = formations;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("intitule")
    public String getIntitule() {
        return intitule;
    }

    @JsonProperty("intitule")
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @JsonProperty("langues")
    public List<Object> getLangues() {
        return langues;
    }

    @JsonProperty("langues")
    public void setLangues(List<Object> langues) {
        this.langues = langues;
    }

    @JsonProperty("lieuTravail")
    public LieuTravail getLieuTravail() {
        return lieuTravail;
    }

    @JsonProperty("lieuTravail")
    public void setLieuTravail(LieuTravail lieuTravail) {
        this.lieuTravail = lieuTravail;
    }

    @JsonProperty("natureContrat")
    public String getNatureContrat() {
        return natureContrat;
    }

    @JsonProperty("natureContrat")
    public void setNatureContrat(String natureContrat) {
        this.natureContrat = natureContrat;
    }

    @JsonProperty("nombrePostes")
    public Integer getNombrePostes() {
        return nombrePostes;
    }

    @JsonProperty("nombrePostes")
    public void setNombrePostes(Integer nombrePostes) {
        this.nombrePostes = nombrePostes;
    }

    @JsonProperty("origineOffre")
    public OrigineOffre getOrigineOffre() {
        return origineOffre;
    }

    @JsonProperty("origineOffre")
    public void setOrigineOffre(OrigineOffre origineOffre) {
        this.origineOffre = origineOffre;
    }

    @JsonProperty("qualificationCode")
    public String getQualificationCode() {
        return qualificationCode;
    }

    @JsonProperty("qualificationCode")
    public void setQualificationCode(String qualificationCode) {
        this.qualificationCode = qualificationCode;
    }

    @JsonProperty("romeCode")
    public String getRomeCode() {
        return romeCode;
    }

    @JsonProperty("romeCode")
    public void setRomeCode(String romeCode) {
        this.romeCode = romeCode;
    }

    @JsonProperty("romeLibelle")
    public String getRomeLibelle() {
        return romeLibelle;
    }

    @JsonProperty("romeLibelle")
    public void setRomeLibelle(String romeLibelle) {
        this.romeLibelle = romeLibelle;
    }

    @JsonProperty("typeContrat")
    public String getTypeContrat() {
        return typeContrat;
    }

    @JsonProperty("typeContrat")
    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }

    @JsonProperty("typeContratLibelle")
    public String getTypeContratLibelle() {
        return typeContratLibelle;
    }

    @JsonProperty("typeContratLibelle")
    public void setTypeContratLibelle(String typeContratLibelle) {
        this.typeContratLibelle = typeContratLibelle;
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
