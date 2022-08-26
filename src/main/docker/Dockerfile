#
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

FROM registry.bizsaas.net/java:openjdk8-alpine-bash-cn
MAINTAINER breeze
ADD rocketmq-exporter-0.0.2-SNAPSHOT.jar rocketmq-exporter.jar
EXPOSE 5557
ENV JAVA_OPTS="-Xmx256m -Xss256k"
ENV NAMESRV_ADDR=nameserver:9876
CMD java -jar -Drocketmq.config.namesrvAddr=$NAMESRV_ADDR $JAVA_OPTS  rocketmq-exporter.jar
