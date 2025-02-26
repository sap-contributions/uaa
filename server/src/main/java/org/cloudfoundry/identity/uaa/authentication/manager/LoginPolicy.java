/*
 * *****************************************************************************
 *     Cloud Foundry 
 *     Copyright (c) [2009-2016] Pivotal Software, Inc. All Rights Reserved.
 *
 *     This product is licensed to you under the Apache License, Version 2.0 (the "License").
 *     You may not use this product except in compliance with the License.
 *
 *     This product includes a number of subcomponents with
 *     separate copyright notices and license terms. Your use of these
 *     subcomponents is subject to the terms and conditions of the
 *     subcomponent's license, as noted in the LICENSE file.
 *******************************************************************************/
package org.cloudfoundry.identity.uaa.authentication.manager;


/**
 * This is a more generic version of AccountLoginPolicy interface, used for both User Login and Client Authentication lockout mechanism.
 *
 */
public interface LoginPolicy {
    Result isAllowed(String principalId);

    LockoutPolicyRetriever getLockoutPolicyRetriever();

    class Result {
        private final boolean isAllowed;
        private final int failureCount;

        public Result(boolean isAllowed, int failureCount) {
            this.isAllowed = isAllowed;
            this.failureCount = failureCount;
        }

        public boolean isAllowed() {
            return isAllowed;
        }

        public int getFailureCount() {
            return failureCount;
        }
    }
}
