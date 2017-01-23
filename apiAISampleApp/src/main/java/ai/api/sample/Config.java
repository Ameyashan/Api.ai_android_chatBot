package ai.api.sample;

/***********************************************************************************************************************
 *
 * API.AI Android SDK -  API.AI libraries usage example
 * =================================================
 *
 * Copyright (C) 2014 by Speaktoit, Inc. (https://www.speaktoit.com)
 * https://www.api.ai
 *
 ***********************************************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 ***********************************************************************************************************************/

public abstract class Config {
    // copy this keys from your developer dashboard
    public static final String ACCESS_TOKEN = "7138bd121fe3462babb43d6c65ee4d10";
    public static final String FIREBASE_URL = "https://amishw-93851.firebaseio.com/";

    public static final LanguageConfig[] languages = new LanguageConfig[]{
            new LanguageConfig("en", "a11ea1d839e3446d84e402cb97cdadfb"),

    };

    public static final String[] events = new String[]{
            "hello_event",
            "goodbye_event",
            "how_are_you_event"
    };
}
