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
import com.wallee.sdk.model.enums.CreationEntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The installment plan allows to setup a template for an installment.
 */
@ApiModel(description = "The installment plan allows to setup a template for an installment.")

public class InstallmentPlanConfiguration extends Indentable {

    @JsonProperty("baseCurrency")
    protected String baseCurrency;


    @JsonProperty("conditions")
    protected List<Long> conditions;


    @JsonProperty("id")
    protected Long id;


    @JsonProperty("installmentFee")
    protected BigDecimal installmentFee;


    @JsonProperty("interestRate")
    protected BigDecimal interestRate;


    @JsonProperty("linkedSpaceId")
    protected Long linkedSpaceId;


    @JsonProperty("minimalAmount")
    protected BigDecimal minimalAmount;


    @JsonProperty("name")
    protected String name;


    @JsonProperty("paymentMethodConfigurations")
    protected List<Long> paymentMethodConfigurations;


    @JsonProperty("plannedPurgeDate")
    protected OffsetDateTime plannedPurgeDate;


    @JsonProperty("sortOrder")
    protected Integer sortOrder;


    @JsonProperty("spaceReference")
    protected SpaceReference spaceReference;


    @JsonProperty("state")
    protected CreationEntityState state;


    @JsonProperty("taxClass")
    protected TaxClass taxClass;


    @JsonProperty("termsAndConditions")
    protected ResourcePath termsAndConditions;


    @JsonProperty("title")
    protected DatabaseTranslatedString title;


    @JsonProperty("version")
    protected Integer version;


    /**
     * The base currency in which the installment fee and minimal amount are defined.
     *
     * @return baseCurrency
     **/
    @ApiModelProperty(value = "The base currency in which the installment fee and minimal amount are defined.")
    public String getBaseCurrency() {
        return baseCurrency;
    }


