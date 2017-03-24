/*
 * Licensed to Metamarkets Group Inc. (Metamarkets) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Metamarkets licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.druid.sql.calcite.view;

import io.druid.sql.calcite.planner.PlannerFactory;

import java.util.Map;

/**
 * View managers allow {@link io.druid.sql.calcite.schema.DruidSchema} to support views. They must be
 * thread-safe.
 */
public interface ViewManager
{
  void createView(final PlannerFactory plannerFactory, final String viewName, final String viewSql);

  void alterView(final PlannerFactory plannerFactory, final String viewName, final String viewSql);

  void dropView(final String viewName);

  Map<String, DruidViewMacro> getViews();
}