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

import io.swagger.annotations.ApiModel;

import java.util.Objects;


@ApiModel(description = "")

public class WebhookUrlCreate extends AbstractWebhookUrlUpdate {


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookUrlCreate webhookUrlCreate = (WebhookUrlCreate) o;
        return Objects.equals(this.name, webhookUrlCreate.name) && this.state == webhookUrlCreate.state &&
                Objects.equals(this.url, webhookUrlCreate.url) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, state, url, super.hashCode());
    }


    @Override
    public String toString() {
        return "class WebhookUrlCreate { \n" +
            "    " + toIndentedString(super.toString()) + "\n" +
            "    name: " + toIndentedString(name) + " \n" +
            "    state: " + toIndentedString(state) + "\n" +
            "    url: " + toIndentedString(url) + " \n" +
            "}";
        }


}

