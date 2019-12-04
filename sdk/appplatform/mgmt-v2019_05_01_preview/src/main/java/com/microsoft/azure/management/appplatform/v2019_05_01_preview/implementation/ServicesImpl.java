/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.Services;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.ServiceResource;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.TestKeys;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.TestKeyType;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.NameAvailability;
import com.microsoft.azure.management.appplatform.v2019_05_01_preview.NameAvailabilityParameters;

class ServicesImpl extends WrapperImpl<ServicesInner> implements Services {
    private final AppPlatformManager manager;

    ServicesImpl(AppPlatformManager manager) {
        super(manager.inner().services());
        this.manager = manager;
    }

    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ServiceResource> getByResourceGroupAsync(String resourceGroupName, String serviceName) {
        ServicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, serviceName)
        .map(new Func1<ServiceResourceInner, ServiceResource>() {
            @Override
            public ServiceResource call(ServiceResourceInner inner) {
                return new ServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceResource> createOrUpdateAsync(String resourceGroupName, String serviceName) {
        ServicesInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, serviceName)
        .map(new Func1<ServiceResourceInner, ServiceResource>() {
            @Override
            public ServiceResource call(ServiceResourceInner inner) {
                return new ServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName) {
        ServicesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName).toCompletable();
    }

    @Override
    public Observable<ServiceResource> updateAsync(String resourceGroupName, String serviceName) {
        ServicesInner client = this.inner();
        return client.updateAsync(resourceGroupName, serviceName)
        .map(new Func1<ServiceResourceInner, ServiceResource>() {
            @Override
            public ServiceResource call(ServiceResourceInner inner) {
                return new ServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TestKeys> regenerateTestKeyAsync(String resourceGroupName, String serviceName, TestKeyType keyType) {
        ServicesInner client = this.inner();
        return client.regenerateTestKeyAsync(resourceGroupName, serviceName, keyType)
        .map(new Func1<TestKeysInner, TestKeys>() {
            @Override
            public TestKeys call(TestKeysInner inner) {
                return new TestKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable disableTestEndpointAsync(String resourceGroupName, String serviceName) {
        ServicesInner client = this.inner();
        return client.disableTestEndpointAsync(resourceGroupName, serviceName).toCompletable();
    }

    @Override
    public Observable<TestKeys> enableTestEndpointAsync(String resourceGroupName, String serviceName) {
        ServicesInner client = this.inner();
        return client.enableTestEndpointAsync(resourceGroupName, serviceName)
        .map(new Func1<TestKeysInner, TestKeys>() {
            @Override
            public TestKeys call(TestKeysInner inner) {
                return new TestKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceResource> listAsync() {
        ServicesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ServiceResourceInner>, Iterable<ServiceResourceInner>>() {
            @Override
            public Iterable<ServiceResourceInner> call(Page<ServiceResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServiceResourceInner, ServiceResource>() {
            @Override
            public ServiceResource call(ServiceResourceInner inner) {
                return new ServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ServiceResource> listByResourceGroupAsync(final String resourceGroupName) {
        ServicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ServiceResourceInner>, Iterable<ServiceResourceInner>>() {
            @Override
            public Iterable<ServiceResourceInner> call(Page<ServiceResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ServiceResourceInner, ServiceResource>() {
            @Override
            public ServiceResource call(ServiceResourceInner inner) {
                return new ServiceResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TestKeys> listTestKeysAsync(String resourceGroupName, String serviceName) {
        ServicesInner client = this.inner();
        return client.listTestKeysAsync(resourceGroupName, serviceName)
        .map(new Func1<TestKeysInner, TestKeys>() {
            @Override
            public TestKeys call(TestKeysInner inner) {
                return new TestKeysImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<NameAvailability> checkNameAvailabilityAsync(String location, NameAvailabilityParameters availabilityParameters) {
        ServicesInner client = this.inner();
        return client.checkNameAvailabilityAsync(location, availabilityParameters)
        .map(new Func1<NameAvailabilityInner, NameAvailability>() {
            @Override
            public NameAvailability call(NameAvailabilityInner inner) {
                return new NameAvailabilityImpl(inner, manager());
            }
        });
    }

}