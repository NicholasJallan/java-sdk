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
 * TransactionInvoiceState
 */
public enum TransactionInvoiceState {
	
	@SerializedName("CREATE")
	CREATE("CREATE"),
	
	@SerializedName("OPEN")
	OPEN("OPEN"),
	
	@SerializedName("OVERDUE")
	OVERDUE("OVERDUE"),
	
	@SerializedName("CANCELED")
	CANCELED("CANCELED"),
	
	@SerializedName("PAID")
	PAID("PAID"),
	
	@SerializedName("DERECOGNIZED")
	DERECOGNIZED("DERECOGNIZED"),
	
	@SerializedName("NOT_APPLICABLE")
	NOT_APPLICABLE("NOT_APPLICABLE");

	private String value;

	private TransactionInvoiceState(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

