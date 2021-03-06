/**
 * Copyright 2016 Hortonworks.
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
 **/
package com.hortonworks.registries.storage.exception;

import com.google.common.base.Preconditions;

/**
 * This exception acts as a marker that exception should not incur rolling back transaction.
 * Caused exception should be provided as well. Passing null to that will throw a NullPointerException.
 */
public class IgnoreTransactionRollbackException extends Exception {

    public IgnoreTransactionRollbackException(Exception cause) {
        super(cause);

        // disallows passing null
        Preconditions.checkNotNull(cause);
    }
}
