/*
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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The hazelcast-set component is used to access Hazelcast distributed set.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastSetEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Hazelcast Set component.
     */
    public interface HazelcastSetEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedHazelcastSetEndpointConsumerBuilder advanced() {
            return (AdvancedHazelcastSetEndpointConsumerBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointConsumerBuilder defaultOperation(
                HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointConsumerBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a: <code>com.hazelcast.core.HazelcastInstance</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointConsumerBuilder hazelcastInstance(
                Object hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * <code>com.hazelcast.core.HazelcastInstance</code> type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointConsumerBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointConsumerBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default HazelcastSetEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default HazelcastSetEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Hazelcast Set component.
     */
    public interface AdvancedHazelcastSetEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default HazelcastSetEndpointConsumerBuilder basic() {
            return (HazelcastSetEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Hazelcast Set component.
     */
    public interface HazelcastSetEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedHazelcastSetEndpointProducerBuilder advanced() {
            return (AdvancedHazelcastSetEndpointProducerBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointProducerBuilder defaultOperation(
                HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointProducerBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a: <code>com.hazelcast.core.HazelcastInstance</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointProducerBuilder hazelcastInstance(
                Object hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * <code>com.hazelcast.core.HazelcastInstance</code> type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointProducerBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointProducerBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default HazelcastSetEndpointProducerBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default HazelcastSetEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Hazelcast Set component.
     */
    public interface AdvancedHazelcastSetEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default HazelcastSetEndpointProducerBuilder basic() {
            return (HazelcastSetEndpointProducerBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointProducerBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointProducerBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Hazelcast Set component.
     */
    public interface HazelcastSetEndpointBuilder
            extends
                HazelcastSetEndpointConsumerBuilder,
                HazelcastSetEndpointProducerBuilder {
        default AdvancedHazelcastSetEndpointBuilder advanced() {
            return (AdvancedHazelcastSetEndpointBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointBuilder defaultOperation(
                HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a: <code>com.hazelcast.core.HazelcastInstance</code>
         * type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointBuilder hazelcastInstance(
                Object hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * <code>com.hazelcast.core.HazelcastInstance</code> type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default HazelcastSetEndpointBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Hazelcast Set component.
     */
    public interface AdvancedHazelcastSetEndpointBuilder
            extends
                AdvancedHazelcastSetEndpointConsumerBuilder,
                AdvancedHazelcastSetEndpointProducerBuilder {
        default HazelcastSetEndpointBuilder basic() {
            return (HazelcastSetEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedHazelcastSetEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.hazelcast.HazelcastOperation</code>
     * enum.
     */
    enum HazelcastOperation {
        put,
        delete,
        get,
        update,
        query,
        getAll,
        clear,
        putIfAbsent,
        allAll,
        removeAll,
        retainAll,
        evict,
        evictAll,
        valueCount,
        containsKey,
        containsValue,
        keySet,
        removevalue,
        increment,
        decrement,
        setvalue,
        destroy,
        compareAndSet,
        getAndAdd,
        add,
        offer,
        peek,
        poll,
        remainingCapacity,
        drainTo,
        removeIf,
        take,
        publish,
        readOnceHeal,
        readOnceTail,
        capacity;
    }

    public interface HazelcastSetBuilders {
        /**
         * Hazelcast Set (camel-hazelcast)
         * The hazelcast-set component is used to access Hazelcast distributed
         * set.
         * 
         * Category: cache,datagrid
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-set:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         */
        default HazelcastSetEndpointBuilder hazelcastSet(String path) {
            return HazelcastSetEndpointBuilderFactory.hazelcastSet(path);
        }
    }
    /**
     * Hazelcast Set (camel-hazelcast)
     * The hazelcast-set component is used to access Hazelcast distributed set.
     * 
     * Category: cache,datagrid
     * Since: 2.7
     * Maven coordinates: org.apache.camel:camel-hazelcast
     * 
     * Syntax: <code>hazelcast-set:cacheName</code>
     * 
     * Path parameter: cacheName (required)
     * The name of the cache
     */
    static HazelcastSetEndpointBuilder hazelcastSet(String path) {
        class HazelcastSetEndpointBuilderImpl extends AbstractEndpointBuilder implements HazelcastSetEndpointBuilder, AdvancedHazelcastSetEndpointBuilder {
            public HazelcastSetEndpointBuilderImpl(String path) {
                super("hazelcast-set", path);
            }
        }
        return new HazelcastSetEndpointBuilderImpl(path);
    }
}