    /**
     * If a transaction meets all selected conditions the installment plan will be available to the customer to be selected.
     *
     * @return conditions
     **/
    @ApiModelProperty(value = "If a transaction meets all selected conditions the installment plan will be available to the customer to be selected.")
    public List<Long> getConditions() {
        return conditions;
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
     * The installment fee is a fixed amount that is charged additionally when applying this installment plan.
     *
     * @return installmentFee
     **/
    @ApiModelProperty(value = "The installment fee is a fixed amount that is charged additionally when applying this installment plan.")
    public BigDecimal getInstallmentFee() {
        return installmentFee;
    }


    /**
     * The interest rate is a percentage of the total amount that is charged additionally when applying this installment plan.
     *
     * @return interestRate
     **/
    @ApiModelProperty(value = "The interest rate is a percentage of the total amount that is charged additionally when applying this installment plan.")
    public BigDecimal getInterestRate() {
        return interestRate;
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
     * The installment plan can only be applied if the orders total is at least the defined minimal amount.
     *
     * @return minimalAmount
     **/
    @ApiModelProperty(value = "The installment plan can only be applied if the orders total is at least the defined minimal amount.")
    public BigDecimal getMinimalAmount() {
        return minimalAmount;
    }


    /**
     * The installment plan name is used internally to identify the plan in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.
     *
     * @return name
     **/
    @ApiModelProperty(value = "The installment plan name is used internally to identify the plan in administrative interfaces.For example it is used within search fields and hence it should be distinct and descriptive.")
    public String getName() {
        return name;
    }


    /**
     * A installment plan can be enabled only for specific payment method configurations. Other payment methods will not be selectable by the buyer.
     *
     * @return paymentMethodConfigurations
     **/
    @ApiModelProperty(value = "A installment plan can be enabled only for specific payment method configurations. Other payment methods will not be selectable by the buyer.")
    public List<Long> getPaymentMethodConfigurations() {
        return paymentMethodConfigurations;
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
     * The sort order controls in which order the installation plans are listed. The sort order is used to order the plans in ascending order.
     *
     * @return sortOrder
     **/
    @ApiModelProperty(value = "The sort order controls in which order the installation plans are listed. The sort order is used to order the plans in ascending order.")
    public Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * @return spaceReference
     **/
    @ApiModelProperty(value = "")
    public SpaceReference getSpaceReference() {
        return spaceReference;
    }


    /**
     * @return state
     **/
    @ApiModelProperty(value = "")
    public CreationEntityState getState() {
        return state;
    }


    /**
     * The tax class determines the taxes which are applicable on all fees linked to the installment plan.
     *
     * @return taxClass
     **/
    @ApiModelProperty(value = "The tax class determines the taxes which are applicable on all fees linked to the installment plan.")
    public TaxClass getTaxClass() {
        return taxClass;
    }


    /**
     * The terms and conditions will be displayed to the customer when he or she selects this installment plan.
     *
     * @return termsAndConditions
     **/
    @ApiModelProperty(value = "The terms and conditions will be displayed to the customer when he or she selects this installment plan.")
    public ResourcePath getTermsAndConditions() {
        return termsAndConditions;
    }


    /**
     * The title of the installment plan is used within the payment process. The title is visible to the buyer.
     *
     * @return title
     **/
    @ApiModelProperty(value = "The title of the installment plan is used within the payment process. The title is visible to the buyer.")
    public DatabaseTranslatedString getTitle() {
        return title;
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
        InstallmentPlanConfiguration installmentPlanConfiguration = (InstallmentPlanConfiguration) o;
        return Objects.equals(this.baseCurrency, installmentPlanConfiguration.baseCurrency) &&
                Objects.equals(this.conditions, installmentPlanConfiguration.conditions) &&
                Objects.equals(this.id, installmentPlanConfiguration.id) &&
                Objects.equals(this.installmentFee, installmentPlanConfiguration.installmentFee) &&
                Objects.equals(this.interestRate, installmentPlanConfiguration.interestRate) &&
                Objects.equals(this.linkedSpaceId, installmentPlanConfiguration.linkedSpaceId) &&
                Objects.equals(this.minimalAmount, installmentPlanConfiguration.minimalAmount) &&
                Objects.equals(this.name, installmentPlanConfiguration.name) &&
                Objects.equals(this.paymentMethodConfigurations, installmentPlanConfiguration.paymentMethodConfigurations) &&
                Objects.equals(this.plannedPurgeDate, installmentPlanConfiguration.plannedPurgeDate) &&
                Objects.equals(this.sortOrder, installmentPlanConfiguration.sortOrder) &&
                Objects.equals(this.spaceReference, installmentPlanConfiguration.spaceReference) && this.state
                == installmentPlanConfiguration.state &&
                Objects.equals(this.taxClass, installmentPlanConfiguration.taxClass) &&
                Objects.equals(this.termsAndConditions, installmentPlanConfiguration.termsAndConditions) &&
                Objects.equals(this.title, installmentPlanConfiguration.title) &&
                Objects.equals(this.version, installmentPlanConfiguration.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseCurrency, conditions, id, installmentFee, interestRate, linkedSpaceId, minimalAmount, name, paymentMethodConfigurations, plannedPurgeDate, sortOrder, spaceReference, state, taxClass, termsAndConditions, title, version);
    }


    @Override
    public String toString() {

        return "class InstallmentPlanConfiguration { \n" +
            "    baseCurrency: " + toIndentedString(baseCurrency) + "\n" +
            "    conditions: " + toIndentedString(conditions) + " \n" +
            "    id: " + toIndentedString(id) +  " \n" +
            "    installmentFee: " + toIndentedString(installmentFee) + " \n" +
            "    interestRate: " +  toIndentedString(interestRate) + " \n" +
            "    linkedSpaceId: " + toIndentedString(linkedSpaceId) + " \n" +
            "    minimalAmount: " + toIndentedString(minimalAmount) + " \n" +
            "    name: " + toIndentedString(name) +  " \n" +
            "    paymentMethodConfigurations: " + toIndentedString(paymentMethodConfigurations) +  " \n" +
            "    plannedPurgeDate: " + toIndentedString(plannedPurgeDate) + " \n" +
            "    sortOrder: " + toIndentedString(sortOrder) + " \n" +
            "    spaceReference: " + toIndentedString(spaceReference) +  " \n" +
            "    state: " + toIndentedString(state) + " \n" +
            "    taxClass: " + toIndentedString(taxClass) +  " \n" +
            "    termsAndConditions: " + toIndentedString(termsAndConditions) + " \n" +
            "    title: " + toIndentedString(title) + " \n" +
            "    version: " + toIndentedString(version) + " \n" +
            "}";
        }


}

