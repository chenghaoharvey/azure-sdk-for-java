/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2015_08_01.implementation;

import com.microsoft.azure.management.servicebus.v2015_08_01.QueueNamespaceSharedAccessAuthorizationRuleResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.servicebus.v2015_08_01.SharedAccessAuthorizationRuleCreateOrUpdateParameters;
import java.util.List;
import com.microsoft.azure.management.servicebus.v2015_08_01.AccessRights;
import rx.functions.Func1;

class QueueNamespaceSharedAccessAuthorizationRuleResourceImpl extends CreatableUpdatableImpl<QueueNamespaceSharedAccessAuthorizationRuleResource, SharedAccessAuthorizationRuleResourceInner, QueueNamespaceSharedAccessAuthorizationRuleResourceImpl> implements QueueNamespaceSharedAccessAuthorizationRuleResource, QueueNamespaceSharedAccessAuthorizationRuleResource.Definition, QueueNamespaceSharedAccessAuthorizationRuleResource.Update {
    private final ServiceBusManager manager;
    private String resourceGroupName;
    private String namespaceName;
    private String queueName;
    private String authorizationRuleName;
    private SharedAccessAuthorizationRuleCreateOrUpdateParameters createOrUpdateParameter;

    QueueNamespaceSharedAccessAuthorizationRuleResourceImpl(String name, ServiceBusManager manager) {
        super(name, new SharedAccessAuthorizationRuleResourceInner());
        this.manager = manager;
        // Set resource name
        this.authorizationRuleName = name;
        //
        this.createOrUpdateParameter = new SharedAccessAuthorizationRuleCreateOrUpdateParameters();
    }

    QueueNamespaceSharedAccessAuthorizationRuleResourceImpl(SharedAccessAuthorizationRuleResourceInner inner, ServiceBusManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.authorizationRuleName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "namespaces");
        this.queueName = IdParsingUtils.getValueFromIdByName(inner.id(), "queues");
        this.authorizationRuleName = IdParsingUtils.getValueFromIdByName(inner.id(), "authorizationRules");
        //
        this.createOrUpdateParameter = new SharedAccessAuthorizationRuleCreateOrUpdateParameters();
    }

    @Override
    public ServiceBusManager manager() {
        return this.manager;
    }

    @Override
    public Observable<QueueNamespaceSharedAccessAuthorizationRuleResource> createResourceAsync() {
        QueuesInner client = this.manager().inner().queues();
        return client.createOrUpdateAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.queueName, this.authorizationRuleName, this.createOrUpdateParameter)
            .map(new Func1<SharedAccessAuthorizationRuleResourceInner, SharedAccessAuthorizationRuleResourceInner>() {
               @Override
               public SharedAccessAuthorizationRuleResourceInner call(SharedAccessAuthorizationRuleResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<QueueNamespaceSharedAccessAuthorizationRuleResource> updateResourceAsync() {
        QueuesInner client = this.manager().inner().queues();
        return client.createOrUpdateAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.queueName, this.authorizationRuleName, this.createOrUpdateParameter)
            .map(new Func1<SharedAccessAuthorizationRuleResourceInner, SharedAccessAuthorizationRuleResourceInner>() {
               @Override
               public SharedAccessAuthorizationRuleResourceInner call(SharedAccessAuthorizationRuleResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SharedAccessAuthorizationRuleResourceInner> getInnerAsync() {
        QueuesInner client = this.manager().inner().queues();
        return client.getAuthorizationRuleAsync(this.resourceGroupName, this.namespaceName, this.queueName, this.authorizationRuleName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new SharedAccessAuthorizationRuleCreateOrUpdateParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
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
    public List<AccessRights> rights() {
        return this.inner().rights();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public QueueNamespaceSharedAccessAuthorizationRuleResourceImpl withExistingQueue(String resourceGroupName, String namespaceName, String queueName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        this.queueName = queueName;
        return this;
    }

    @Override
    public QueueNamespaceSharedAccessAuthorizationRuleResourceImpl withRights(List<AccessRights> rights) {
        this.createOrUpdateParameter.withRights(rights);
        return this;
    }

    @Override
    public QueueNamespaceSharedAccessAuthorizationRuleResourceImpl withLocation(String location) {
        this.createOrUpdateParameter.withLocation(location);
        return this;
    }

    @Override
    public QueueNamespaceSharedAccessAuthorizationRuleResourceImpl withName(String name) {
        this.createOrUpdateParameter.withName(name);
        return this;
    }

}
