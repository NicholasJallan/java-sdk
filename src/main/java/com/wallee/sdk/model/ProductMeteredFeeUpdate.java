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
import com.wallee.sdk.model.enums.ProductMeteredTierPricing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

@ApiModel(description = "")

public class ProductMeteredFeeUpdate extends Indentable {

    @JsonProperty("id")
    protected Long id;


    @JsonProperty("version")
    protected Long version;


    @JsonProperty("component")
    protected Long component;


    @JsonProperty("description")
    protected DatabaseTranslatedStringCreate description;


    @JsonProperty("metric")
    protected Long metric;


    @JsonProperty("name")
    protected DatabaseTranslatedStringCreate name;


    @JsonProperty("tierPricing")
    protected ProductMeteredTierPricing tierPricing;


    public ProductMeteredFeeUpdate id(Long id) {
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


    public ProductMeteredFeeUpdate version(Long version) {
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


    public ProductMeteredFeeUpdate component(Long component) {
        this.component = component;
        return this;
    }

    /**
     * @return component
     **/
    @ApiModelProperty(value = "")
    public Long getComponent() {
        return component;
    }

    public void setComponent(Long component) {
        this.component = component;
    }


    public ProductMeteredFeeUpdate description(DatabaseTranslatedStringCreate description) {
        this.description = description;
        return this;
    }

    /**
     * The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.
     *
     * @return description
     **/
    @ApiModelProperty(value = "The description of a component fee describes the fee to the subscriber. The description may be shown in documents or on certain user interfaces.")
    public DatabaseTranslatedStringCreate getDescription() {
        return description;
    }

    public void setDescription(DatabaseTranslatedStringCreate description) {
        this.description = description;
    }


    public ProductMeteredFeeUpdate metric(Long metric) {
        this.metric = metric;
        return this;
    }

    /**
     * @return metric
     **/
    @ApiModelProperty(value = "")
    public Long getMetric() {
        return metric;
    }

    public void setMetric(Long metric) {
        this.metric = metric;
    }


    public ProductMeteredFeeUpdate name(DatabaseTranslatedStringCreate name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the fee should describe for the subscriber in few words for what the fee is for.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of the fee should describe for the subscriber in few words for what the fee is for.")
    public DatabaseTranslatedStringCreate getName() {
        return name;
    }

    public void setName(DatabaseTranslatedStringCreate name) {
        this.name = name;
    }


    public ProductMeteredFeeUpdate tierPricing(ProductMeteredTierPricing tierPricing) {
        this.tierPricing = tierPricing;
        return this;
    }

    /**
     * The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation.
     *
     * @return tierPricing
     **/
    @ApiModelProperty(value = "The tier pricing determines the calculation method of the tiers. The prices of the different tiers can be applied in different ways. The tier pricing controls this calculation.")
    public ProductMeteredTierPricing getTierPricing() {
        return tierPricing;
    }

    public void setTierPricing(ProductMeteredTierPricing tierPricing) {
        this.tierPricing = tierPricing;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductMeteredFeeUpdate productMeteredFeeUpdate = (ProductMeteredFeeUpdate) o;
        return Objects.equals(this.id, productMeteredFeeUpdate.id) &&
                Objects.equals(this.version, productMeteredFeeUpdate.version) &&
                Objects.equals(this.component, productMeteredFeeUpdate.component) &&
                Objects.equals(this.description, productMeteredFeeUpdate.description) &&
                Objects.equals(this.metric, productMeteredFeeUpdate.metric) &&
                Objects.equals(this.name, productMeteredFeeUpdate.name) && this.tierPricing
                == productMeteredFeeUpdate.tierPricing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, component, description, metric, name, tierPricing);
    }


    @Override
    public String toString() {

        return "class ProductMeteredFeeUpdate {\n" +
            "    id: " + toIndentedString(id) + "\n" +
            "    version: " + toIndentedString(version) + "\n" +
            "    component: " + toIndentedString(component) +  "\n" +
            "    description: " + toIndentedString(description) + "\n" +
            "    metric: " + toIndentedString(metric) + "\n" +
            "    name: " + toIndentedString(name) + "\n" +
            "    tierPricing: " + toIndentedString(tierPricing) + "\n" +
            "}";
        }


}

