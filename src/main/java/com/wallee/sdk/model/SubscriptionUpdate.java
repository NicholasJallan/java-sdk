/**
 * SDK
 * <p>
 * This library allows to interact with the  payment service.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.wallee.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;


@ApiModel(description = "")

public class SubscriptionUpdate extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    @JsonProperty("affiliate")
    protected Long affiliate;


    @JsonProperty("description")
    protected String description;


    @JsonProperty("plannedTerminationDate")
    protected OffsetDateTime plannedTerminationDate;


    public SubscriptionUpdate id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public SubscriptionUpdate version(Long version) {
        this.version = version;
        return this;
    }

    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(required = true, value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }


    public SubscriptionUpdate affiliate(Long affiliate) {
        this.affiliate = affiliate;
        return this;
    }

    /**
     * @return affiliate
     **/
    @ApiModelProperty(value = "")
    public Long getAffiliate() {
        return affiliate;
    }

    public void setAffiliate(Long affiliate) {
        this.affiliate = affiliate;
    }


    public SubscriptionUpdate description(String description) {
        this.description = description;
        return this;
    }

    /**
     * @return description
     **/
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public SubscriptionUpdate plannedTerminationDate(OffsetDateTime plannedTerminationDate) {
        this.plannedTerminationDate = plannedTerminationDate;
        return this;
    }

    /**
     * @return plannedTerminationDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getPlannedTerminationDate() {
        return plannedTerminationDate;
    }

    public void setPlannedTerminationDate(OffsetDateTime plannedTerminationDate) {
        this.plannedTerminationDate = plannedTerminationDate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionUpdate subscriptionUpdate = (SubscriptionUpdate) o;
        return Objects.equals(this.id, subscriptionUpdate.id) &&
                Objects.equals(this.version, subscriptionUpdate.version) &&
                Objects.equals(this.affiliate, subscriptionUpdate.affiliate) &&
                Objects.equals(this.description, subscriptionUpdate.description) &&
                Objects.equals(this.plannedTerminationDate, subscriptionUpdate.plannedTerminationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, affiliate, description, plannedTerminationDate);
    }


    @Override
    public String toString() {

        return "class SubscriptionUpdate { \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "    affiliate: " + toIndentedString(affiliate) +  " \n" +
            "    description: " + toIndentedString(description) + " \n" +
            "    plannedTerminationDate: " + toIndentedString(plannedTerminationDate) + " \n" +
            "}";
        }


}

