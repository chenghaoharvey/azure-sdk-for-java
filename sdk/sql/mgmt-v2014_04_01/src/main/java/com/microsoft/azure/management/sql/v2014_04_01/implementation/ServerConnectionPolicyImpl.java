/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.ServerConnectionPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.ServerConnectionType;

class ServerConnectionPolicyImpl extends CreatableUpdatableImpl<ServerConnectionPolicy, ServerConnectionPolicyInner, ServerConnectionPolicyImpl> implements ServerConnectionPolicy, ServerConnectionPolicy.Definition, ServerConnectionPolicy.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private ServerConnectionType cconnectionType;
    private ServerConnectionType uconnectionType;

    ServerConnectionPolicyImpl(String name, SqlManager manager) {
        super(name, new ServerConnectionPolicyInner());
        this.manager = manager;
        // Set resource name
        this.serverName = name;
        //
    }

    ServerConnectionPolicyImpl(ServerConnectionPolicyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.serverName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServerConnectionPolicy> createResourceAsync() {
        ServerConnectionPoliciesInner client = this.manager().inner().serverConnectionPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.cconnectionType)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServerConnectionPolicy> updateResourceAsync() {
        ServerConnectionPoliciesInner client = this.manager().inner().serverConnectionPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.uconnectionType)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServerConnectionPolicyInner> getInnerAsync() {
        ServerConnectionPoliciesInner client = this.manager().inner().serverConnectionPolicies();
        return client.getAsync(this.resourceGroupName, this.serverName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public ServerConnectionType connectionType() {
        return this.inner().connectionType();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ServerConnectionPolicyImpl withExistingServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    @Override
    public ServerConnectionPolicyImpl withConnectionType(ServerConnectionType connectionType) {
        if (isInCreateMode()) {
            this.cconnectionType = connectionType;
        } else {
            this.uconnectionType = connectionType;
        }
        return this;
    }

}