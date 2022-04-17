import branch_control_learning.BranchControl_Learning
import functional_programming_learning.Functional_Programming_Learning
import input_or_output_learning.StdIn_Learning

object begin {
  def main(args: Array[String]): Unit = {
    /**
     * 调用object类，如果加()，则被调用；类必须实现apply方法，
     * 且默认调用
     */
    var_learning.Vars_Learning()
    StdIn_Learning()
    BranchControl_Learning(6)
    Functional_Programming_Learning()
  }
}
