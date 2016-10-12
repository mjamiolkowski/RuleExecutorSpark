package com.jamiom
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan
import org.apache.spark.sql.catalyst.rules.Rule

/**
  * Created by mateusz on 12.10.16.
  */
class MySuperRule extends Rule[LogicalPlan]{
  override def apply(plan: LogicalPlan) = {
    println(s"mySuper plan")
    plan
  }
}
