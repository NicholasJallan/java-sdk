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

import java.util.Map;
import java.util.Objects;


@ApiModel(description = "")

public class TwoFactorAuthenticationType extends Indentable {

    @JsonProperty("description")
    protected Map<String, String> description;


    @JsonProperty("feature")
    protected Long feature;


    @JsonProperty("icon")
    protected String icon;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("name")
    protected Map<String, String> name;


    /**
     * @return description
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getDescription() {
        return description;
    }


    /**
     * @return feature
     **/
    @ApiModelProperty(value = "")
    public Long getFeature() {
        return feature;
    }


    /**
     * @return icon
     **/
    @ApiModelProperty(value = "")
    public String getIcon() {
        return icon;
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
     * @return name
     **/
    @ApiModelProperty(value = "")
    public Map<String, String> getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TwoFactorAuthenticationType twoFactorAuthenticationType = (TwoFactorAuthenticationType) o;
        return Objects.equals(this.description, twoFactorAuthenticationType.description) &&
                Objects.equals(this.feature, twoFactorAuthenticationType.feature) &&
                Objects.equals(this.icon, twoFactorAuthenticationType.icon) &&
                Objects.equals(this.id, twoFactorAuthenticationType.id) &&
                Objects.equals(this.name, twoFactorAuthenticationType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, feature, icon, id, name);
    }


    @Override
    public String toString() {

      return "class TwoFactorAuthenticationType { \n" +
            "    description: " + toIndentedString(description) +  " \n" +
            "    feature: " + toIndentedString(feature) + " \n" +
            "    icon: " + toIndentedString(icon) +  " \n" +
            "    id: " + toIndentedString(id) + " \n" +
            "    name: " + toIndentedString(name) + " \n" +
            "}";
      }


}

