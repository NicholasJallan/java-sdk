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

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@ApiModel(description = "")

public class InstallmentCalculatedSlice extends Indentable {

    @JsonProperty("amountIncludingTax")
    protected BigDecimal amountIncludingTax;


    @JsonProperty("dueOn")
    protected OffsetDateTime dueOn;


    @JsonProperty("lineItems")
    protected List<LineItem> lineItems;


    /**
     * @return amountIncludingTax
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getAmountIncludingTax() {
        return amountIncludingTax;
    }


    /**
     * @return dueOn
     **/
    @ApiModelProperty(value = "")
    public OffsetDateTime getDueOn() {
        return dueOn;
    }


    /**
     * @return lineItems
     **/
    @ApiModelProperty(value = "")
    public List<LineItem> getLineItems() {
        return lineItems;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstallmentCalculatedSlice installmentCalculatedSlice = (InstallmentCalculatedSlice) o;
        return Objects.equals(this.amountIncludingTax, installmentCalculatedSlice.amountIncludingTax) &&
                Objects.equals(this.dueOn, installmentCalculatedSlice.dueOn) &&
                Objects.equals(this.lineItems, installmentCalculatedSlice.lineItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountIncludingTax, dueOn, lineItems);
    }


    @Override
    public String toString() {

        return "class InstallmentCalculatedSlice { \n" +
            "    amountIncludingTax: " +  toIndentedString(amountIncludingTax) + " \n" +
            "    dueOn: " + toIndentedString(dueOn) + " \n" +
            "    lineItems: " + toIndentedString(lineItems) + " \n" +
            "}";
        }


}

