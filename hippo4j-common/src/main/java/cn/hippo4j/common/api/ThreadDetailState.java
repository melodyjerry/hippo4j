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

import cn.hippo4j.common.model.ThreadDetailStateInfo;

import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Get thread status in thread pool.
 *
 * @author chen.ma
 * @date 2022/1/9 12:47
 */
public interface ThreadDetailState {

    /**
     * Get thread status in thread pool.
     *
     * @param threadPoolId
     * @return
     */
    List<ThreadDetailStateInfo> getThreadDetailStateInfo(String threadPoolId);

    /**
     * Get thread status in thread pool.
     *
     * @param threadPoolExecutor
     * @return
     */
    List<ThreadDetailStateInfo> getThreadDetailStateInfo(ThreadPoolExecutor threadPoolExecutor);
}
