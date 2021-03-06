// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.samples;

import com.azure.resourcemanager.cdn.samples.ManageCdnProfileWithCustomDomain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CdnSampleTests extends SamplesTestBase {

    @Test
    public void testManageCdnProfileWithCustomDomain() {
        Assertions.assertTrue(ManageCdnProfileWithCustomDomain.runSample(azureResourceManager));
    }
}
