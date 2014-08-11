/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.overlord.apiman.rt.engine.policy;

import org.overlord.apiman.rt.engine.beans.PolicyFailure;
import org.overlord.apiman.rt.engine.beans.PolicyFailureType;

/**
 * Factory to create failures.
 * 
 * @author Marc Savy <msavy@redhat.com>
 */
public class PolicyFailureFactory {
    
    /**
     * Creates a policy failure.
     * @param type
     * @param failureCode
     * @param message
     */
    public static PolicyFailure createFailure(PolicyFailureType type, int failureCode, String message) {
        PolicyFailure failure = new PolicyFailure(type, failureCode, message);
        return failure;
    }
}
