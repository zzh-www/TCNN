/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.spring.spi;

import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.ApplicationContext;

/**
 * Dependeny Injected Bean injector. 
 *
 * @version $Revision: 673477 $
 * @deprecated not used. Will be removed in Camel 2.0.
 */
public class BeanInjector extends BeanConfigurerSupport {

    public BeanInjector(ApplicationContext applicationContext) throws Exception {
        setBeanFactory(applicationContext);
        afterPropertiesSet();
    }

    public void inject(Object bean) {
        configureBean(bean);
    }
}
