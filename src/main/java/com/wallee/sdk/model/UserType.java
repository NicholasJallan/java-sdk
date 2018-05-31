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
 * UserType
 */
public enum UserType {
	
	@SerializedName("HUMAN_USER")
	HUMAN_USER("HUMAN_USER"),
	
	@SerializedName("SINGLE_SIGNON_USER")
	SINGLE_SIGNON_USER("SINGLE_SIGNON_USER"),
	
	@SerializedName("APPLICATION_USER")
	APPLICATION_USER("APPLICATION_USER"),
	
	@SerializedName("ANONYMOUS_USER")
	ANONYMOUS_USER("ANONYMOUS_USER"),
	
	@SerializedName("SERVER_USER")
	SERVER_USER("SERVER_USER");

	private String value;

	private UserType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}
}

