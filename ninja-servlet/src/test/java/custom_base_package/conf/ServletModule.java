/**
 * Copyright (C) 2012- the original author or authors.
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

package custom_base_package.conf;


// Just a dummy for testing.
// Allows to check that custom Ninja serlvet module in user's conf directory
// is pucked up by the bootstrap process correctly
public class ServletModule extends com.google.inject.servlet.ServletModule {
    
    @Override
    protected void configureServlets() {

        bind(DummyInterfaceForTesting.class).to(DummyClassForTesting.class);

    }
    
    public static interface DummyInterfaceForTesting {
    }
    
    public static class DummyClassForTesting implements DummyInterfaceForTesting {
    }
    
}
