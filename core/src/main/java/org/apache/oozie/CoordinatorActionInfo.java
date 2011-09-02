/**
 * Copyright (c) 2010 Yahoo! Inc. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. See accompanying LICENSE file.
 */
package org.apache.oozie;

import java.util.List;

public class CoordinatorActionInfo {
    private List<CoordinatorActionBean> actions;

    /**
     * Create a coordiantor actions info bean.
     *
     * @param coordiantor actions being returned.
     */
    public CoordinatorActionInfo(List<CoordinatorActionBean> actions) {
        this.actions = actions;
    }

    /**
     * Return the coordiantor actions being returned.
     *
     * @return the coordiantor actions being returned.
     */
    public List<CoordinatorActionBean> getCoordActions() {
        return actions;
    }
}
