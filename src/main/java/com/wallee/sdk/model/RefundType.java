/**
 * Wallee SDK Client
 *
 * This client allows to interact with the Wallee API.
 *
 * Wallee API: 1.0.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wallee.sdk.model;

import com.google.gson.annotations.SerializedName;


/**
 * RefundType
 */
public enum RefundType {
	
	@SerializedName("CUSTOMER_INITIATED_AUTOMATIC")
	CUSTOMER_INITIATED_AUTOMATIC("CUSTOMER_INITIATED_AUTOMATIC"),
	
	@SerializedName("CUSTOMER_INITIATED_MANUAL")
	CUSTOMER_INITIATED_MANUAL("CUSTOMER_INITIATED_MANUAL"),
	
	@SerializedName("MERCHANT_INITIATED_ONLINE")
	MERCHANT_INITIATED_ONLINE("MERCHANT_INITIATED_ONLINE"),
	
	@SerializedName("MERCHANT_INITIATED_OFFLINE")
	MERCHANT_INITIATED_OFFLINE("MERCHANT_INITIATED_OFFLINE");

	private String value;

	private RefundType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

