// ˅
package behavioralPatterns.command

// ˄

// Command to paint a single point
class PaintingCommand(_paintingObject: PaintingTarget, _paintingPosX: Double, _paintingPosY: Double) extends Command {
  // ˅
  
  // ˄

  // Painting position x
  private val paintingPosX: Double = _paintingPosX

  // Painting position y
  private val paintingPosY: Double = _paintingPosY

  protected var paintingTarget: PaintingTarget = _paintingObject

  override def execute() = {
    // ˅
    paintingTarget.paint(paintingPosX, paintingPosY)
    // ˄
  }

  // ˅
  
  // ˄
}

// ˅

// ˄
