/**
 * (c) Copyright 2013 WibiData, Inc.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kiji.mapreduce.lib.graph;

import org.kiji.mapreduce.lib.avro.Node;

/**
 * Interface for classes that render Nodes.
 *
 * @param <OUTPUT> The type of the rendered output.
 */
public interface NodeRenderer<OUTPUT> {
  /**
   * Render the node into an OUTPUT object.
   *
   * @param node The node to be rendered.
   * @return The rendered output.
   */
  OUTPUT render(Node node);
}
