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
import com.wallee.sdk.model.enums.TransactionGroupState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

@ApiModel(description = "")

public class TransactionGroup extends Indentable {

    @JsonProperty("beginDate")
    protected OffsetDateTime beginDate;


    @JsonProperty("customerId")
    protected String customerId;


    @JsonProperty("endDate")
    protected OffsetDateTime endDate;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("state")
    protected TransactionGroupState state;


    @JsonProperty("version")
    protected Integer version;


    /**
     * @return beginDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getBeginDate() {
        return beginDate;
    }


    /**
     * @return customerId
     **/
    @ApiModelProperty(value = "")
    public String getCustomerId() {
        return customerId;
    }


    /**
     * @return endDate
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getEndDate() {
        return endDate;
    }


    /**
     * The ID is the primary key of the entity. The ID identifies the entity uniquely.
     *
     * @return id
     **/
    @ApiModelProperty(value = "The ID is the primary key of the entity. The ID identifies the entity uniquely.")
    public Long getId() {
        return id;
    }


    /**
     * The linked space id holds the ID of the space to which the entity belongs to.
     *
     * @return linkedSpaceId
     **/
    @ApiModelProperty(value = "The linked space id holds the ID of the space to which the entity belongs to.")
    public Long getLinkedSpaceId() {
        return linkedSpaceId;
    }


    /**
     * The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.
     *
     * @return plannedPurgeDate
     **/
    @ApiModelProperty(value = "The planned purge date indicates when the entity is permanently removed. When the date is null the entity is not planned to be removed.")
    public OffsetDateTime getPlannedPurgeDate() {
        return plannedPurgeDate;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public TransactionGroupState getState() {
        return state;
    }


    /**
     * The version number indicates the version of the entity. The version is incremented whenever the entity is changed.
     *
     * @return version
     **/
    @ApiModelProperty(value = "The version number indicates the version of the entity. The version is incremented whenever the entity is changed.")
    public Integer getVersion() {
        return version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionGroup transactionGroup = (TransactionGroup) o;
        return Objects.equals(this.beginDate, transactionGroup.beginDate) &&
                Objects.equals(this.customerId, transactionGroup.customerId) &&
                Objects.equals(this.endDate, transactionGroup.endDate) &&
                Objects.equals(this.id, transactionGroup.id) &&
                Objects.equals(this.linkedSpaceId, transactionGroup.linkedSpaceId) &&
                Objects.equals(this.plannedPurgeDate, transactionGroup.plannedPurgeDate) && this.state
                == transactionGroup.state &&
                Objects.equals(this.version, transactionGroup.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginDate, customerId, endDate, id, linkedSpaceId, plannedPurgeDate, state, version);
    }


    @Override
    public String toString() {

        return "class TransactionGroup { \n" +
            "    beginDate: " + toIndentedString(beginDate) +  " \n" +
            "    customerId: " + toIndentedString(customerId) + " \n" +
            "    endDate: " + toIndentedString(endDate) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + "\n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + "\n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "}";
        }


}

