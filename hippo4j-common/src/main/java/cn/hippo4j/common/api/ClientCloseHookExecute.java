/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.hippo4j.common.api;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Client close hook execute.
 *
 * @author chen.ma
 * @date 2022/1/6 22:14
 */
public interface ClientCloseHookExecute {

    /**
     * Client close hook function execution.
     *
     * @param req
     */
    void closeHook(ClientCloseHookReq req);

    @Data
    @Accessors(chain = true)
    class ClientCloseHookReq {

        /**
         * appName
         */
        private String appName;

        /**
         * instanceId
         */
        private String instanceId;

        /**
         * groupKey
         */
        private String groupKey;
    }
}
