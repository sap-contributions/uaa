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
package org.cloudfoundry.identity.uaa.resources;

import java.util.List;

public interface ResourceManager<T> {

    List<T> retrieveAll(String zoneId);

    T retrieve(String id, String zoneId);

    T create(T resource, String zoneId);

    T update(String id, T resource, String zoneId);

    T delete(String id, int version, String zoneId);

}
