/*
 * Copyright 2012-2021 Aerospike, Inc.
 *
 * Portions may be licensed to Aerospike, Inc. under one or more contributor
 * license agreements WHICH ARE COMPATIBLE WITH THE APACHE LICENSE, VERSION 2.0.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.aerospike.client.policy;

/**
 * Priority of operations on database server.
 * This enum is obsolete and will eventually be removed.
 */
public enum Priority {
	/**
	 * The server defines the priority.
	 */
	DEFAULT,

	/**
	 * Run the database operation in a background thread.
	 */
	LOW,

	/**
	 * Run the database operation at medium priority.
	 */
	MEDIUM,

	/**
	 * Run the database operation at the highest priority.
	 */
	HIGH
}
