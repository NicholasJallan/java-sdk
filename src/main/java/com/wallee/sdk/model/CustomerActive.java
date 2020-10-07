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

import java.util.Objects;


@ApiModel(description = "")

public class CustomerActive extends AbstractCustomerActive {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    public CustomerActive id(Long id) {
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


    public CustomerActive version(Long version) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerActive customerActive = (CustomerActive) o;
        return Objects.equals(this.customerId, customerActive.customerId) &&
                Objects.equals(this.emailAddress, customerActive.emailAddress) &&
                Objects.equals(this.familyName, customerActive.familyName) &&
                Objects.equals(this.givenName, customerActive.givenName) &&
                Objects.equals(this.language, customerActive.language) &&
                Objects.equals(this.metaData, customerActive.metaData) &&
                Objects.equals(this.preferredCurrency, customerActive.preferredCurrency) &&
                Objects.equals(this.id, customerActive.id) &&
                Objects.equals(this.version, customerActive.version) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, emailAddress, familyName, givenName, language, metaData, preferredCurrency, id, version, super.hashCode());
    }


    @Override
    public String toString() {
        return "class CustomerActive { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    customerId: " + toIndentedString(customerId) + " \n" +
            "    emailAddress: " +  toIndentedString(emailAddress) + "\n" +
            "    familyName: " + toIndentedString(familyName) + "\n" +
            "    givenName: " + toIndentedString(givenName) + "\n" +
            "    language: " + toIndentedString(language) +  " \n" +
            "    metaData: " + toIndentedString(metaData) + " \n" +
            "    preferredCurrency: " +  toIndentedString(preferredCurrency) + "\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    version: " +  toIndentedString(version) + "\n" +
            "}";
        }


}

