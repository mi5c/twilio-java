/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.understand.service;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldType extends Resource {
    private static final long serialVersionUID = 264017379469163L;

    /**
     * Create a FieldTypeFetcher to execute fetch.
     * 
     * @param pathServiceSid The service_sid
     * @param pathSid The sid
     * @return FieldTypeFetcher capable of executing the fetch
     */
    public static FieldTypeFetcher fetcher(final String pathServiceSid, 
                                           final String pathSid) {
        return new FieldTypeFetcher(pathServiceSid, pathSid);
    }

    /**
     * Create a FieldTypeReader to execute read.
     * 
     * @param pathServiceSid The service_sid
     * @return FieldTypeReader capable of executing the read
     */
    public static FieldTypeReader reader(final String pathServiceSid) {
        return new FieldTypeReader(pathServiceSid);
    }

    /**
     * Create a FieldTypeCreator to execute create.
     * 
     * @param pathServiceSid The service_sid
     * @param uniqueName The unique_name
     * @return FieldTypeCreator capable of executing the create
     */
    public static FieldTypeCreator creator(final String pathServiceSid, 
                                           final String uniqueName) {
        return new FieldTypeCreator(pathServiceSid, uniqueName);
    }

    /**
     * Create a FieldTypeUpdater to execute update.
     * 
     * @param pathServiceSid The service_sid
     * @param pathSid The sid
     * @return FieldTypeUpdater capable of executing the update
     */
    public static FieldTypeUpdater updater(final String pathServiceSid, 
                                           final String pathSid) {
        return new FieldTypeUpdater(pathServiceSid, pathSid);
    }

    /**
     * Create a FieldTypeDeleter to execute delete.
     * 
     * @param pathServiceSid The service_sid
     * @param pathSid The sid
     * @return FieldTypeDeleter capable of executing the delete
     */
    public static FieldTypeDeleter deleter(final String pathServiceSid, 
                                           final String pathSid) {
        return new FieldTypeDeleter(pathServiceSid, pathSid);
    }

    /**
     * Converts a JSON String into a FieldType object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return FieldType object represented by the provided JSON
     */
    public static FieldType fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FieldType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a FieldType object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return FieldType object represented by the provided JSON
     */
    public static FieldType fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, FieldType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String friendlyName;
    private final Map<String, String> links;
    private final String serviceSid;
    private final String sid;
    private final String uniqueName;
    private final URI url;

    @JsonCreator
    private FieldType(@JsonProperty("account_sid")
                      final String accountSid, 
                      @JsonProperty("date_created")
                      final String dateCreated, 
                      @JsonProperty("date_updated")
                      final String dateUpdated, 
                      @JsonProperty("friendly_name")
                      final String friendlyName, 
                      @JsonProperty("links")
                      final Map<String, String> links, 
                      @JsonProperty("service_sid")
                      final String serviceSid, 
                      @JsonProperty("sid")
                      final String sid, 
                      @JsonProperty("unique_name")
                      final String uniqueName, 
                      @JsonProperty("url")
                      final URI url) {
        this.accountSid = accountSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.links = links;
        this.serviceSid = serviceSid;
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.url = url;
    }

    /**
     * Returns The The account_sid.
     * 
     * @return The account_sid
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The date_created.
     * 
     * @return The date_created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The The date_updated.
     * 
     * @return The date_updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The The friendly_name.
     * 
     * @return The friendly_name
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The The links.
     * 
     * @return The links
     */
    public final Map<String, String> getLinks() {
        return this.links;
    }

    /**
     * Returns The The service_sid.
     * 
     * @return The service_sid
     */
    public final String getServiceSid() {
        return this.serviceSid;
    }

    /**
     * Returns The The sid.
     * 
     * @return The sid
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The The unique_name.
     * 
     * @return The unique_name
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The The url.
     * 
     * @return The url
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        FieldType other = (FieldType) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(links, other.links) && 
               Objects.equals(serviceSid, other.serviceSid) && 
               Objects.equals(sid, other.sid) && 
               Objects.equals(uniqueName, other.uniqueName) && 
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            dateCreated,
                            dateUpdated,
                            friendlyName,
                            links,
                            serviceSid,
                            sid,
                            uniqueName,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("friendlyName", friendlyName)
                          .add("links", links)
                          .add("serviceSid", serviceSid)
                          .add("sid", sid)
                          .add("uniqueName", uniqueName)
                          .add("url", url)
                          .toString();
    }
}