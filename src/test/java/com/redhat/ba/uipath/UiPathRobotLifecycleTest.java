/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.ba.uipath;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Assert;

import java.util.Map;

public class UiPathRobotLifecycleTest {


    @Before
    public void prepare() throws Exception {

    }

    @Test
    public void testGetReleases() {
        
        try{
            Map<String, JSONObject> releases = UiPathRobotLifecycle.getReleases();
            Assert.assertTrue(1 == releases.size());
            for(String processKey : releases.keySet()) {
                UiPathRobotLifecycle.startJob(processKey);
            }
        }catch(Exception x){
            x.printStackTrace();
        }
    }
}
