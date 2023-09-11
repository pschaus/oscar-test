
import oscar.cp._
/**
 * n-queens model: place n-queens on a chess-board such that they don't attack each other.
 * this program search for all the solutions
 * Using Non Deterministic Search
 *
 * @author Pierre Schaus pschaus@gmail.com
 */
object Queens extends CPModel with App {

  val nQueens = 60 // Number of queens
  val Queens = 0 until nQueens

  // Variables
  val queens = Array.fill(nQueens)(CPIntVar.sparse(0, nQueens - 1))

  // Constraints

    add(allDifferent(queens),Weak)
    add(allDifferent(Queens.map(i => queens(i) + i)),Weak)
    add(allDifferent(Queens.map(i => queens(i) - i)),Weak)

  // Search heuristic
  search(binaryFirstFail(queens))

  search(binaryIdx(queens,minDom(queens),minVal(queens)))
  onSolution(println(queens.mkString(",")))
  // Execution
  val stats = start(1)

  println(stats)
}
