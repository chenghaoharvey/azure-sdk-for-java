/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseSecurityAlertPolicies;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ManagedDatabaseSecurityAlertPolicy;

class ManagedDatabaseSecurityAlertPoliciesImpl extends WrapperImpl<ManagedDatabaseSecurityAlertPoliciesInner> implements ManagedDatabaseSecurityAlertPolicies {
    private final SqlManager manager;

    ManagedDatabaseSecurityAlertPoliciesImpl(SqlManager manager) {
        super(manager.inner().managedDatabaseSecurityAlertPolicies());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public ManagedDatabaseSecurityAlertPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ManagedDatabaseSecurityAlertPolicyImpl wrapModel(ManagedDatabaseSecurityAlertPolicyInner inner) {
        return  new ManagedDatabaseSecurityAlertPolicyImpl(inner, manager());
    }

    private ManagedDatabaseSecurityAlertPolicyImpl wrapModel(String name) {
        return new ManagedDatabaseSecurityAlertPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ManagedDatabaseSecurityAlertPolicy> listByDatabaseAsync(final String resourceGroupName, final String managedInstanceName, final String databaseName) {
        ManagedDatabaseSecurityAlertPoliciesInner client = this.inner();
        return client.listByDatabaseAsync(resourceGroupName, managedInstanceName, databaseName)
        .flatMapIterable(new Func1<Page<ManagedDatabaseSecurityAlertPolicyInner>, Iterable<ManagedDatabaseSecurityAlertPolicyInner>>() {
            @Override
            public Iterable<ManagedDatabaseSecurityAlertPolicyInner> call(Page<ManagedDatabaseSecurityAlertPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ManagedDatabaseSecurityAlertPolicyInner, ManagedDatabaseSecurityAlertPolicy>() {
            @Override
            public ManagedDatabaseSecurityAlertPolicy call(ManagedDatabaseSecurityAlertPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ManagedDatabaseSecurityAlertPolicy> getAsync(String resourceGroupName, String managedInstanceName, String databaseName) {
        ManagedDatabaseSecurityAlertPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, managedInstanceName, databaseName)
        .flatMap(new Func1<ManagedDatabaseSecurityAlertPolicyInner, Observable<ManagedDatabaseSecurityAlertPolicy>>() {
            @Override
            public Observable<ManagedDatabaseSecurityAlertPolicy> call(ManagedDatabaseSecurityAlertPolicyInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((ManagedDatabaseSecurityAlertPolicy)wrapModel(inner));
                }
            }
       });
    }

}