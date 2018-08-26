/*
 * Copyright (C) 2018 The Android Open Source Project
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

package com.android.settings.homepage;

import com.android.settingslib.core.lifecycle.Lifecycle;

import java.util.List;

//TODO(b/111821137): add test cases
/**
 * Data controller for {@link HomepageCard}.
 */
public interface HomepageCardController {

    @HomepageCard.CardType
    int getCardType();

    /**
     * When data is updated or changed, the new data should be passed to HomepageManager for list
     * updating.
     */
    void onDataUpdated(List<HomepageCard> cardList);

    void onPrimaryClick(HomepageCard card);

    void onActionClick(HomepageCard card);

    void setLifecycle(Lifecycle lifecycle);

    void setHomepageCardUpdateListener(HomepageCardUpdateListener listener);
}
