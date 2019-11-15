/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_06_01.implementation;

import com.microsoft.azure.management.network.v2019_06_01.VirtualMachineScaleSetNetworkInterfaceIPConfiguration;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.network.v2019_06_01.ApplicationGatewayBackendAddressPool;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2019_06_01.ApplicationSecurityGroup;
import com.microsoft.azure.management.network.v2019_06_01.BackendAddressPool;
import com.microsoft.azure.management.network.v2019_06_01.InboundNatRule;
import com.microsoft.azure.management.network.v2019_06_01.IPVersion;
import com.microsoft.azure.management.network.v2019_06_01.IPAllocationMethod;
import com.microsoft.azure.management.network.v2019_06_01.PublicIPAddress;
import com.microsoft.azure.management.network.v2019_06_01.Subnet;
import com.microsoft.azure.management.network.v2019_06_01.VirtualNetworkTap;

class VirtualMachineScaleSetNetworkInterfaceIPConfigurationImpl extends IndexableRefreshableWrapperImpl<VirtualMachineScaleSetNetworkInterfaceIPConfiguration, NetworkInterfaceIPConfigurationInner> implements VirtualMachineScaleSetNetworkInterfaceIPConfiguration {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String virtualMachineScaleSetName;
    private String virtualmachineIndex;
    private String networkInterfaceName;
    private String ipConfigurationName;

    VirtualMachineScaleSetNetworkInterfaceIPConfigurationImpl(NetworkInterfaceIPConfigurationInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.virtualMachineScaleSetName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachineScaleSets");
        this.virtualmachineIndex = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualMachines");
        this.networkInterfaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "networkInterfaces");
        this.ipConfigurationName = IdParsingUtils.getValueFromIdByName(inner.id(), "ipConfigurations");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<NetworkInterfaceIPConfigurationInner> getInnerAsync() {
        NetworkInterfacesInner client = this.manager().inner().networkInterfaces();
        return client.getVirtualMachineScaleSetIpConfigurationAsync(this.resourceGroupName, this.virtualMachineScaleSetName, this.virtualmachineIndex, this.networkInterfaceName, this.ipConfigurationName);
    }



    @Override
    public List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools() {
        return this.inner().applicationGatewayBackendAddressPools();
    }

    @Override
    public List<ApplicationSecurityGroup> applicationSecurityGroups() {
        List<ApplicationSecurityGroup> lst = new ArrayList<ApplicationSecurityGroup>();
        if (this.inner().applicationSecurityGroups() != null) {
            for (ApplicationSecurityGroupInner inner : this.inner().applicationSecurityGroups()) {
                lst.add( new ApplicationSecurityGroupImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<BackendAddressPool> loadBalancerBackendAddressPools() {
        List<BackendAddressPool> lst = new ArrayList<BackendAddressPool>();
        if (this.inner().loadBalancerBackendAddressPools() != null) {
            for (BackendAddressPoolInner inner : this.inner().loadBalancerBackendAddressPools()) {
                lst.add( new BackendAddressPoolImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public List<InboundNatRule> loadBalancerInboundNatRules() {
        List<InboundNatRule> lst = new ArrayList<InboundNatRule>();
        if (this.inner().loadBalancerInboundNatRules() != null) {
            for (InboundNatRuleInner inner : this.inner().loadBalancerInboundNatRules()) {
                lst.add( new InboundNatRuleImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean primary() {
        return this.inner().primary();
    }

    @Override
    public String privateIPAddress() {
        return this.inner().privateIPAddress();
    }

    @Override
    public IPVersion privateIPAddressVersion() {
        return this.inner().privateIPAddressVersion();
    }

    @Override
    public IPAllocationMethod privateIPAllocationMethod() {
        return this.inner().privateIPAllocationMethod();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PublicIPAddress publicIPAddress() {
        PublicIPAddressInner inner = this.inner().publicIPAddress();
        if (inner != null) {
            return  new PublicIPAddressImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public Subnet subnet() {
        SubnetInner inner = this.inner().subnet();
        if (inner != null) {
            return  new SubnetImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public List<VirtualNetworkTap> virtualNetworkTaps() {
        List<VirtualNetworkTap> lst = new ArrayList<VirtualNetworkTap>();
        if (this.inner().virtualNetworkTaps() != null) {
            for (VirtualNetworkTapInner inner : this.inner().virtualNetworkTaps()) {
                lst.add( new VirtualNetworkTapImpl(inner.name(), inner, manager()));
            }
        }
        return lst;
    }

}