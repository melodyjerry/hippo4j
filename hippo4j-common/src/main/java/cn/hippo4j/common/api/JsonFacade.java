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

import java.util.List;

/**
 * Json facade.
 *
 * @author chen.ma
 * @date 2021/12/13 20:01
 */
public interface JsonFacade {

    /**
     * To JSON string.
     *
     * @param object
     * @return
     */
    String toJSONString(Object object);

    /**
     * Parse object.
     *
     * @param text
     * @param clazz
     * @param <T>
     * @return
     */
    <T> T parseObject(String text, Class<T> clazz);

    /**
     * Parse array.
     *
     * @param text
     * @param clazz
     * @param <T>
     * @return
     */
    <T> List<T> parseArray(String text, Class<T> clazz);
}
