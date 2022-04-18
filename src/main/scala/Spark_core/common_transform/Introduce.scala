package Spark_core.common_transform

object Introduce {
  /**
   * RDDs support two types of operations: transformations and actions
   * transformations：create a new dataset from an existing one
   * For example, map is a transformation that passes each dataset element through a function and
   * returns a new RDD representing the results.
   */

  /**
   * All transformations in Spark are lazy, in that they do not compute their results right away.
   * Instead, they just remember the transformations applied to some base dataset (e.g. a file).
   * The transformations are only computed when an action requires a result to be returned to the
   * driver program. This design enables Spark to run more efficiently.
   * By default, each transformed RDD may be recomputed each time you run an action on it. However,
   * you may also persist an RDD in memory using the persist (or cache) method, in which case Spark
   * will keep the elements around on the cluster for much faster access the next time you query it.
   * There is also support for persisting RDDs on disk, or replicated across multiple nodes.
   */
}
