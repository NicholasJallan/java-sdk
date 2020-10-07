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

public class TransactionCommentCreate extends AbstractTransactionCommentActive {

    @JsonProperty("transaction")
    protected Long transaction;


    public TransactionCommentCreate transaction(Long transaction) {
        this.transaction = transaction;
        return this;
    }

    /**
     * @return transaction
     **/
    @ApiModelProperty(required = true, value = "")
    public Long getTransaction() {
        return transaction;
    }

    public void setTransaction(Long transaction) {
        this.transaction = transaction;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionCommentCreate transactionCommentCreate = (TransactionCommentCreate) o;
        return Objects.equals(this.content, transactionCommentCreate.content) &&
                Objects.equals(this.transaction, transactionCommentCreate.transaction) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, transaction, super.hashCode());
    }


    @Override
    public String toString() {
        return "class TransactionCommentCreate { \n" +
            "    " + toIndentedString(super.toString()) +  " \n" +
            "    content: " + toIndentedString(content) + " \n" +
            "    transaction: " + toIndentedString(transaction) + "\n" +
            "}";
        }


}

