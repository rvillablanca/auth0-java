package com.auth0.json.mgmt.jobs;

import com.fasterxml.jackson.annotation.*;

import java.util.Date;

/**
 * Class that represents an Auth0 Job object. Related to the {@link com.auth0.client.mgmt.JobsEntity} entity.
 */
@SuppressWarnings({"unused", "WeakerAccess"})
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Job {

    @JsonProperty("status")
    private String status;
    @JsonProperty("type")
    private String type;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("id")
    private String id;

    @JsonCreator
    private Job(@JsonProperty("status") String status, @JsonProperty("type") String type, @JsonProperty("id") String id) {
        this.status = status;
        this.type = type;
        this.id = id;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    @JsonProperty("created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }
}
