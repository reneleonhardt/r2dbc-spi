/*
 * Copyright 2019 the original author or authors.
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

package io.r2dbc.spi.test;

import io.r2dbc.spi.ConnectionMetadata;

public final class MockConnectionMetadata implements ConnectionMetadata {

    public static final MockConnectionMetadata INSTANCE = new MockConnectionMetadata();

    public static final String NAME = "MockConnectionMetadata";

    public static final String VERSION = "0.8.0";

    private MockConnectionMetadata() {
    }

    @Override
    public String getDatabaseProductName() {
        return NAME;
    }

    @Override
    public String getDatabaseVersion() {
        return VERSION;
    }
}
